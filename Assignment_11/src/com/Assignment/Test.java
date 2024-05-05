package com.Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int choice=0,counter =0;
		Scanner sc = new Scanner(System.in);
		Student[] arr =  new Student[4];
		
		do {
			System.out.println("0.EXIT");
			System.out.println("1.Add Student");
			System.out.println("2.Sort by Roll No");
			System.out.println("3.Sort by Name");
			System.out.println("4.Sort by Marks");
			System.out.println("5.Sort by Course");	
			choice = sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("BYE.....");
				break;
			case 1:
				if(counter<4)
				{
					arr[counter] = new Student();
					arr[counter].accept();
					counter++;
				}
				else {
					System.out.println("Array is Full");
				}
				break;
				
			case 2:
				Arrays.sort(arr);
				for (Student element : arr)
					System.out.println(element);
				break;
				
			case 3:
				class onName implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						
						return o1.Name.compareTo(o2.Name);
					}
				}
				
				onName ele1 = new onName();
				Arrays.sort(arr,ele1);
				for (Student element : arr)
					System.out.println(element);
				break;
			
			case 4:
				class onMarks implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						
						return Double.compare(o2.marks, o1.marks);
					}
				}
				
				onMarks ele2 = new onMarks();
				Arrays.sort(arr,ele2);
				for (Student element : arr)
					System.out.println(element);
				break;
				
			case 5:
				class onCourse implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						
						return o1.course.compareTo(o2.course);
					}
				}
				
				onCourse ele3 = new onCourse();
				Arrays.sort(arr,ele3);
				for (Student element : arr)
					System.out.println(element);
				break;
				
			default:
				System.out.println("Invalid Choice!!!!");
				break;
				
			}
		}while(choice!=0);
		
		
		
		
		
	}

}
