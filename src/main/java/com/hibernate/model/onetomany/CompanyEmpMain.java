package com.hibernate.model.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.util.HibernateHelper;


public class CompanyEmpMain {

	public static void main(String[] args) {
		SessionFactory sf = HibernateHelper.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Company comp = new Company();
		comp.setName("JNIT");
		comp.setOwner("sudheer");
		comp.setAddress("Lewisville, TX");
		
		Employeer emp1 = new Employeer();
		emp1.setEmployeerName("Micky");
		emp1.setType("Fulltime");
		emp1.setCompany(comp);
		Employeer emp2 = new Employeer();
		emp2.setEmployeerName("John");
		emp2.setType("Contract");
		emp2.setCompany(comp);
		Employeer emp3 = new Employeer();
		emp3.setEmployeerName("Kathy");
		emp3.setType("Partime");
		emp3.setCompany(comp);
		
		comp.getEmployeer().add(emp1);
		comp.getEmployeer().add(emp2);
		comp.getEmployeer().add(emp3);
		
		session.saveOrUpdate(comp);
		System.out.println(comp.getName());
		System.out.println(comp.getEmployeer().size());
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
