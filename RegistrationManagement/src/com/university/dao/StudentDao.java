package com.university.dao;

import com.university.model.Course;
import com.university.model.Student;
import com.university.model.University;

public interface StudentDao {

	public void addStudent(University u,Student s);
	public void deleteStudent(University u,int id);
	public void updateStudent(University u,int id);
	public Student viewStudentBy(University u,int id);
	public void displayAllStudent(University u);
	public void displayStudentByCourse(University u,String course);
	
	
	
}
