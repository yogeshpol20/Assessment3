package ManyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ManyToOne.dto.Branch;

public class DriverRead 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Branch branch = entityManager.find(Branch.class, 1);
		System.out.println(branch);
	}
}
