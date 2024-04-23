import java.util.Scanner;

public class Question_1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int acc_no=0;
		int cred_limit=0;
		int item_charged=0;
		int credits=0;
		int pending_bal=0;
		int new_bal=0;
		
		System.out.println("================== Credit Limit Calculator ==================");
		
		System.out.println("Enter your Account number: ");
		acc_no=sc.nextInt();
		
		System.out.println("Enter pending balance:");
		pending_bal=sc.nextInt();
		
		System.out.println("Enter total items charged: ");
		item_charged=sc.nextInt();
		
		System.out.println("Enter total credit applied in this month:");
		credits=sc.nextInt();
		
		System.out.println("Enter the Credit limit: ");
		cred_limit=sc.nextInt();
		

		
		new_bal= (pending_bal + item_charged - credits);
		System.out.println("New balance for next month: "+new_bal);
		
		
		
		if(new_bal>cred_limit)
		{
			System.out.println("Limit exceeded! ");
		}
	
		
		
	}
}
