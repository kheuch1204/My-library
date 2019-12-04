package com.kheuch.library.loan;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import com.kheuch.library.book.Book;
import com.kheuch.library.customer.Customer;

@Embeddable
public class LoanId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7370620512070000237L;

	@ManyToOne
	private Book book;
    
	@ManyToOne
    private Customer customer;
    
	@Column(name="Creation_Date_Time")
    private LocalDateTime creationDateTime;

}
