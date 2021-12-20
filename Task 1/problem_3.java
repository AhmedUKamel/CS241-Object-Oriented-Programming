import java.util.Scanner;
public class problem_3 {
	public static void main(String[] args){

		// Get old subtotal
		System.out.print("Enter Old subtotal : ");
		float subtotal = new Scanner(System.in).nextFloat();

		// Ger gratuity
		System.out.print("Enter Gratuity : ");
		float gratuity = new Scanner(System.in).nextFloat();

		// Calculate new subtotal
		subtotal += gratuity / 100 * subtotal;
		
		// Print new subtotal
		System.out.println("New sub total = " + subtotal);
	}
}