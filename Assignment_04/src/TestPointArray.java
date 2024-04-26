import java.util.Scanner;

public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n,coordinate,point_a, point_b;
		double distance;
		
		System.out.println("Enter number of Co-ordinate you want to Enter : ");
		n = sc.nextInt();
	
		
		Point2D[] points = new Point2D[n];
		
		for(int i = 0; i< n; i++)
		{
			System.out.println("----Enter Point "+i+"-----");
			points[i] = new Point2D();
			points[i].accept();			
		}
		
		
		
		int choice=0;
		while(choice != 4)
		{
			System.out.println("1) Display Specific Point\n2) Display All Points\n3) Calculate Ditsance\n4) Exit\n\nEnter YOur Chocie : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Co-ordinate you want to see : ");
				coordinate = sc.nextInt();
				System.out.println(points[coordinate].getDeatils());
				
				break;
				
			case 2:
				System.out.println("----------All Points-------");
				for(Point2D point : points)
					{
					System.out.println(point.getDeatils());
						System.out.println("--------------------");
					}
				break;
				
			case 3 :
				System.out.println("----------------\n\n");
				System.out.println("Enter Point 1 to Calculate Distance : ");
				point_a = sc.nextInt();
				System.out.println("Enter Point 2 to Calculate Distance : ");
				point_b = sc.nextInt();
				
				if(points[point_a].isEqual(points[point_b].getX(), points[point_b].getY()))
				{
					distance = Math.sqrt( ((points[point_b].getY() - points[point_a].getY())*(points[point_b].getY() - points[point_a].getY())) + ((points[point_b].getX() - points[point_a].getX())*(points[point_b].getX() - points[point_a].getX())) );
					System.out.println("Cordinate is at Distance  : "+ distance);
				}else
				{
					System.out.println("Co-ordinates are same ...");
				}
				break;

			case 4: System.out.println("Thank you ......");
			break;
			default:
				System.out.println("Invalid Choice ...");
				break;
			}
			
		}
		
	}

}
