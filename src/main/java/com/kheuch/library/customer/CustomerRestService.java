package com.kheuch.library.customer;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/customer/api")
public class CustomerRestService {
	
	public static final Logger logger = LoggerFactory.getLogger(CustomerRestService.class);
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> createNewCustomer(@RequestBody Customer customerDTORequest){
		
		Customer existingCustomer = customerService.findCustomerByEmail(customerDTORequest.getEmail());
		
		if (existingCustomer != null) {
			return new ResponseEntity<Customer>(HttpStatus.CONFLICT);
		}
		Customer customerRequest = new Customer() ;
		customerRequest.setCreationDate(LocalDate.now());
		Customer customerReponse = customerService.saveCustomer(customerRequest);
		if(customerReponse != null) {
			Customer customerDTO = new Customer();
			return new ResponseEntity<Customer>(customerDTO, HttpStatus.CREATED);
		}
		return new ResponseEntity<Customer>(HttpStatus.NOT_MODIFIED);
		
	}

}
