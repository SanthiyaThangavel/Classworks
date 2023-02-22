package com.example.demo;

public class Student {
	private int rollNo;
	private String Name;
	private int rank;
	public Student(int rollNo, String name, int rank) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.rank = rank;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
