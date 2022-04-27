package com.lendapp.serviceImpl;

import com.lendapp.model.Customer;
import com.lendapp.model.LoanOfferRequest;
import com.lendapp.model.LoanProduct;
import com.lendapp.service.LoanService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class LoanServiceimpl implements LoanService {
    public List<LoanProduct> getLoanOffer(String customerid, String productid) {
        HashMap<Integer, Customer> customerStore = new HashMap();
        HashMap<Integer, LoanProduct> productStore = new HashMap();
        List<LoanProduct> loanProducts = new ArrayList<>();
        if (!customerStore.containsKey(customerid)) {
            System.out.println("Customer does not exist");
        }else{
                Customer mycustomer = customerStore.get(customerid);

                for (LoanProduct lp : productStore.values()) {
                    if (lp.getAmount() <= mycustomer.getAmount()) {
                        loanProducts.add(lp);
                    }

                }

            }
            return loanProducts;
        }

        public void getSaveLoanOffer(String customerid, String productid){
            HashMap<Integer, Customer> customerlist = new HashMap();
            HashMap<Integer,LoanProduct> prodctlist = new HashMap();

            if(!customerlist.containsKey(customerid) && !prodctlist.containsKey(productid)){
                System.out.println("Customer and Product does not exist");
            }else{
                Customer customer=customerlist.get(customerid);

            }
        }
    }
