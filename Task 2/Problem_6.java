import java.util.Scanner;
public class Problem_6 {
    public static void main(String[] args){

        System.out.print("Enter your score in Java = ");
        int score = new Scanner(System.in).nextInt();

        if (score >= 60)
            System.out.println("You pass the exam");
        else
            System.out.println("You don\'t pass the exam");

        }
    }