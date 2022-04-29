package com.lendapp.model;

import java.util.List;

public class Loans {
    private Integer id;
    private CustomerStore customerStore;
    private List<Wallet> walletList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public CustomerStore getCustomerStore() {
        return customerStore;
    }

    public void setCustomerStore(CustomerStore customerStore) {
        this.customerStore = customerStore;
    }

    public List<Wallet> getWalletList() {
        return walletList;
    }

    public void setWalletList(List<Wallet> walletList) {
        this.walletList = walletList;
    }
}
