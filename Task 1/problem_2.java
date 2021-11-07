import java.util.Scanner;
import java.lang.Math;
class problem_2 {
    public static void main(String[] args){

        System.out.print("Enter Length = ");
        double length = new Scanner(System.in).nextDouble();

        double area = (Math.sqrt(3)/4) * Math.pow(length, 2);
        double volume = area * length;

        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
}
