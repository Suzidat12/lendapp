package com.lendapp.model;

public class LoanStoreHolder {
    private Double qualifyfor;
    private Boolean available;
    private Double amountdue;
    private LoanStore loanStore;

    public LoanStoreHolder(Double qualifyfor, Boolean available, Double amountdue, LoanStore loanStore) {
        this.qualifyfor = qualifyfor;
        this.available = available;
        this.amountdue = amountdue;
        this.loanStore = loanStore;
    }

    public Double getQualifyfor() {
        return qualifyfor;
    }

    public void setQualifyfor(Double qualifyfor) {
        this.qualifyfor = qualifyfor;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getAmountdue() {
        return amountdue;
    }

    public void setAmountdue(Double amountdue) {
        this.amountdue = amountdue;
    }

    public LoanStore getLoanStore() {
        return loanStore;
    }

    public void setLoanStore(LoanStore loanStore) {
        this.loanStore = loanStore;
    }
}
