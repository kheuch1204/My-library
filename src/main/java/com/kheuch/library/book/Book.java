package com.kheuch.library.book;

import java.io.Serializable;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.kheuch.library.category.Category;
import com.kheuch.library.loan.LoanId;


@Entity
@Table(name="Book")
public class Book implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Book_Id")
	private Integer id;

	@Column(name="title", nullable = false)
    private String title;
	
    @Column(name="ISBN",nullable = false, unique = true)
    private String isbn;
    
    @Column(name="Release_Date", nullable = false)
    private LocalDate releaseDate;
    
    @Column(name="Registre_Date", nullable = false)
    private LocalDate registerDate;
    
    @Column(name="Total_Exemplaires")
    private Integer totalExamplaries;
    
    @Column(name="Author")
    private String author;
   
    @ManyToOne
    @JoinColumn(name="Cat_code",referencedColumnName = "code")
    private Category category;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.book", cascade = CascadeType.ALL)
    Set<LoanId> loans = new HashSet<LoanId>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public Integer getTotalExamplaries() {
		return totalExamplaries;
	}

	public void setTotalExamplaries(Integer totalExamplaries) {
		this.totalExamplaries = totalExamplaries;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<LoanId> getLoans() {
		return loans;
	}

	public void setLoans(Set<LoanId> loans) {
		this.loans = loans;
	}

	public Book(String title, String isbn, LocalDate releaseDate, LocalDate registerDate, Integer totalExamplaries,
			String author, Category category, Set<LoanId> loans) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.releaseDate = releaseDate;
		this.registerDate = registerDate;
		this.totalExamplaries = totalExamplaries;
		this.author = author;
		this.category = category;
		this.loans = loans;
	}

	public Book() {
		super();
		
	}
    
    
    

}
