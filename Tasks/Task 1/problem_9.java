import java.util.Scanner;
import java.util.Random;
public class problem_9 {
    public static void main(String[] args){

        // Generate two random numbers
        int num1 = new Random().nextInt(11);
        int num2 = new Random().nextInt(11);

        // Ask user for answer
        System.out.print(num1 + " - " + num2 + " : ");
        int ans = new Scanner(System.in).nextInt();

        // Check if answer is correct and print message
        if (ans == num1-num2)
            System.out.println("Congratulations !\nCorrect answer !");
        else
            System.out.println("Wrong answer !\n" + num1 + " - " + num2 + " = " + (num1-num2));
    }
}