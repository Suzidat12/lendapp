/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lendapp.route;

import com.lendapp.model.*;
import com.lendapp.service.CustomerStoreService;
import com.lendapp.service.LoanProductStoreService;
import com.lendapp.service.LoanStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author OLASUNKANMI
 */
@RestController
@RequestMapping("/task")
public class TaskController {
  @Autowired
  CustomerStoreService customerStoreService;
  @Autowired
  LoanStoreService loanStoreService;
  @Autowired
  LoanProductStoreService loanProductStoreService;

  @PostMapping("/add/customerStore")
  public HashMap customerStore(@RequestBody CustomerStore customer) {
    return customerStoreService.customerStore(customer);
  }

  @GetMapping("/list/loanProductStore")
  public HashMap loanProductStore(){
    return loanProductStoreService.loanProductStore();
  }

  @PostMapping("/add/loans")
  public HashMap loans(@RequestBody Loans loans){
    return loanStoreService.loans(loans);
  }

  @PostMapping("/loansStore")
  public HashMap loanStore(@RequestBody LoanStore loanStore){
    return loanStoreService.loanStore(loanStore);
  }

  @PostMapping("/add/wallet")
  public HashMap Wallet(@RequestBody Wallet wallet){
    return loanStoreService.wallet(wallet);
  }

  @GetMapping ("/saveLoan")
  public List<Wallet> getSaveLoanOffer(@RequestParam String customerid,  @RequestParam String productid){
    return loanStoreService.getSaveLoanOffer(customerid, productid);
  }
  @PostMapping("/getLoan")
 public List<LoanProduct> getLoanOffer(@RequestParam String customerid, @RequestParam String productid){
    return loanStoreService.getLoanOffer(customerid, productid);
  }

  @PostMapping("/getRepayment")
  public List<Loans> getRepaymentHistory(Integer customerId, Integer loanStoreId, Double repayment){
    return loanStoreService.getRepaymentHistory(customerId, loanStoreId, repayment);
  }

}
