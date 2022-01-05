import java.util.Scanner;
public class Main {
    public static void main(String... args) {
        // prompts user to enter the angle
        System.out.print("Enter angle (in degrees) : ");
        double angle = new Scanner(System.in).nextDouble();
        // print sin
        System.out.println("Sin : " + getSin(angle));
        // print cos
        System.out.println("Cos : " + getCos(angle));
    }

    public static double getSin(double angle){
        return (4 * angle * (180 - angle))/(40500 - angle * (180 - angle));
    }

    public static double getCos(double angle){
        double hypotenuse = 1 / getSin(angle);
        double adjacent = Math.sqrt(hypotenuse * hypotenuse - 1);
        return adjacent / hypotenuse;
    }
}
/*
Write a java program to compute sin and cos of an angle. The program should
ask the user to enter angle value in degrees and print the sin and cos of this
angle. (don’t use Math.sin or Math.cos)

reference: https://en.wikipedia.org/wiki/Bhaskara_I%27s_sine_approximation_formula
*/