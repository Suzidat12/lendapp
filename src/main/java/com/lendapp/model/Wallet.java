package com.lendapp.model;

import java.util.List;

public class Wallet {
    private Integer id;
    private Double maxLoanAmount;
    private Double balance;
    private Double amountdue;
    private Double amount;
    private List<LoanStore> loanStoreList;
    private CustomerStore customerStore;


    public Double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(Double maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmountdue() {
        return amountdue;
    }

    public void setAmountdue(Double amountdue) {
        this.amountdue = amountdue;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<LoanStore> getLoanStoreList() {
        return loanStoreList;
    }

    public void setLoanStoreList(List<LoanStore> loanStoreList) {
        this.loanStoreList = loanStoreList;
    }

    public CustomerStore getCustomerStore() {
        return customerStore;
    }

    public void setCustomerStore(CustomerStore customerStore) {
        this.customerStore = customerStore;
    }
}
