package com.lendapp.serviceImpl;

import com.lendapp.model.*;
import com.lendapp.service.LoanStoreService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoanStoreServiceimpl implements LoanStoreService {

    @Override
    public HashMap loans(Loans loans){
        HashMap<Integer,Loans> loanslist = new HashMap();

        loans.setCustomerStore(loans.getCustomerStore());
        loans.setWalletList(loans.getWalletList());
        loanslist.put(loans.getId(), loans);
        return loanslist;
    }

    @Override
    public HashMap loanStore(LoanStore loanStore) {
        HashMap<Integer,LoanStore> loanstorelist = new HashMap();

        loanStore.setId(loanStore.getId());
        loanStore.setRepaymentHistoryList(loanStore.getRepaymentHistoryList());
        loanStore.setLoanProduct(loanStore.getLoanProduct());
        loanStore.setTransdate(new Date());
        loanStore.setStatus(true);
        loanstorelist.put(loanStore.getId(), loanStore);
        return loanstorelist;
    }

    @Override
    public HashMap wallet(Wallet wallet){
        HashMap<Integer, Wallet> walletlist=new HashMap();
        HashMap<Integer, List<Wallet>> loanslist=new HashMap();
        List<LoanProduct> productList = new ArrayList<>();
        List<CustomerStore> customerList = new ArrayList<>();
        List<Wallet> walletList = new ArrayList<>();
        LoanProduct product = productList.get(0);
        CustomerStore customerStore = customerList.get(0);

        wallet.setId(wallet.getId());
        wallet.setAmount(customerStore.getAmount());
        wallet.setLoanStoreList(wallet.getLoanStoreList());
        wallet.setAmountdue(product.getAmount());
        wallet.setMaxLoanAmount(wallet.getMaxLoanAmount());
        wallet.setBalance(wallet.getBalance());
        walletList.add(wallet);
        loanslist.put(walletList.size(), walletList);
        return loanslist;
    }

    @Override
    public List<LoanProduct> getLoanOffer(String customerid, String productid) {
        HashMap<Integer, CustomerStore> customerStore = new HashMap();
        HashMap<Integer, LoanProduct> productStore = new HashMap();
        List<LoanProduct> loanProducts = new ArrayList<>();
        if (!customerStore.containsKey(customerid)) {
            System.out.println("Customer does not exist");
        }else{
                CustomerStore mycustomer = customerStore.get(customerid);

                for (LoanProduct lp : productStore.values()) {
                    if (lp.getAmount() <= mycustomer.getAmount()) {
                        loanProducts.add(lp);
                    }

                }

            }
            return loanProducts;
        }

    @Override
        public List<Wallet> getSaveLoanOffer(String customerid, String productid){
            HashMap<Integer, CustomerStore> customerlist = new HashMap();
            HashMap<Integer,LoanProduct> prodctlist = new HashMap();
            HashMap<Integer, Wallet> walletlist = new HashMap();
            HashMap<Integer, LoanStore> loanStorelist = new HashMap();
            List<Wallet> listwallet= new ArrayList<>();
            if(!customerlist.containsKey(customerid) && !prodctlist.containsKey(productid)){
                System.out.println("Customer and Product does not exist");
            }else{
                CustomerStore customerStore =customerlist.get(customerid);
                LoanProduct loanProduct=prodctlist.get(productid);
                for(Wallet rs: walletlist.values()){
                    if(walletlist.containsKey(customerid)){
                        if(rs.getBalance()> loanProduct.getAmount()){
                            System.out.println("Balance is more than the product");
                        }
                        LoanStore loanStore= new LoanStore();
                        loanStore.setId(loanStore.getId());
                        loanStore.setTransdate(new Date());
                        loanStore.setStatus(true);
                        loanStore.setLoanProduct(loanProduct);
                       loanStorelist.put(loanStore.getId(),loanStore);

                    }

                }
                if(loanProduct.getAmount()> customerStore.getAmount()){
                    System.out.println("Not qualified for loan");
                }else {
                    Wallet wallet = new Wallet();
                    wallet.setBalance(wallet.getAmount()+wallet.getAmountdue()-wallet.getMaxLoanAmount());
                    listwallet.add(wallet);
                }
                }
        return listwallet;
    }

        public List<Loans> getRepaymentHistory(Integer customerId, Integer loanStoreId, Double repayment){
            List<Loans> loans = new ArrayList<>();

            HashMap<Integer, Wallet> walletlist = new HashMap();
            HashMap<Integer, CustomerStore> customerlist= new HashMap();
            HashMap<Integer, RepaymentHistory> repaymentlist= new HashMap();
           HashMap<Integer,LoanStore> loanstorelist= new HashMap();
           List<LoanStore> storeList = new ArrayList<>();
            List<RepaymentHistory> repaylist= new ArrayList<>();
            List<Loans> loansList = new ArrayList<>();
            CustomerStore customerStore = customerlist.get(0);
            LoanStore loanStore = loanstorelist.get(0);
            Wallet wallet = walletlist.get(0);
            wallet.setAmountdue(customerStore.getAmount());
            wallet.setBalance(wallet.getAmount());
            walletlist.get(customerStore);
          for(Loans rs: loansList){
//              rs.setId(customerStore.getId());
             if ( rs.getId() == customerId && rs.getId() == loanStoreId) {
                 loans.add(rs);
                 RepaymentHistory repaymentHistory = new RepaymentHistory();
                 repaymentHistory.setAmount(repayment);
                 repaymentHistory.setDate(new Date());
                 if(wallet.getLoanStoreList().isEmpty()){
                     List<LoanStore> loanstore = new ArrayList<>();
                     LoanStore ln = new LoanStore();
                     List<RepaymentHistory> repay = new ArrayList<>();
                     repay.add(repaymentHistory);
                     ln.setRepaymentHistoryList(repay);
                     loanStore.setRepaymentHistoryList(repay);


                 }else{
                     List<RepaymentHistory> repaymt = new ArrayList<>();
                     repaymt = loanStore.getRepaymentHistoryList();
                     repaymt.add(repaymentHistory);

                 }

             }

          }
        return loansList;
        }
    }
