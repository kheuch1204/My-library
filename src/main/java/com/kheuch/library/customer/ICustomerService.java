package com.kheuch.library.customer;

import java.util.Optional;

public interface ICustomerService {
	
	
    public Customer saveCustomer(Customer customer);
    
    public Customer updateCustomer(Customer customer);
    
    public void deleteCustomer(Integer id);
    
    public Optional<Customer> findCustomerById(Integer id);
    
    public boolean checkIfIdexists(Integer id);
    
    public Customer findCustomerByEmail(String email);
    

}
