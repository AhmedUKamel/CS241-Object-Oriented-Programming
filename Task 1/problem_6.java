import java.util.Scanner;
public class problem_6 {
    public static void main(String[] args){

        System.out.print("Enter your weight (Pound) = ");
        float weight = new Scanner(System.in).nextFloat();

        System.out.print("Enter your height (Inch)  = ");
        float height = new Scanner(System.in).nextFloat();

        weight *= 0.45359237;
        height *= 0.0254;

        float bmi = weight/(height*height);

        System.out.println("Body mass index = " + bmi);
    }
}