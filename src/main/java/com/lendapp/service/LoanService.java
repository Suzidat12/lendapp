package com.lendapp.service;

import com.lendapp.model.LoanProduct;

import java.util.List;

public interface LoanService {
    List<LoanProduct> getLoanOffer(String customerid, String productid);
    void getSaveLoanOffer(String customerid, String productid);
}
