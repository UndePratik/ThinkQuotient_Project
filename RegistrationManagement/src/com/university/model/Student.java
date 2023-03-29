package com.university.model;

public class Student {

	private int sid;
	private String name;
	private double spercent;
	Course course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, double spercent,Course course) {
		super();
		this.sid = sid;
		this.name = name;
		this.spercent = spercent;
		this.course=course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpercent() {
		return spercent;
	}
	public void setSpercent(double spercent) {
		this.spercent = spercent;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", spercent=" + spercent + ", course=" + course + "]";
	}
	
	


	
	
	
}
