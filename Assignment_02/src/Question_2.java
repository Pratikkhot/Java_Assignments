import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total_miles =0;
		int cost_per_gallon =0;
		int avg_miles_per_gallon=0;
		int parking_fees;
		int tolls;
		int driving_cost;
		int totalcost;
		int totalgas;
		
		System.out.println("****************Daily Driving cost*******************");
		
		System.out.println("Enter total miles travelled in a day");
		total_miles=sc.nextInt();
		
		System.out.println("Enter cost per gallon in a day");
		cost_per_gallon=sc.nextInt();
		
		System.out.println("Enter average miles per gallon ");
		avg_miles_per_gallon =sc.nextInt();
		
		System.out.println("Enter parking fees per day");
		parking_fees=sc.nextInt();
		
		System.out.println("Enter Tolls per day");
		tolls=sc.nextInt();
		
		totalgas= total_miles/avg_miles_per_gallon;
		
		driving_cost= totalgas*cost_per_gallon ;
		
		totalcost= driving_cost+ parking_fees+ tolls;
		
		System.out.println("Total cost per day:"+totalcost);

		
	}
}
