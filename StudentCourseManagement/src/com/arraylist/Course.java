package com.arraylist;

public class Course {

	private int cid;
	private String cname;
	private float fees;
	
	

	public Course(int cid, String cname, float fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course Details: \ncid:" + cid + ", cname: " + cname + ", fees: " + fees;
	}
	
	
	
}
