package com.lendapp.model;

import lombok.Data;

@Data
public class Customer {
    private Integer id;
    private String name;
    private Double eligibleAmount;
    private Double walletBalance;
    private String currency;
    private String phone;
}
