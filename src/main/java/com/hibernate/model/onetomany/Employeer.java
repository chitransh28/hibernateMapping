package com.hibernate.model.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_Employeer")
public class Employeer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeerID;
	private String employeerName;
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "companyId")
	private Company company;
	
	public Employeer(){
		
	}

	public Employeer(Long employeerID, String employeerName, String type, Company company) {
		super();
		this.employeerID = employeerID;
		this.employeerName = employeerName;
		this.type = type;
		this.company = company;
	}

	public Long getEmployeerID() {
		return employeerID;
	}

	public void setEmployeerID(Long employeerID) {
		this.employeerID = employeerID;
	}

	public String getEmployeerName() {
		return employeerName;
	}

	public void setEmployeerName(String employeerName) {
		this.employeerName = employeerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	

}
