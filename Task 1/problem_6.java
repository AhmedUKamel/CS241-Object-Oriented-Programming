import java.util.Scanner;
public class problem_6 {
    public static void main(String[] args){

        // Get weight in pound
        System.out.print("Enter your weight (Pound) : ");
        float weight = new Scanner(System.in).nextFloat();

        // Get height in inch
        System.out.print("Enter your height (Inch)  : ");
        float height = new Scanner(System.in).nextFloat();

        // Convert [weight, height] to Kg/M
        weight *= 0.45359237;
        height *= 0.0254;

        // Calculate BMI
        float bmi = weight/(height*height);

        // Print values
        System.out.println("Body mass index = " + bmi);
    }
}