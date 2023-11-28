package com.db;

import java.util.List;

import com.components.University;

public interface UniversityDB {
	void addUniversity(String name,String gender,String dob,String qualification,String email, long mobileno, String password,String image);
	void retrieve(int id);
	void retrieveByName(String name);
	void updateDetails(int id,String name,String gender,String dob,String qualification);
	void updateEmail(int id,String email);
	void updateMobileno(int id,long mobileno);
	void updatePassword(int id, String password);
	void delete(int id);
	List<University> getUniversityByUsernamePassword( long mobileno, String password);
}
