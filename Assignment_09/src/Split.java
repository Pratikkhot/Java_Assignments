
import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String string;
		
		System.out.println("Enter any string: ");
		string=sc.nextLine();
		
		String [] arr = string.split(" ");
		System.out.println("TOTAL COUNT: "+ arr.length);
		
	}
	
}
