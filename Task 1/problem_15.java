import java.util.Scanner;
public class problem_15 {
    public static void main(String[] args){

        // Get first edge
        System.out.print("Enter first edge : ");
        float e1 = new Scanner(System.in).nextFloat();
        
        // Get second edge
        System.out.print("Enter second edge : ");
        float e2 = new Scanner(System.in).nextFloat();
        
        // Get third edge
        System.out.print("Enter third edge : ");
        float e3 = new Scanner(System.in).nextFloat();

        // Check if valid
        if (e1+e2>e3 && e1+e3>e2 && e2+e3>e1) System.out.println("Perimeter = " + (e1+e2+e3));
        else                                  System.out.println("Invalid input !");
    }
}