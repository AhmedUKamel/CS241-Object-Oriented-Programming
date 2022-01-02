import java.util.Scanner;
import java.lang.Math;
public class Problem_8{
 
    public static void main(String[] args) {
        System.out.print("Enter side 1 : ");
        double s1 = new Scanner(System.in).nextDouble();
        
        System.out.print("Enter side 2 : ");
        double s2 = new Scanner(System.in).nextDouble();
        
        System.out.print("Enter side 3 : ");
        double s3 = new Scanner(System.in).nextDouble();
        
        if (isValid(s1, s2, s3)) System.out.println("Area = " + area(s1, s2, s3));
        else System.out.println("Invalid");
    }
 
    public static boolean isValid(double side1, double side2, double side3){
        if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1) return true;
        else return false;
    }
    public static double area(double side1, double side2, double side3){
        double s = (side1+side2+side3)/2.0;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
    }
}