import java.util.Scanner;
public class Problem_18{
	public static void main(String[] args) {
	    
	    // receive the numbers as string line
		System.out.print("Enter 10 numbers : ");
		String numbers = new Scanner(System.in).nextLine();
		
		// split string into string array
		String[] str = numbers.split(" ");
		
		// convert string array into integers array
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++){
		    nums[i] = Integer.parseInt(str[i]);
		}
		
		// call function for integers array
		int[] eliminated = eliminateDuplicates(nums);
		
		// get index of last element
		int index = 0;
		for (int i = 0; i < 10; i++){
		    if (eliminated[i] == eliminated[i+1]){
		        break;
		    }
		    else{
		        index++;
		    }
		}
		
		// print the eliminated array
		System.out.print("The distinct numbers : ");
		for (int i = 0; i < index; i++) System.out.print(eliminated[i] + " ");
		
	}
	
	public static int[] eliminateDuplicates(int[] list){
	    
	    int[] eliminated = new int[10];
	    int index = 0;
	    boolean flag = false;
	    
	    for (int i = 0; i < list.length; i++){
	        for (int j = 0; j < 10; j++){
	            if (list[i] == eliminated[j]){
	                flag = true;
	                break;
	            }
	        }
	        
	        if (!flag){
	            eliminated[index++] = list[i];
	        }
	        else{
	            flag = false;
	            continue;
	        }
	    }
	    
	    return eliminated;
	}
}
