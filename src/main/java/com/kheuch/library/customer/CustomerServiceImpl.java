package com.kheuch.library.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustermerDao customerDao;

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerDao.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customerDao.save(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerDao.deleteById(id);
		
	}

	@Override
	public Optional<Customer> findCustomerById(Integer id) {
		
		return customerDao.findById(id);
	}

	@Override
	public boolean checkIfIdexists(Integer id) {
		
		return customerDao.existsById(id);
	}

	@Override
	public Customer findCustomerByEmail(String email) {
		
		return customerDao.findCustomerByEmail(email);
	}

}
