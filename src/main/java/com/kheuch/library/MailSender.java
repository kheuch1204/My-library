package com.kheuch.library;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.kheuch.library.customer.Customer;

public class MailSender {

	
	private JavaMailSender javaMailSender;
	private SimpleMailMessage message;
	private Customer destinataire = new Customer();
	
	public void sendmail() throws MailException {
		
		
		message.setSubject("Envoie de mon premier message");
		message.setText("Ceci est un message de test");
		message.setTo(destinataire.getEmail());
		
		javaMailSender.send(message);
		
	}
}
