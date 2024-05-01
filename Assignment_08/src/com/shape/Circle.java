package com.shape;

import Excpetions.NegativeDiameterException;

public class Circle {
	
	Point2D center;
	double myDiameter;
	
	
	public Circle() {
		
		center = new Point2D();
		myDiameter = 100;
	}
	
	public Circle(int x, int y, double myDiameter) {
		
		center = new Point2D(x, y);
		this.myDiameter = myDiameter;
	}
	
	public Circle(int x, int y) {
		
		center = new Point2D(x, y);
		this.myDiameter = 0;
	}

	public void setMyDiameter(double myDiameter) throws NegativeDiameterException {
		 
		if(myDiameter < 0)
			throw new NegativeDiameterException("Cant have negative diameter...");
		
		this.myDiameter = myDiameter;
	}
	
	
	

}
