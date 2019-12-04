package com.kheuch.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kheuch.library.customer.Customer;

@SpringBootApplication
public class MyLibrary {

	public static void main(String[] args) {
		SpringApplication.run(MyLibrary.class, args);
		
		Customer customer1 = new Customer();
		customer1.setAddress("4 rue du Bourbon");
		customer1.setEmail("kheus1990@gmail.com");
		
		MailSender envoi = new MailSender();
		
		envoi.sendmail();
	}

}
