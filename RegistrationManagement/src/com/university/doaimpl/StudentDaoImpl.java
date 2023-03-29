package com.university.doaimpl;

import java.util.ArrayList;
import java.util.Scanner;

import com.university.dao.StudentDao;
import com.university.model.Course;
import com.university.model.Student;
import com.university.model.University;

public class StudentDaoImpl implements StudentDao {
	
	static Scanner sc= new Scanner(System.in);
	
	ArrayList<Student> studs;

	@Override
	public void addStudent(University u, Student s) {

      studs= u.getStud();
      studs.add(s);
      u.setStud(studs);
      
      System.out.println("Student added..............");
		
	}

	@Override
	public void deleteStudent(University u, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(University u, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student viewStudentBy(University u, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayAllStudent(University u) {

       for(Student s: u.getStud())
       {
    	   System.out.println(s);
       }
		
	}

	@Override
	public void displayStudentByCourse(University u, String course) {
		// TODO Auto-generated method stub
		
	}

}
