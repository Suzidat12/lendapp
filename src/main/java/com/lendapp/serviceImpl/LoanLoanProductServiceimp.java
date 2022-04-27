package com.lendapp.serviceImpl;

import com.lendapp.model.LoanProduct;
import com.lendapp.service.LoanProductService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class LoanLoanProductServiceimp implements LoanProductService {
    public HashMap loanProductStore(){
        HashMap<Integer,LoanProduct>productStore = new HashMap();
        LoanProduct loanProduct = new LoanProduct(100.0,1,12.5,30,"yearly",12.5,"$");
        productStore.put(loanProduct.getId(), loanProduct);
        loanProduct = new LoanProduct(50.0,2,5.0,15,"monthly",10.0,"$");
        productStore.put(loanProduct.getId(), loanProduct);
        loanProduct = new LoanProduct(25.0,3,1.88,4,"yearly",7.5,"$");
        productStore.put(loanProduct.getId(), loanProduct);


        return productStore;
    }
}
