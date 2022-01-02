import java.util.Scanner;
public class problem_14 {
    public static void main(String[] args){

        // Get package's weight
        System.out.print("Enter package\'s weight : ");
        float weight = new Scanner(System.in).nextFloat();

        // Check wight status
        if (weight >= 0){
            if (weight == 0)                      System.out.println("Weight = " + weight + "\nNo Weight");
            else if (weight > 0 && weight <= 2)   System.out.println("2.5 $ for " + weight + " pounds");
            else if (weight > 2 && weight <= 4)   System.out.println("4.5 $ for " + weight + " pounds");
            else if (weight > 4 && weight <= 10)  System.out.println("7.5 $ for " + weight + " pounds");
            else if (weight > 10 && weight <= 20) System.out.println("10.5 $ for " + weight + " pounds");
            else if (weight > 20)                 System.out.println(weight + " pounds can\'t be shipped");
        }
        else System.out.println("Weight = " + weight + "\nWeight can\'t be negative");
    }
}