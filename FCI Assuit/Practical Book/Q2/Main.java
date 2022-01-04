import java.util.Scanner;
public class Main {
    public static void main(String...args){
        // prompts the user to enter line's first point
        System.out.print("Enter first point (X, Y) : ");
        double[] point1 = getPoint();

        // prompts the user to enter line's second point
        System.out.print("Enter second point (X, Y) : ");
        double[] point2 = getPoint();

        // prompts the user to enter ball point
        System.out.print("Enter ball (X, Y) : ");
        double[] ball = getPoint();

        if(isAbove(point1, point2, ball))
            System.out.println("Ball is above the line");
        else
            System.out.println("Ball is not above the line");
    }

    public static double[] getPoint() {
        // receive the input as line
        String point = new Scanner(System.in).nextLine();
        // split the input
        String[] temp = point.split(",");
        // cast the input
        double[] points = new double[temp.length];
        for(int i = 0; i < temp.length; i++)
            points[i] = Double.parseDouble(temp[i]);
        return points;
    }

    public static boolean isAbove(double[] p1, double[] p2, double[] b){
        // calculate the slope
        double slope = (p1[1] - p2[1]) / (p1[0] - p2[0]);
        // check if point achieve the line
        double correct = slope * b[0];
        return b[1] > correct;
    }
}
/*
In a mobile game the player should throw a boll above
a certain area. Suppose that margin line coordinates are
(2, 50) and (45, 25), write a program that takes the ball
position and determine if the ball above the line or not.
For example if the user enters (40, 33) as the ball
coordinates the program should print that the ball is
above the line.
*/