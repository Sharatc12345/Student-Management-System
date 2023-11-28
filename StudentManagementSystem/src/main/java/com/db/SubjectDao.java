package com.db;

import java.util.List;

import org.hibernate.dialect.lock.PessimisticEntityLockException;

import com.components.Subjects;
import com.mysql.cj.jdbc.exceptions.MySQLTransactionRollbackException;
import com.oracle.wls.shaded.org.apache.xalan.xsltc.compiler.sym;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PessimisticLockException;
import jakarta.persistence.TypedQuery;

public class SubjectDao implements SubjectDB{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sanvi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	@Override
	public void add(String subcode,String subjectname, String semester, int courseid) {
		
		Subjects s=new Subjects();
		s.setSubjectcode(subcode);
		s.setSubjectname(subjectname);
		s.setSemester(semester);
		s.setCourseid(courseid);
		et.begin();
		em.persist(s);
		et.commit();
		
	}

	@Override
	public List<Subjects> read() {
		TypedQuery<Subjects> tq=em.createQuery("select s from Subjects s", Subjects.class);
		List<Subjects> s=tq.getResultList();
		return s;
	}

	@Override
	public List<Subjects> readSemester(String Semester) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subjects> readCourse(String course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subjects> readByCode(String subjectcode)  {
		TypedQuery<Subjects> q=em.createQuery("select s from Subjects s where subjectcode=:sc", Subjects.class);
		List<Subjects> sbj=q.getResultList();
		return sbj;
	}

	@Override
	public void updateSubject(String name, String course, String code, String semester) {

	}

	@Override
	public void delete(int id) {
		Subjects s=em.find(Subjects.class, id);
		et.begin();
		em.remove(s);
		et.commit();

	}

	@Override
	public void generateScode(int id, String scode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subjectCode(int id, String code) {

	}



}
