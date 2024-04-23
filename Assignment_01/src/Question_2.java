import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		double totalbill=0;
		
		System.out.println("=============== Welcome to our Hotel! =================");
		
		System.out.println("1} Idli: 10rs");
		
		System.out.println("2} Dosa: 20rs");

		System.out.println("3} Vadapav: 30rs ");

		System.out.println("4} Samosa: 40rs ");

		System.out.println("5} Dhokla: 50rs ");
		
		System.out.println("6} Pizza: 100rs");
		
		System.out.println("7} Burger: 60rs");

		System.out.println("8} Veg thali: 100rs");
		
		System.out.println("9} Pasta: 120rs");

		System.out.println("10} Generate bill ");
		
		System.out.println("Press 0 to exit");
		
		System.out.println("=======================================================");
		
		int generatebill=0;
		
		while(generatebill!=10)
		{
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
				
			switch(choice)
			{
			case 1: totalbill= totalbill+10;
			break;
				
			case 2: totalbill= totalbill+20;
			break;
			
			case 3: totalbill= totalbill+30;
			break;
			
			case 4: totalbill= totalbill+40;
			break;
			
			case 5: totalbill= totalbill+50;
			break;
			
			case 6: totalbill= totalbill+100;
			break;
			
			case 7: totalbill= totalbill+60;
			break;
			
			case 8: totalbill= totalbill+100;
			break;
			
			case 9: totalbill= totalbill+120;
			break;
			
			case 10: System.out.println("Total bill: "+totalbill);
			break;
			
			case 0:  System.out.println("Thank you! Visit us again :) ");
			break;
			
			default: System.out.println("Invalid choice");
			}
			
		}
		
	}
}
