import java.util.Scanner;
public class Problem_6{
	public static void main(String[] args) {
		
		System.out.println("I\tM(I)");
		for (int i = 1; i <= 20 ; i++) System.out.println(i+ "\t" +MofI(i));
		
	}
	public static double MofI(int i){
	    double result = 0, counter = 1;
	    while (counter <= i){
	        result += (counter/ (counter+2));
	        counter++;
	    }
	    return result;
	}
}
