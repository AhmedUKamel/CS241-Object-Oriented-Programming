import java.util.Scanner;
import java.lang.Math;
class problem_2 {
    public static void main(String[] args){

        // Get length
        System.out.print("Enter Length : ");
        double length = new Scanner(System.in).nextDouble();

        // Calculate area
        double area = (Math.sqrt(3)/4) * Math.pow(length, 2);

        // Calculate volume
        double volume = area * length;

        // Print results
        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
}
