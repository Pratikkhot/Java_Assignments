package com.shape;

import java.time.Year;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//Circle circleobj = new Circle();
		
		System.out.println("Enter  X Coordinate Of Center Of Circle");
		int x = scanner.nextInt();
		
		System.out.println("Enter  Y Coordinate Of Center Of Circle");
		int y = scanner.nextInt();
		
		Circle circleobj = new Circle(x,y);
		
		try {
			
			System.out.println("Enter The Diameter : ");
			int diameter = scanner.nextInt();
			circleobj.setMyDiameter(diameter);
			System.out.println("Circle Create...");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
