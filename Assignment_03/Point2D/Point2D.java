
package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	private int x;
	private int y;
	
	public Point2D() {
		x = 0;
		y = 0;
	}
	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
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
	
	public String getDetails()
	{		
		return "x : "+this.getX()+" y : "+this.getY();
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X co-ordinate : ");
		x = sc.nextInt();
		System.out.println("Enter y co-ordinate : ");
		y = sc.nextInt();		
	}
	
	public boolean isEqual(int x1, int y1)
	{
		if(this.x == x1 && this.y ==y1)
		{
			return false;
		}
		return true;
	}
}
