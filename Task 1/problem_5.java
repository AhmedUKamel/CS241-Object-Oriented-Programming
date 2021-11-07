import java.util.Scanner;
public class problem_5 {
    public static void main(String[] args){

        System.out.print("Enter number of minutes = ");
        long number = new Scanner(System.in).nextLong();

        long minutes = number % 60;
        long hours = (number/60) % 24;
        long days = ((number/60) / 24) % 365;
        long years = ((number/60) / 24) / 365;

        System.out.println("Remaining time :");
        System.out.println("Years \t: " + years);
        System.out.println("Days \t: " + days);
        System.out.println("Hours \t: " + hours);
        System.out.println("Minutes : " + minutes);

    }
}