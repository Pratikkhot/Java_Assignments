import java.util.Scanner;

import Excpetions.ExceptionLineTooLong;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String string ;
		System.out.println("Enter a string");
		string = sc.nextLine();
		
		try {
			if(string.length()>80)
			{
				throw new ExceptionLineTooLong("The string is too long");
			}
			else {
				System.out.println(string);
			}
	}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
}}
