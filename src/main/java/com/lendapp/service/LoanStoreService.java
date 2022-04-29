package com.lendapp.service;

import com.lendapp.model.*;

import java.util.HashMap;
import java.util.List;

public interface LoanStoreService {
    List<LoanProduct> getLoanOffer(String customerid, String productid);
    List<Wallet> getSaveLoanOffer(String customerid, String productid);
    HashMap loans(Loans loans);
    HashMap loanStore(LoanStore loanStore);
    HashMap wallet(Wallet wallet);
    List<Loans> getRepaymentHistory(Integer customerId, Integer loanStoreId, Double repayment);
}
