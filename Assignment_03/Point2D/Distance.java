package com.app.geometry;
import java.lang.Math;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distance = 0;
		Point2D p1 = new Point2D();
		p1.accept(); 
		System.out.println(" Coordinate 1 Details  : "+	p1.getDetails());
		
		Point2D p2 = new Point2D();
		p2.accept(); 
		System.out.println(" Coordinate 2 Details  : "+	p2.getDetails());
		
		System.out.println("Check for is equal : ");
		
		if(p1.isEqual(p2.getX(), p2.getY()))
		{
			//calculate
			distance = Math.sqrt((p2.getY()-p1.getY())*(p2.getY()-p1.getY()) + (p2.getX()-p1.getX())*(p2.getX()-p1.getX()));
			System.out.println("Points are at Distance : "+ distance);
		}
		else
		{
			System.out.println("Points are same Distance is  "+ distance);
		}
		
		
	}

}