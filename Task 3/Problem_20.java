import java.util.Scanner;
import java.util.Random;
public class Problem_20{
	public static void main(String[] args) {
	    
	    // receive the numbers as string line
		System.out.print("Enter list of numbers : ");
		String list = new Scanner(System.in).nextLine();
		
		// split string into string array
		String[] str = list.split(" ");
		
		// convert string array into integers array
		int[] nums = new int[str.length];
		for (int i = 0; i < str.length; i++){
		    nums[i] = Integer.parseInt(str[i]);
		}
		
		// call function for list
		int rand = getRandom(nums);
		
		// print random value from givven list
		System.out.println("Random value = " + rand);
	}
	
	public static int getRandom(int... numbers){
	    
	    // create Random Object
	    boolean flag = true;
	    int value = 0;
	    
	    while (flag){
	        int rand = new Random().nextInt();
	        for (int x : numbers){
	            if (rand == x){
	                value = rand;
	                flag = false;
	                break;
	            }
	        }
	    }
	    
	    return value;
	}
}