package com.onetoone.prog;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class School {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		
		entityManager.getTransaction().begin();
		
		Student student = new Student();
		student.setSid(101);
		student.setName("Talha");
		
		Address add=  new Address();
		add.setAid(1);
		add.setStreet("Bhandup");
		add.setCountry("India");
		add.setZipcode(400078);
		student.setAdrees(add);
		
		
		entityManager.persist(student);
		
		entityManager.getTransaction().commit();

	}

}
