import java.util.Scanner;
public class problem_4_1 {
    public static void main(String[] args){

        System.out.print("Enter a number = ");
        int number = new Scanner(System.in).nextInt();

        int multiplication_numbers = 1;

        while (number != 0){
            multiplication_numbers *= number % 10;
            number /= 10;
        }
        System.out.println("Multiplication digits = " + multiplication_numbers);
    }
}