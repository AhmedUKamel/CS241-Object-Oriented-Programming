import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String... args) {
        // prompts user to enter numbers
        System.out.print("Enter first number, or 'q' to quit : ");
        System.out.println("Average = " + getAvg());
    }

    public static double getAvg(){
        double sum = 0, ctr = 0;
        while(true){
            String str = sc.next();
            if(str.equals("q")) return sum/ctr;
            else {
                sum += Double.parseDouble(str);
                ctr++;
                System.out.print("Enter another number, or 'q' to quit : ");
            }
        }
    }
}
/*
Take integer inputs from user until he/she presses q ( Ask to press q to quit
after every integer input ). Print average and product of all numbers.
*/