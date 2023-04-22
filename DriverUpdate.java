package ManyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToOne.dto.Branch;

public class DriverUpdate 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Branch branch = entityManager.find(Branch.class, 1);
		System.out.println(branch);
		entityTransaction.begin();
		branch.setAddress("Hinjewadi");
		entityManager.merge(branch.getHospital());
		entityManager.merge(branch);
		entityTransaction.commit();     
	}
}
