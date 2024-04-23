import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        double a,b,avg;
        
        System.out.println("Enter the first value:");
        if (scanner.hasNextDouble())
        {
             a = scanner.nextDouble();
            System.out.println("Enter the second value:");
            
            if (scanner.hasNextDouble()) {
                 b = scanner.nextDouble();
                 avg = (a + b) / 2;
                System.out.println("The average of two numbers is: " + avg);
            } else {
                System.out.println("Error: Second value is not a valid double, Run the program again.");
            }
        } else {
            System.out.println("Error: First value is not a valid double, Run the program again.");
        }

    }
}
