package com.kheuch.library.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	
	    @Id
	    @Column(name="Code")
	    private String code;
	    
	    @Column(name="Label",nullable = false)
	    private String label;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public Category(String code, String label) {
			super();
			this.code = code;
			this.label = label;
		}

		public Category() {
			super();
			
		}

	    
	    
}
