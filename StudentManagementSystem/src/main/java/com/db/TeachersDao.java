package com.db;

import java.util.List;

import com.components.Teachers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class TeachersDao implements TeachersDB {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Teachers t1=new Teachers();

	@Override
	public void add(String dob, String email, String gender, String image, String incharge, long mobileno, String name,
			String password, String qualification, String subject) {
		t1.setDob(dob);
		t1.setEmail(email);
		t1.setGender(gender);
		t1.setImage(image);
		t1.setIncharge(incharge);
		t1.setMobile_no(mobileno);
		t1.setName(name);
		t1.setPassword(password);
		t1.setQualification(qualification);
		t1.setSubject(subject);
		
		et.begin();
		em.persist(t1);
		et.commit();
            		
	}

	@Override
	public void read(int id) {
           		
	}

	@Override
	public void update(int id, String dob, String email, String gender, String image, String incharge, long mobileno,
			String name, String password, String qualification, String subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTeachersBySubject(String subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTeachersByIncharge(String incharge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teachers> getTeacherByUsernamePassword( long mobileno, String password) {
		TypedQuery<Teachers> query=em.createQuery("select s from Teachers s where s.mobile_no=:mobile and s.password=:pass",Teachers.class);
		
		query.setParameter("mobile", mobileno);
//		query.setParameter("email", email);
		query.setParameter("pass", password);
		List<Teachers> teacher=query.getResultList();
		return teacher;
	}
	
	

}
