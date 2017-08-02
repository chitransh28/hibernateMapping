package com.hibernate.model.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.util.HibernateHelper;

public class RegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate one to one (Annotation)");
		SessionFactory sf = HibernateHelper.getSessionFactory();
		Session session =sf.openSession();

		session.beginTransaction();
		RegistrationCar regCar =  new RegistrationCar();
		regCar.setOwnerName("Dave");
		
		
		RegistrationDetail regDetail = new RegistrationDetail();
		regDetail.setCompanyName("Ford");
		regDetail.setModel("Focus");
		regDetail.setRemark("Sedan");
		
		regDetail.setRegCar(regCar);
		regCar.setRegDetail(regDetail);
		
		session.save(regCar);
		
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
