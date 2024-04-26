import java.util.Scanner;

public class Point2D {
		private int x;
		private int y;
		
		public Point2D() {
			// TODO Auto-generated constructor stub
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		public void accept()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter X Co-ordinate : ");
			this.x=sc.nextInt();
			System.out.println("Enter Y Co-ordinate : ");
			this.y=sc.nextInt();
			
			System.out.println("-------------------");
		}
		
		
		public String getDeatils()
		{
			return "Co-ordinate : ("+this.x+", "+this.y+")";
		}
		
		public boolean isEqual(int x, int y)
		{
			if(this.x == x && this.y ==y)
			{
				return false;
			}else
			{
				return true;				
			}
		}	
	
}
