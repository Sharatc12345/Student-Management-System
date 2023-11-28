package com.db;

import java.util.List;

import com.components.Courses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class CoursesDao implements CourseDB{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Courses c=new Courses();

	@Override
	public void add(String code, String name) {
		c.setCode(code);
		c.setName(name);
		et.begin();
		em.persist(c);
		et.commit();
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Courses> byId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Courses byName(String name) {
		TypedQuery<Courses> q=em.createQuery("select s from Courses s where name=:n", Courses.class);
		q.setParameter("n", name);
		Courses cou=q.getSingleResult();
		return cou;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
