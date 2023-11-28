package com.db;

import java.util.List;

import com.components.University;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class UniversityDao implements UniversityDB {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	University u=new University();

	@Override
	public void addUniversity(String name, String gender, String dob, String qualification, String email, long mobileno,
			String password, String image) {
		u.setName(name);
		u.setGender(gender);
		u.setDob(dob);
		u.setQualification(qualification);
		u.setEmail(email);
		u.setMobileno(mobileno);
		u.setPassword(password);
		u.setImage(image);
		et.begin();
		em.persist(u);
		et.commit();
	}

	@Override
	public void retrieve(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveByName(String name) {
		
		
	}

	@Override
	public void updateDetails(int id, String name, String gender, String dob, String qualification) {
		University u=em.find(University.class, id);
		u.setName(name);
		u.setGender(gender);
		u.setDob(dob);
		u.setQualification(qualification);
		et.begin();
		em.merge(u);
		et.commit();	
		
	}

	@Override
	public void updateEmail(int id, String email) {
		University u=em.find(University.class, id);
		u.setEmail(email);
		et.begin();
		em.merge(u);
		et.commit();	
		
	}

	@Override
	public void updateMobileno(int id, long mobileno) {
		University u=em.find(University.class, id);
		u.setMobileno(mobileno);
		et.begin();
		em.merge(u);
		et.commit();		
	}

	@Override
	public void updatePassword(int id, String password) {
		University u=em.find(University.class, id);
		u.setPassword(password);
		et.begin();
		em.merge(u);
		et.commit();
		
	}

	@Override
	public void delete(int id) {
		University u=em.find(University.class, id);
		et.begin();
		em.remove(u);
		et.commit();
		
	}

	@Override
	public List<University> getUniversityByUsernamePassword(long mobileno, String password) {
    TypedQuery<University> query=em.createQuery("select s from University s where s.mobileno=:mobile and s.password=:pass",University.class);
		
		query.setParameter("mobile", mobileno);
//		query.setParameter("email", email);
		query.setParameter("pass", password);
		List<University> uni=query.getResultList();
		return uni;
	}
	

}
