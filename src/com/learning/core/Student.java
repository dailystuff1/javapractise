package com.learning.core;

public class Student 
{
	//instance variables
	int id;
	String name;
	
	public Student() {
	}

	//parameterized constructor
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
