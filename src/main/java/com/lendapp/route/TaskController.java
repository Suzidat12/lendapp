/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lendapp.route;

import com.lendapp.model.*;
import com.lendapp.model.request.CustomerRequest;
import com.lendapp.model.request.RepaymentRequest;
import com.lendapp.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author OLASUNKANMI
 */
@RestController
@RequestMapping("/task")
public class TaskController {

  @Autowired
  LoanService loanService;


  @PostMapping("/customer/register")
  public ResponseEntity registerCustomer(@RequestBody CustomerRequest customer) {
    return loanService.registerCustomer(customer);
  }
  @PostMapping("/customer/list")
  public ResponseEntity listCustomer() {
    return loanService.listCustomers();
  }

  @GetMapping("/product/list")
  public ResponseEntity listLoanProducts(){
    return loanService.listLoanProducts();
  }

  @GetMapping("/loan/list")
 public ResponseEntity requestLoan(@RequestParam Integer customerId, @RequestParam Integer productId) {
    return loanService.requestLoan(customerId, productId);
  }
  @GetMapping("/loan/retrieveBalance")
 public ResponseEntity retrieveBalanceByCustomer(@RequestParam Integer customerId){
    return loanService.retrieveBalanceByCustomer(customerId);
  }
@PostMapping("/loan/repayment")
  public ResponseEntity addLoanRepayment(@RequestParam RepaymentRequest repaymentRequest){
    return loanService.addLoanRepayment(repaymentRequest);
}
@GetMapping("/loan/repaymentByCustomer")
  public ResponseEntity listLoanRepaymentByCustomer(@RequestParam Integer customerId){
    return loanService.listLoanRepaymentByCustomer(customerId);
}
@GetMapping("/loan/check")
  ResponseEntity checkLoanEligibilityStatus(@RequestParam Integer customerId){
    return loanService.checkLoanEligibilityStatus(customerId);
}
}
