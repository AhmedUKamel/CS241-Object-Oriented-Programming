import java.util.Scanner;
public class problem_17 {
    public static void main(String[] args) {

        // Get years
        System.out.print("Enter year : ");
        int year = new Scanner(System.in).nextInt();
        boolean leap;

        // Set value for leap
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) leap = true;
                else                 leap = false;
        }
            else leap = true;
        }
        else leap = false;

        // Print is leap or not
        if (leap) System.out.println(year + " is a leap year.");
        else      System.out.println(year + " is not a leap year.");
    }
}