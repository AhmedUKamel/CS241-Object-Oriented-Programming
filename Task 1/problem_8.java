import java.util.Scanner;
public class problem_8 {
    public static void main(String[] args){

        System.out.print("Enter invesment amount = ");
        float invesment = new Scanner(System.in).nextFloat();

        System.out.print("Enter profits rate = ");
        float profits = new Scanner(System.in).nextFloat();

        System.out.print("Enter number of year = ");
        float years = new Scanner(System.in).nextFloat();

        System.out.println("invesment amount " + invesment + " after " + years + " years = " + invesment*(1+(years*profits/100)));
    }
}