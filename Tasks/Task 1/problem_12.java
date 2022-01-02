import java.util.Scanner;
public class problem_12 {
    public static void main(String[] args){

        // Get first number
        System.out.print("Enter first number = ");
        int num1 = new Scanner(System.in).nextInt();
        
        // Get second number
        System.out.print("Enter second number = ");
        int num2 = new Scanner(System.in).nextInt();
        
        // Get third number
        System.out.print("Enter third number = ");
        int num3 = new Scanner(System.in).nextInt();

        // Sort three numbers
        if (num1 >= num2 && num1 >= num3){
            if (num2 >= num3) System.out.println(num1 + " >= " + num2 + " >= " + num3);
            else              System.out.println(num1 + " >= " + num3 + " >= " + num2);
        } else if (num2 >= num1 && num2 >= num3){
            if (num1 >= num3) System.out.println(num2 + " >= " + num1 + " >= " + num3);
            else              System.out.println(num2 + " >= " + num3 + " >= " + num1);
        } else if (num3 >= num1 && num3 >= num2){
            if (num1 >= num2) System.out.println(num3 + " >= " + num1 + " >= " + num2);
            else              System.out.println(num3 + " >= " + num2 + " >= " + num1);
        }
    }
}