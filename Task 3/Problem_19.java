import java.util.Scanner;
public class Problem_19{
	public static void main(String[] args) {
	    
	    // receive the numbers as string line
		System.out.print("Enter list : ");
		String list = new Scanner(System.in).nextLine();
		
		// split string into string array
		String[] str = list.split(" ");
		
		// convert string array into integers array
		int[] nums = new int[str.length];
		for (int i = 0; i < str.length; i++){
		    nums[i] = Integer.parseInt(str[i]);
		}
		
		// call function for list
		if (isSorted(nums)){
		    System.out.println("The list is sorted");
		}
		else{
		    System.out.println("The list is not sorted");
		}
	}
	
	public static boolean isSorted(int[] list){
	    // let the array be sorted
	    boolean flag = true;
	    
	    // check the array
	    for (int i = 1; i < list.length - 1; i++){
	        if (list[i] > list[i+1] || list[i] < list[i-1]){
	            flag = false;
	            break;
	        }
	    }
	    
	    return flag;
	    
	}
}