import java.util.Scanner;
public class Problem_9 {
    public static void main(String[] args){

        System.out.print("Enter number of students = ");
        int students = new Scanner(System.in).nextInt();

        int lowest_score = 100000000, highest_score = -100000000;
        String lowest_name = null, highest_name = null;

        for (int i = 1 ; i <= students ; i++){

            System.out.print("Enter the name of student " + i + " = ");
            String name = new Scanner(System.in).next();

            System.out.print("Enter the score of  " + name + " = ");
            int score = new Scanner(System.in).nextInt();

            if (score > highest_score){
                highest_score = score;
                highest_name = name;
            }
            if (score < lowest_score){
                lowest_score = score;
                lowest_name = name;
            }

        }
        System.out.println("Highest student is " + highest_name + " with score = " + highest_score);
        System.out.println("Lowest student is " + lowest_name + " with score = " + lowest_score);
    }
}
