package com.hibernate.model.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.hibernate.util.HibernateHelper;

public class ProductCustMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = HibernateHelper.getSessionFactory();
		Session  session = sf.openSession();
		session.beginTransaction();
		
		Customer cust = new Customer();
		cust.setCustomerName("Joey");
		cust.setContactNumber("9394502153");
		cust.setAddress("KansasCity, MO");
		
		
		Product pro = new Product();
		pro.setName("Watch");
		pro.setDetail("Analog");
		pro.setPrice("$150");
		pro.getCustomer().add(cust);
		session.save(cust);
		session.save(pro);
		
		/*Customer customer = session.load(Customer.class, 9L);
		session.delete(customer);*/
		
		/*Product product = session.load(Product.class, 10L);
		session.delete(product);*/
		
		
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}

}
