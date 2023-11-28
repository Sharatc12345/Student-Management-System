package com.db;

import com.components.Attendence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AttendenceDao implements AttendenceDB{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Attendence a=new Attendence();

	@Override
	public void add(String attendence, String date, int sid) {
		a.setSid(sid);
		a.setDate(date);
		a.setAttendence(attendence);
		et.begin();
		em.persist(a);
		et.commit();
	}

	@Override
	public void read() {
		
	}

	@Override
	public void update(int sid, String date) {
		
	}

	@Override
	public void delete(int sid, String date) {
		
	}

	@Override
	public void highest() {
		
	}

	@Override
	public void lowest() {
		
	}

	@Override
	public void getSingleData(int sid) {
		
	}

}
