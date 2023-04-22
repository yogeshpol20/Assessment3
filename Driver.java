package ManyToOne.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToOne.dto.Branch;
import ManyToOne.dto.Hospital;



public class Driver 
{
	public static void main(String[] args) 
	{
		Hospital hospital = new Hospital();
		hospital.setId(1);
		hospital.setAddress("Pune");
		hospital.setName("Nobal");
		
		Branch b1 = new Branch();
		b1.setId(1);
		b1.setAddress("Hadapsar");
		b1.setHospital(hospital);
		
		Branch b2 = new Branch();
		b2.setId(2);
		b2.setAddress("Warje");
		b2.setHospital(hospital);
		
		List<Branch> branches = new ArrayList<Branch>();
		branches.add(b1);
		branches.add(b2);
		hospital.setBranches(branches);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(hospital);
		entityTransaction.commit();
	}
}
