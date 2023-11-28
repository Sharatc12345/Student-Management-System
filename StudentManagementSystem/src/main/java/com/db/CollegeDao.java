package com.db;

import java.util.List;

import com.components.Colleges;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class CollegeDao implements CollegeDB{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Colleges c=new Colleges();
	

	@Override
	public void addCollege(String name, String owner, String email, long mobileno, String password) {
		c.setName(name);
		c.setOwner(owner);
		c.setEmail(email);
		c.setMobileno(mobileno);
		c.setPassword(password);
		et.begin();
		em.persist(c);
		et.commit();
	}
	@Override
	public List<Colleges> retrieve(int id) {
		
		return null;
	}

	@Override
	public List<Colleges> retrieveByName(String name) {
		return null;
	}

	@Override
	public void updateDetails(int id, String name, String owner) {
		
	}

	@Override
	public void updateEmail(int id, String email) {
		
	}

	@Override
	public void updateMobileno(int id, long mobileno) {
		
	}

	@Override
	public void updatePassword(int id, String password) {
		
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public List<Colleges> retrieveAsc() {
		
		return null;
	}

	@Override
	public List<Colleges> getCollegeByUsernamePassword(long mobileno, String password) {
		TypedQuery<Colleges> q=em.createQuery("select c from College c where mobileno=:m and password=:p", Colleges.class);
		List<Colleges> clg=q.getResultList();
		return clg;
	}
}
