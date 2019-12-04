package com.kheuch.library.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustermerDao extends JpaRepository<Customer, Integer>{
	
	public Customer findCustomerByEmail (String email);

}
