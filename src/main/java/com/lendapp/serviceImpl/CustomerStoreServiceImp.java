package com.lendapp.serviceImpl;

import com.lendapp.model.CustomerStore;
import com.lendapp.service.CustomerStoreService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CustomerStoreServiceImp implements CustomerStoreService {
    @Override
   public HashMap customerStore(CustomerStore customer){
       HashMap<Integer, CustomerStore> customerStore = new HashMap();

        customer.setId(customer.getId());
        customer.setName(customer.getName());
        customer.setAmount(customer.getAmount());
        customer.setCurrency(customer.getCurrency());
        customer.setAddress(customer.getAddress());
        customer.setPhone(customer.getPhone());
        customer.setEmail(customer.getEmail());
        customer.setPassword(customer.getPassword());
        customerStore.put(customer.getId(), customer);
       return customerStore;
   }
}
