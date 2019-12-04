package com.kheuch.library.loan;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.AssociationOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Loan")
@AssociationOverride(name="pk.book", joinColumns = @JoinColumn(name="Book_Id"))
@AssociationOverride(name="pk.customer",joinColumns = @JoinColumn(name="Customer_Id"))
public class Loan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
    private LoanId pk = new LoanId();
	
    
	@Column(name="Begin_Date")
    private LocalDate beginDate;
    
	@Column(name="End_Date")
    private LocalDate endDate;
    
	@Enumerated(EnumType.STRING)
    private LoanStatus status;

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	public LoanStatus getStatus() {
		return status;
	}

	public void setStatus(LoanStatus status) {
		this.status = status;
	}

	public Loan(LocalDate beginDate, LocalDate endDate, LoanStatus status) {
		super();
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.status = status;
	}

	public Loan() {
		super();
		
	}

	
	
	
}
