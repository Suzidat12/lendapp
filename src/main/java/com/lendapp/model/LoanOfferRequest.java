package com.lendapp.model;

public class LoanOfferRequest {

    private CustomerStore customerid;

    private LoanProduct loanproductid;

    public CustomerStore getCustomerid() {
        return customerid;
    }

    public void setCustomerid(CustomerStore customerid) {
        this.customerid = customerid;
    }

    public LoanProduct getLoanproductid() {
        return loanproductid;
    }

    public void setLoanproductid(LoanProduct loanproductid) {
        this.loanproductid = loanproductid;
    }



}
