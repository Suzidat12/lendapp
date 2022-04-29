package com.lendapp.model;



import java.util.Date;
import java.util.List;

public class LoanStore {
    private Integer id;
    private List<RepaymentHistory> repaymentHistoryList;
    private LoanProduct loanProduct;
    private Date transdate;
    private Boolean status;


    public List<RepaymentHistory> getRepaymentHistoryList() {
        return repaymentHistoryList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRepaymentHistoryList(List<RepaymentHistory> repaymentHistoryList) {
        this.repaymentHistoryList = repaymentHistoryList;
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
