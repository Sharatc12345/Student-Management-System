package com.db;

import java.util.List;

import com.components.Colleges;

public interface CollegeDB {
	void addCollege(String name,String owner,String email, long mobileno, String password);
	List<Colleges> retrieve(int id);
	List<Colleges> retrieveByName(String name);
	void updateDetails(int id,String name,String owner);
	void updateEmail(int id,String email);
	void updateMobileno(int id,long mobileno);
	void updatePassword(int id, String password);
	void delete(int id);
	List<Colleges> retrieveAsc();
	List<Colleges> getCollegeByUsernamePassword( long mobileno, String password);
}
