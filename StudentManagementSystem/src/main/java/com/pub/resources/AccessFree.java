package com.pub.resources;

import java.util.List;

import com.components.Colleges;
import com.components.Courses;
import com.components.Subjects;

public interface AccessFree {
	
	List<Courses> getAllCourses();
	List<Subjects> getAllSubjects();
	List<Colleges> getAllColleges();
}
