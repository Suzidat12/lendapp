package com.lendapp.service;

import com.lendapp.model.Customer;
import com.lendapp.model.Wallet;
import com.lendapp.model.request.CustomerRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    ResponseEntity listCustomers();
    ResponseEntity registerCustomer(CustomerRequest customer);
    Optional<Wallet> getWalletByCustomer(Integer id);
    ResponseEntity listLoans();
    void updateWallet(Wallet wallet);
}
