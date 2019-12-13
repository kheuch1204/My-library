package com.kheuch.library.customer;

import java.util.Optional;

public interface ICustomerService {
	
	
    Customer saveCustomer(Customer customer);
    
    Customer updateCustomer(Customer customer);
    
    void deleteCustomer(Integer id);
    
    Optional<Customer> findCustomerById(Integer id);
    
    boolean checkIfIdexists(Integer id);
    
    Customer findCustomerByEmail(String email);
    

}
