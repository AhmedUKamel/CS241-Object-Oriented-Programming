import java.util.Scanner;
import java.lang.Math;
public class problem_7 {
    public static void main(String[] args){

        // Get points
        Scanner point = new Scanner(System.in);
        System.out.println("Formula (x1, y1), (x2, y2)");

        System.out.print("x1 : ");
        float x1 = point.nextFloat();

        System.out.print("y1 : ");
        float y1 = point.nextFloat();

        System.out.print("x2 : ");
        float x2 = point.nextFloat();

        System.out.print("y2 : ");
        float y2 = point.nextFloat();

        // Calculate distance
        double distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        
        // Print distance
        System.out.println("Distance between ("+x1+", "+y1+") and ("+x2+", "+y2+") = "+distance);
    }
}