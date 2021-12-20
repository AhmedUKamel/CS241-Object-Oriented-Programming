import java.util.Scanner;
public class problem_4_1 {
    public static void main(String[] args){

        // Get number
        System.out.print("Enter a number : ");
        int number = new Scanner(System.in).nextInt();

        // Initialize multiplication variable
        int multiplication_numbers = 1;

        // Loop which multiplies all digits
        while (number != 0){
            multiplication_numbers *= number % 10;
            number /= 10;
        }

        // Print value
        System.out.println("Multiplication digits = " + multiplication_numbers);
    }
}