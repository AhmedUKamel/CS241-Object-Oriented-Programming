import java.util.Scanner;
public class problem_18 {
    public static void main(String[] args){

        // Get number
        System.out.print("Enter an integer : ");
        int number = new Scanner(System.in).nextInt();

        // Check if divisible by 4 or/and 5
        System.out.println("Is " + number + " divisible by 4 and 5 ? " + (number % 4==0 && number % 5==0));
        System.out.println("Is " + number + " divisible by 4 or  5 ? " + (number % 4==0 || number % 5==0));
        System.out.print("Is " + number + " divisible by 4 or  5 but not both ? ");
        if (number % 4 == 0 && number % 5 != 0)      System.out.println("true");
        else if (number % 5 == 0 && number % 4 != 0) System.out.println("true");
        else                                         System.out.println("false");
    }
}