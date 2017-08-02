package com.hibernate.model.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_Company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long companyID;
	private String name;
	private String owner;
	private String address;
	
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Employeer> employeer = new ArrayList<Employeer>();
	
	public Company(){
		
	}

	public Company(Long companyID, String name, String owner, String address) {
		super();
		this.companyID = companyID;
		this.name = name;
		this.owner = owner;
		this.address = address;
	}

	public Long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employeer> getEmployeer() {
		return employeer;
	}

	public void setEmployeer(List<Employeer> employeer) {
		this.employeer = employeer;
	}
	

}
