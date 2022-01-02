import java.util.Scanner;
public class Problem_3{
	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		
		if (isPalindrome(num)) System.out.print("Number is palindrome");
		else System.out.print("Number is not palindrome");
		
	}
	public static boolean isPalindrome(int number){
	    int rev = 0, copy = number;
	    while (number != 0){
	        rev *= 10;
	        rev += number % 10;
	        number /= 10;
	    }
	    if (copy == rev) return true;
	    else return false;
	}
}
