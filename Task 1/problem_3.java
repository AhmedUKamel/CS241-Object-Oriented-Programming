import java.util.Scanner;
public class problem_3 {
	public static void main(String[] args){

		System.out.print("Enter Old subtotal = ");
		float subtotal = new Scanner(System.in).nextFloat();

		System.out.print("Enter Gratuity = ");
		float gratuity = new Scanner(System.in).nextFloat();

		subtotal += gratuity / 100 * subtotal;
		System.out.println("New sub total = " + subtotal);
	}
}