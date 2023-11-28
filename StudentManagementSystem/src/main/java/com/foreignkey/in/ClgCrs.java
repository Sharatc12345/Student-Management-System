package com.foreignkey.in;

import java.util.List;

public interface ClgCrs {
	void add(int clgid, int crsid);
	List<College_Course> getAll();
	List<College_Course> getByCourseId(int crsid);
	List<College_Course> getByCollegeId(int clgid);
	void updateData(int clgid, int crsid);
}
