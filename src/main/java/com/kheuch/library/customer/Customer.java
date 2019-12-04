package com.kheuch.library.customer;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.kheuch.library.loan.LoanId;


@Entity
@Table (name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Custome_Id")
    private Integer id;
    
	@Column(name="First_Name", nullable = false)
    private String firstName;
    
	@Column(name="Last_name", nullable = false)
    private String lastName;
    
	@Column(name="Job")
    private String job;
    
	@Column(name="Adresse")
    private String address;
    
	@Column(name="Email", nullable = false, unique = true)
    private String email;
    
	@Column(name="Creation_Date", nullable = false)
    private LocalDate creationDate;
    
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.customer", cascade = CascadeType.ALL)
    Set<LoanId> loans = new HashSet<LoanId>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Set<LoanId> getLoans() {
		return loans;
	}

	public void setLoans(Set<LoanId> loans) {
		this.loans = loans;
	}

	public Customer(String firstName, String lastName, String job, String address, String email, LocalDate creationDate,
			Set<LoanId> loans) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.address = address;
		this.email = email;
		this.creationDate = creationDate;
		this.loans = loans;
	}

	public Customer() {
		super();
		
	}

	
	
}
