
import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
	
		String string ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String: ");
		string = sc.next();
		
		StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		
		if(string.equals(sb.toString()))
		{
			System.out.println("Palindrom string");
		}
		else
		{
			System.out.println("Non palindrom");
		}
		
	}
	
}
