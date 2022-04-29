package com.lendapp.model.request;

import lombok.Data;

@Data
public class CustomerRequest {
    private String name;
    private Double eligibleAmount;
    private Double walletBalance;
    private String phone;
}
