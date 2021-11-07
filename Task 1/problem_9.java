import java.util.Scanner;
import java.util.Random;
public class problem_9 {
    public static void main(String[] args){

        int num1 = new Random().nextInt(11);
        int num2 = new Random().nextInt(11);

        System.out.print(num1 + " - " + num2 + " = ");
        int ans = new Scanner(System.in).nextInt();

        if (ans == num1-num2)
            System.out.println("Congratulations !\nCorrect answer !");
        else
            System.out.println("Wrong answer !\n" + num1 + " - " + num2 + " = " + (num1-num2));
    }
}