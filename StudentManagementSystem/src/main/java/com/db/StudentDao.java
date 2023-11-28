package com.db;

import java.util.List;

import com.components.Students;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class StudentDao implements StudentDB{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Students s=new Students();

	@Override
	public void add(String name, String fathername, String mothername, String gender, String dob, String address, String course,String semester,
			long mobileno, String email, String password, String image) {
		s.setName(name);
		s.setFathername(fathername);
		s.setMothername(mothername);
		s.setGender(gender);
		s.setDate(dob);
		s.setAddress(address);
		s.setCourse(course);
		s.setSemester(semester);
		s.setMobileno(mobileno);
		s.setEmail(email);
		s.setPassword(password);
		s.setImage(image);
		
		et.begin();
		em.persist(s);
		et.commit();
       		
	}

	@Override
	public List<Students> read() {
		TypedQuery<Students> query=em.createQuery("Select s from Students s", Students.class);
		List<Students> std=query.getResultList();
		return std;
	}

	@Override
	public void update(int id,String name, String fathername, String mothername, String gender, String dob, String address, String course,String semester,
			long mobileno, String email, String password, String image ) {
		Students s=em.find(Students.class, id);
		s.setName(name);
		s.setFathername(fathername);
		s.setMothername(mothername);
		s.setGender(gender);
		s.setDate(dob);
		s.setAddress(address);
		et.begin();
		em.merge(s);
		et.commit();
	}

	@Override
	public void delete(int id) {
		Students s=em.find(Students.class, id);
		et.begin();
		em.remove(s);
		et.commit();
	}

	@Override
	public List<Students> getStudentbyusernamePass(long mobilen, String password) {
     TypedQuery<Students> query=em.createQuery("select s from Students s where mobileno=:mobile AND password=:pass", Students.class);
     query.setParameter("mobile", mobilen);
     query.setParameter("pass", password);
     List<Students> std=query.getResultList();
     return std;
	}

	@Override
	public List<Students> getStudentsByCourseSem(String course, String semester) {
		TypedQuery<Students> query=em.createQuery("select s from Students s where course=:c AND semester=:s order by name asc", Students.class);
		query.setParameter("c", course);
		query.setParameter("s", semester);
		List<Students> std1=query.getResultList();
		return std1;
	}

	@Override
	public List<Students> getStudentAsc() {
		TypedQuery<Students> q=em.createQuery("select s from Students s ORDER BY name ASC", Students.class);
		List<Students> std=q.getResultList();
		return std;
	}

	@Override
	public void studentregId(int id, String Regno) {
		// TODO Auto-generated method stub
		
	}
	
}
