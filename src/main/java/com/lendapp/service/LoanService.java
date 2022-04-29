package com.lendapp.service;

import com.lendapp.model.*;
import com.lendapp.model.request.CustomerRequest;
import com.lendapp.model.request.RepaymentRequest;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface LoanService {
    ResponseEntity listCustomers();
    ResponseEntity registerCustomer(CustomerRequest customer);
    ResponseEntity requestLoan(Integer customerId, Integer productId);
    ResponseEntity retrieveBalanceByCustomer(Integer customerId);
    ResponseEntity addLoanRepayment(RepaymentRequest repaymentRequest);
    ResponseEntity listLoanRepaymentByCustomer(Integer customerId);
    ResponseEntity checkLoanEligibilityStatus(Integer customerId);

    ResponseEntity listLoanProducts();

}
