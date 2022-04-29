package com.lendapp.model.request;

import lombok.Data;

@Data
public class RepaymentRequest {
    private Integer customerId;
    private Integer loanId;
    private Double amount;
}
