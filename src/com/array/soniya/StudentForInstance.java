package com.array.soniya;

public class StudentForInstance {

	int rollno;
	String name;
	String address;
	
	public StudentForInstance(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public StudentForInstance() {
		super();
	}
	@Override
	public String toString() {
		return "StudentForInstance [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
	}
