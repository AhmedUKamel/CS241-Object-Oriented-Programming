import java.util.Scanner;
public class Problem_2{
	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.print("Reversed number : " + reverse(num));
		
	}
	public static int reverse(int number){
	    int rev = 0;
	    while (number != 0){
	        rev *= 10;
	        rev += number % 10;
	        number /= 10;
	    }
	    return rev;
	}
}
