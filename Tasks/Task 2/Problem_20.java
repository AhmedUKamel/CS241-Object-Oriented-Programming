import java.util.Scanner;
public class Problem_20 {
    public static void main(String[] args){

        System.out.print("Enter Loan amount = ");
        int loan = new Scanner(System.in).nextInt();

        System.out.print("Enter number of years = ");
        int years = new Scanner(System.in).nextInt();

        System.out.println("Interest rate\tMonthly payment\t\tTotal payment");

        for (double i = 5 ; i <= 10 ; i += 0.25){

            double monthly_rate = i / 1200;
            double monthly_payment = (loan * monthly_rate)/(1-(1/Math.pow((1 + monthly_rate), years * 12)));
            double total_payment = monthly_payment * years * 12;

            System.out.println(i + " %" + "\t\t" + monthly_payment + "\t" + total_payment);
        }
    }
}
