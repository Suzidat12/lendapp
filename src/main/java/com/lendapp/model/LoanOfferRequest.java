package com.lendapp.model;

public class LoanOfferRequest {

    private Customer customerid;

    private Product loanproductid;

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Product getLoanproductid() {
        return loanproductid;
    }

    public void setLoanproductid(Product loanproductid) {
        this.loanproductid = loanproductid;
    }



}
