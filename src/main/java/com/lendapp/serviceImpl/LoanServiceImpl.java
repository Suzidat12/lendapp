package com.lendapp.serviceImpl;

import com.lendapp.model.*;
import com.lendapp.model.request.CustomerRequest;
import com.lendapp.model.request.RepaymentRequest;
import com.lendapp.service.CustomerService;
import com.lendapp.service.LoanService;
import com.lendapp.service.ProductService;
import io.swagger.models.Response;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    @NonNull
    private ProductService productService;
    @NonNull
    private CustomerService customerService;
   HashMap<Integer,LoanStore> loanStoreHashMap = new HashMap();

    @Override
    public ResponseEntity listLoanProducts(){
        return ResponseEntity.ok(new LinkedList<>(productService.listProducts().values()));
    }

    @Override
    public ResponseEntity listCustomers() {
        return customerService.listCustomers();
    }

    @Override
    public ResponseEntity registerCustomer(CustomerRequest customer) {
        return customerService.registerCustomer(customer);
    }

    @Override
    public ResponseEntity requestLoan(Integer customerId, Integer productId) {
        Optional<Wallet> walletOptional = customerService.getWalletByCustomer(customerId);
        Optional<Product> productOptional = productService.findProductById(productId);
        return null;
    }

    @Override
    public ResponseEntity retrieveBalanceByCustomer(Integer customerId) {
        Optional<Wallet> walletOptional = customerService.getWalletByCustomer(customerId);
        if(walletOptional.isEmpty())
            return new ResponseEntity("Record not found", HttpStatus.NOT_FOUND);

        return ResponseEntity.ok(walletOptional.get());
    }
private LoanStore findSingleLoan(List<LoanStore> loanStoreList, Integer loanId){
     for(LoanStore record:loanStoreList){
         if(record.getId()==loanId){
             return record;
         }
     }
     return null;
}
    @Override
    public ResponseEntity addLoanRepayment(RepaymentRequest repaymentRequest) {
        Optional<Wallet> walletOptional = customerService.getWalletByCustomer(repaymentRequest.getCustomerId());
        if(walletOptional.isEmpty())
            return new ResponseEntity("Record not found", HttpStatus.NOT_FOUND);
        Wallet wallet = walletOptional.get();
        if(wallet.getLoanStoreList()==null || wallet.getLoanStoreList().isEmpty())
            return new ResponseEntity("Loan history not available", HttpStatus.NOT_FOUND);
        List<LoanStore> loanStoreListToRemove= new LinkedList<>(wallet.getLoanStoreList());
        List<LoanStore> loanStoreList = wallet.getLoanStoreList();
        LoanStore loanStore = findSingleLoan(loanStoreList, repaymentRequest.getLoanId());
        loanStoreListToRemove.remove(loanStore);
        if(loanStore==null)
            return new ResponseEntity("Loan not available for the specified Id",
                    HttpStatus.NOT_FOUND);
        List<RepaymentHistory> repaymentHistoryList = loanStore.getRepaymentHistoryList()==null?new ArrayList<>():loanStore.getRepaymentHistoryList();
        repaymentHistoryList.add(new RepaymentHistory(repaymentRequest.getAmount(), new Date()));
        wallet.setAmountDue(wallet.getAmountDue()-repaymentRequest.getAmount());
        wallet.setEligibleBalance(wallet.getMaxLoanAmount()-wallet.getAmountDue());
        loanStore.setRepaymentHistoryList(repaymentHistoryList);
        loanStoreListToRemove.add(loanStore);
        customerService.updateWallet(wallet);
        return ResponseEntity.ok("Repayment successful");
    }

    @Override
    public ResponseEntity listLoanRepaymentByCustomer(Integer customerId) {

       return null;
    }

    @Override
    public ResponseEntity checkLoanEligibilityStatus(Integer customerId) {

        return null;
    }





    }
