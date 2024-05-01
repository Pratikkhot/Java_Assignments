package com.shape;

import java.util.Scanner;

public class Point2D {
	
	int x;
	int y;
	
	public Point2D() {
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void accept(Scanner scanner) {
		System.out.println("Enter X : ");
		this.x = scanner.nextInt();
		
		System.out.println("Enter Y : ");
		this.y = scanner.nextInt();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
