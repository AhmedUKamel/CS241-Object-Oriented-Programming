import java.util.Scanner;
public class problem_4_2 {
    public static void main(String[] args){

        // Get number
        System.out.print("Enter a number : ");
        int number = new Scanner(System.in).nextInt();

        // get last digit
        int n1 = number % 10;
        if (n1 == 0) n1 = 1;
        number /= 10;
        
        // get middle digit
        int n2 = number % 10;
        if (n2 == 0) n2 = 1;
        number /= 10;
        
        // get first digit
        int n3 = number % 10;
        if (n3 == 0) n3 = 1;
        number /= 10;

        // Calculate Multiplication digits
        int multiplication_numbers = n1 * n2 * n3;

        // Print Multiplication digits
        System.out.println("Multiplication digits = " + multiplication_numbers);
    }
}