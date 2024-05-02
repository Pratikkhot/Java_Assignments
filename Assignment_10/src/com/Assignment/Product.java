package com.Assignment;

public class Product implements Comparable<Product>  {

	int id ;
	String name ;
	String category; 
	int price;
	
	
	public Product(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	
	
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.category.compareTo(o.category);
	}

	
	
}
