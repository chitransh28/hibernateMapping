package com.hibernate.model.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="T_CAR_DETAIL")
public class RegistrationDetail {

	private static final long serialVersionUID = 1L;
	
	@GenericGenerator(name="generator",strategy="foreign",parameters=@Parameter(name="property",value="regCar"))
	@Id
	@GeneratedValue(generator="generator")
	private Long registrationNo;
	
	@OneToOne
	private RegistrationCar regCar;
	private String companyName;
	private String model;
	private String remark;
	public Long getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(Long registrationNo) {
		this.registrationNo = registrationNo;
	}
	public RegistrationCar getRegCar() {
		return regCar;
	}
	public void setRegCar(RegistrationCar regCar) {
		this.regCar = regCar;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
