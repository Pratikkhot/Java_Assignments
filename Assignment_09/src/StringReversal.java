
import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String original = scanner.nextLine();
        
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
 
        return sb.toString();
    }
}
