package com.Assignment;

public class Student implements Comparable<Student> {

	int rollno;
	String name; 
	int marks;
	
	public Student()
	{
		
	}

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	

	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(o.marks, this.marks);
	}
	
	
}
