import java.util.Scanner;
public class problem_8 {
    public static void main(String[] args){

        // Get investment money
        System.out.print("Enter investment amount : ");
        float invesment = new Scanner(System.in).nextFloat();

        // Get yearly profits rate
        System.out.print("Enter profits rate : ");
        float profits = new Scanner(System.in).nextFloat();

        // Get number of years
        System.out.print("Enter number of year : ");
        float years = new Scanner(System.in).nextFloat();

        // Calculate Total
        double total = invesment * (1 + (years * profits / 100) );
        System.out.println("invesment amount " + invesment + " after " + years + " years = " + total);
    }
}