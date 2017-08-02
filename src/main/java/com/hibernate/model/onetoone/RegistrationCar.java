package com.hibernate.model.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_CAR")
public class RegistrationCar {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long registrationNo;
	private String ownerName;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="regCar")
	private RegistrationDetail regDetail;

	public Long getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(Long registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public RegistrationDetail getRegDetail() {
		return regDetail;
	}

	public void setRegDetail(RegistrationDetail regDetail) {
		this.regDetail = regDetail;
	}

}
