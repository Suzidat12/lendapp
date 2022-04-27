package com.lendapp.model;

public class LoanOfferRequest {
    public LoanOfferRequest(Customer customerid, LoanProduct loanproductid) {
        this.customerid = customerid;
        this.loanproductid = loanproductid;
    }

    private Customer customerid;



    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public LoanProduct getLoanproductid() {
        return loanproductid;
    }

    public void setLoanproductid(LoanProduct loanproductid) {
        this.loanproductid = loanproductid;
    }

    private LoanProduct loanproductid;

}
