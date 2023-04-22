package ManyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToOne.dto.Branch;

public class DriverRemove 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Branch branches = entityManager.find(Branch.class,2);
		entityTransaction.begin();
		entityManager.remove(branches);
		entityTransaction.commit();        
	}
}
