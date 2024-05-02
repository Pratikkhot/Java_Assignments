package com.Assignment;
import java.util.Arrays;
public class Test2 {

	public static void main(String[] args) {
		 
		Product [] arr = {
				
				new Product (1,"Mobile","Electronics",9000),
				new Product (2,"TV","Electronics",12000),
				new Product (3,"Monitor","Electronics",4000),
				new Product (1,"Ball","Toys",100),
				new Product (2,"Bat","Toys",600),
				new Product (3,"Racket","Toys",300),
				new Product (1,"Pen","Stationary",20),
				new Product (2,"Pencil","Stationary",10),
				new Product (3,"Chair","Household",800),
				new Product (3,"Sofa","Household",2000)
		};
		
		Arrays.sort(arr);
		
		System.out.println("Sorted by category ");
		
		for (Product product : arr) {
			
			System.out.println("Id: " +product.id +"\n" + "Name:"+product.name+ "\n" + "Category:"+product.category +"\n"  + "Price: "+product.price );
		}



		
	}
}
