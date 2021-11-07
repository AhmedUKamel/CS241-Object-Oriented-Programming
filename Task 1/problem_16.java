import java.util.Scanner;
public class problem_16 {
    public static void main(String[] args){

        System.out.print("Formula = (x, y)\nx = ");
        float x = new Scanner(System.in).nextFloat();

        System.out.print("y = ");
        float y = new Scanner(System.in).nextFloat();

        System.out.println("According to radius = 10 and center of circle = (0, 0)");

        if ((x*x) + (y*y) < 100) System.out.println("(" + x + ", " + y + ") inside the circle");
        else                     System.out.println("(" + x + ", " + y + ") outside the circle");
    }
}