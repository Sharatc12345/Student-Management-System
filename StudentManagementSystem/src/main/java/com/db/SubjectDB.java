package com.db;

import java.util.List;


import com.components.Subjects;

public interface SubjectDB {
    void add(String subcode, String subjectname, String semester, int courseid);
	List<Subjects> read();
	List<Subjects> readSemester(String Semester);
	List<Subjects> readCourse(String course);
	List<Subjects> readByCode(String course);
	void updateSubject(String name, String course, String code, String semester);
	void delete(int id);
	void  generateScode(int id, String scode);
	void subjectCode(int id,String code);
}
