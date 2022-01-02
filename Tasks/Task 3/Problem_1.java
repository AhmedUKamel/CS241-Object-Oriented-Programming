import java.util.Scanner;
public class Problem_1{
	public static void main(String[] args) {
		
		System.out.print("Enter first number : ");
		double n1 = new Scanner(System.in).nextDouble();
		System.out.print("Enter second number : ");
	    double n2 = new Scanner(System.in).nextDouble();
	    System.out.print("Enter third number : ");
	    double n3 = new Scanner(System.in).nextDouble();
	    
	    displaySortedNumbers(n1, n2, n3);
		    
	}
	public static void displaySortedNumbers( double num1, double num2, double num3) {
	    if (num1>=num2 && num1>=num3){
	        if (num2>num3) System.out.println(num1 + " >= " + num2 + " >= " + num3);
	        else System.out.println(num1 + " >= " + num3 + " >= " + num2);
	    }
	    else if (num2>=num1 && num2>=num3){
	        if (num1>num3) System.out.println(num2 + " >= " + num1 + " >= " + num3);
	        else System.out.println(num2 + " >= " + num3 + " >= " + num1);
	    }
	    else if (num3>=num1 && num3>=num2){
	        if (num1>num2) System.out.println(num3 + " >= " + num1 + " >= " + num2);
	        else System.out.println(num3 + " >= " + num2 + " >= " + num1);
	    }
	}
}
