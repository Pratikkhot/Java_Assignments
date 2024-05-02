package com.Assignment;

import java.util.Arrays;
public class Test {

	public static void main(String[] args) {
		Student [] arr = {
				new Student(1,"Pratik",90),
				new Student(2,"Shubham",30),
				new Student(3,"Pratap",50),
				new Student(4,"Atharva", 60),
				new Student(5, "Vedant",70) };
		
		System.out.println("Before sorting:  ROLL NO / NAME / MARKS");
		for (Student student : arr) {
		
			System.out.println(student.rollno +" " +student.name+ " " + student.marks  );
		}
		Arrays.sort(arr);
		
		System.out.println("***********************************************");
		
		System.out.println("After sorting:  ROLL NO / NAME / MARKS");
		for (Student student : arr) {
			System.out.println(student.rollno +" " +student.name+ " " + student.marks  );
			
		}
//		Comparable<Student> s1 = new Student();
		}
	}
	

