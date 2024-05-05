package com.Assignment;

import java.util.Scanner;

public class Student implements Comparable<Student>{

	int rollNo;
	String Name;
	double marks;
	String course;
	
	public Student()
	{
	}
	@Override
	public int compareTo(Student o) {
		return this.rollNo-o.rollNo;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(int rollNo, String name, double marks, String course) {
		this.rollNo = rollNo;
		this.Name = name;
		this.marks = marks;
		this.course = course;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Roll No : ");
		rollNo = sc.nextInt();
		System.out.println("Enter your Name: ");
		Name = sc.next();
		System.out.println("Enter your Marks : ");
		marks = sc.nextDouble();
		System.out.println("Enter your Course : ");
		course = sc.next();
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", marks=" + marks + ", course=" + course + "]";
	}
	

}
