package com.lendapp.model;

import lombok.Data;

import java.util.List;
@Data
public class Loans {
    private Integer id;
    private Customer customer;
    private List<Wallet> walletList;


}
