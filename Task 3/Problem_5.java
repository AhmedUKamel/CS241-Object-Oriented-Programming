import java.util.Scanner;
import java.lang.Math;
public class Problem_5{
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		int number = new Scanner(System.in).nextInt();
		
		if (isPrime(number)) System.out.println("Number is prime");
		else System.out.println("Number is not prime");
	}
	public static boolean isPrime(int n){
	    boolean flag = true;
	    for (int i = 2 ; i <= Math.sqrt(n); i++){
	        if (n % i == 0){
	            flag = false;
	            break;
	        }
	    }
	    return flag;
	}
}
