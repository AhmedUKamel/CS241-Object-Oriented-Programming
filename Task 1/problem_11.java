import java.util.Scanner;
public class problem_11 {
    public static void main(String[] args){

        System.out.print("Enter your weight (Pound) = ");
        float weight = new Scanner(System.in).nextFloat();

        System.out.print("Enter your height (Inch)  = ");
        float height = new Scanner(System.in).nextFloat();

        weight *= 0.45359237;
        height *= 0.0254;

        float bmi = weight/(height*height);
        System.out.println("Body mass index = " + bmi);

        if (bmi < 18.5)                   System.out.println("UnderWeight");
        else if (bmi >= 18.5 && bmi < 25) System.out.println("Normal");
        else if (bmi >= 25 && bmi < 30)   System.out.println("OverWeight");
        else if (bmi >= 30)               System.out.println("Obese");
    }
}