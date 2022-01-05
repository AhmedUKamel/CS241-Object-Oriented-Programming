import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String...args){
        // create two random numbers
        int n1 = new Random().nextInt(1, 11);
        int n2 = new Random().nextInt(1, 11);
        // prompts kid to enter the answer
        System.out.print(n1 + " + " + n2 + " = ");
        int ans = new Scanner(System.in).nextInt();
        // print the test result
        if(ans==n1+n2)
            System.out.println("Congratulations correct answer");
        else
            System.out.println("Good luck next time, correct answer is " + ans);
    }
}
/*
Write a program to teach kids addition. Your
program should show to the kid a simple question and
wait the answer. You program should check if the answer
is correct or not and print the correct answer if kid’s
answer is wrong. (use random number between 1 to 10)
*/