import java.util.Scanner;
public class Problem_18{
	public static void main(String[] args) {
		
		// First way 
		// Create Array (Size = 10)
		int[] numbers = new int[10];
		
		// Receive 10 numbers from user
		for(int i = 0; i < 10; i++){
			System.out.print("Enter number " + (i+1) + " : ");
			numbers[i] = new Scanner(System.in).nextInt();
		}
		
		// Call eliminateDuplicates method
		int[] new_numbers = eliminateDuplicates(numbers);
		
		// Print the eliminated array (new numbers)
		System.out.print("The distinct numbers : ");
		for (int i = 0; i < 10; i++){
			if(new_numbers[i] != 0)					// To only avoid printing ZEROs
			System.out.print(new_numbers[i] + " ");
		}
		
		// Second way 
		// Receive the numbers as string line
		System.out.print("\nEnter 10 numbers : ");
		String numbers_str = new Scanner(System.in).nextLine();
		
		// Split string into SubStrings array
		String[] str = numbers_str.split(" ");
		
		// Convert string array into integers array
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++){
		    nums[i] = Integer.parseInt(str[i]);
		}
		
		// Call function for integers array
		int[] eliminated = eliminateDuplicates(nums);
		
		// Print the eliminated array (new numbers)
		System.out.print("The distinct numbers : ");
		for (int i = 0; i < 10; i++){
			if(new_numbers[i] != 0)					// To only avoid printing ZEROs
			System.out.print(new_numbers[i] + " ");
		}
	}
	
	public static int[] eliminateDuplicates(int[] list){
	    
	    int[] eliminated = new int[list.length];
	    int index = 0;
	    boolean flag = false;
	    
	    for (int i = 0; i < list.length; i++){   	// Loop on the non-eliminated array
	        for (int j = 0; j < 10; j++){  			// Loop on eliminated array
	            if (list[i] == eliminated[j]){		// Check if number from non-eliminated is found in eliminated
	                flag = true;
	                break;
	            }
	        }
	        
	        if (!flag){								// If not found then add the number to eliminated
	            eliminated[index++] = list[i];
	        } else{									// If found don't add
	            flag = false;
	        }
	    }
	    return eliminated;
	}
}
