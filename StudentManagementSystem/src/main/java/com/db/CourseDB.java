package com.db;

import java.util.List;

import com.components.Courses;

public interface CourseDB {
	
	void add(String code, String name);
	List<Courses> getCourses();
	void update();
	List<Courses> byId();
	Courses byName(String name);
	void delete(int id);

}
