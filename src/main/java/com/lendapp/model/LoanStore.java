package com.lendapp.model;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.Date;

public class LoanStore {

    private Customer customer;
    private LoanProduct loanProduct;
    private Date transdate;
    private Boolean status;

    public LoanStore(Customer customer, LoanProduct loanProduct, Date transdate, Boolean status) {
        this.customer = customer;
        this.loanProduct = loanProduct;
        this.transdate = transdate;
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LoanProduct getLoanProduct() {
        return loanProduct;
    }

    public void setLoanProduct(LoanProduct loanProduct) {
        this.loanProduct = loanProduct;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
