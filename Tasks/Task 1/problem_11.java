import java.util.Scanner;
public class problem_11 {
    public static void main(String[] args){

        // Get weight in pound
        System.out.print("Enter your weight (Pound) : ");
        float weight = new Scanner(System.in).nextFloat();

        // Get hight in inch
        System.out.print("Enter your height (Inch)  : ");
        float height = new Scanner(System.in).nextFloat();

        // Convert [weight, hight] to Kg/M
        weight *= 0.45359237;
        height *= 0.0254;

        // Calculate BMI
        float bmi = weight/(height*height);

        // Print BMI
        System.out.println("Body mass index = " + bmi);

        // Print BMI rate
        if (bmi < 18.5)                   System.out.println("UnderWeight");
        else if (bmi >= 18.5 && bmi < 25) System.out.println("Normal");
        else if (bmi >= 25 && bmi < 30)   System.out.println("OverWeight");
        else if (bmi >= 30)               System.out.println("Obese");
    }
}