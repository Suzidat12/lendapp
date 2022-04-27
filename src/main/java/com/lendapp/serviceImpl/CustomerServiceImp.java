package com.lendapp.serviceImpl;

import com.lendapp.model.Customer;
import com.lendapp.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CustomerServiceImp implements CustomerService {
   public HashMap customerStore(){
       HashMap<Integer,Customer> customerStore = new HashMap();
       Customer customer = new Customer(1,"Nana Addo",150.00,"$");
       customerStore.put(customer.getId(),customer);
       customer = new Customer(2,"Yahya Jameh ",85.00,"$");
       customerStore.put(customer.getId(),customer);
       customer = new Customer(3,"Joao Luorenco",40.00,"$");
       customerStore.put(customer.getId(),customer);
       customer = new Customer(4,"Filipe Nyusi",15.00,"$");
       return customerStore;
   }
}
