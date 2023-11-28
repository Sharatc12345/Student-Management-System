package com.pub.resources;

import java.util.List;

import com.components.Colleges;
import com.components.Courses;
import com.components.Subjects;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class AccessFree2 implements AccessFree{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	@Override
	public List<Courses> getAllCourses() {
		TypedQuery<Courses> q=em.createQuery("select s from Courses s", Courses.class);
		List<Courses> cou=q.getResultList();
		return cou;
	}

	@Override
	public List<Subjects> getAllSubjects() {
		TypedQuery<Subjects> q=em.createQuery("select s from Subjects s", Subjects.class);
		List<Subjects> sub=q.getResultList();
		return sub;
	}

	@Override
	public List<Colleges> getAllColleges() {
		TypedQuery<Colleges> q=em.createQuery("select s from Colleges s", Colleges.class);
		List<Colleges> clg=q.getResultList();
		return clg;
	}
	

}
