package com.db;

import java.util.List;

import com.components.Students;

public interface StudentDB {
	
	void add(String name, String fathername, String mothername, String gender,String dob, String address,String course,String semester, long mobileno, String email, String password, String image);
	List<Students> read();
	void update(int id,String name, String fathername, String mothername, String gender, String dob, String address, String course,String semester,
			long mobileno, String email, String password, String image);
	void delete(int id);
	List<Students> getStudentbyusernamePass(long mobileno,String password);
	List<Students> getStudentsByCourseSem(String course, String semester);
	List<Students> getStudentAsc();
	void studentregId(int id, String Regno);
}
