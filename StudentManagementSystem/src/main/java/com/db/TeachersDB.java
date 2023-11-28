package com.db;

import java.util.List;

import com.components.Teachers;

public interface TeachersDB {
	
	void add(String dob,String email,String gender,String image,String incharge, long mobileno,String name,String password,String qualification,String subject);
	void read(int id);
	void update(int id,String dob,String email,String gender,String image,String incharge, long mobileno,String name,String password,String qualification,String subject);
	void delete(int id);
	void getTeachersBySubject(String subject);
	void getTeachersByIncharge(String incharge);
	List<Teachers> getTeacherByUsernamePassword( long mobileno, String password);

}
