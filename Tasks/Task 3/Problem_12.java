import java.util.Scanner;
public class Problem_12{
 
    public static void main(String[] args) {
        
        System.out.print("Enter array size : ");
        int size = new Scanner(System.in).nextInt();
        
        int numbers[];
        numbers = new int[size];
        
        for (int i = 0; i< size ; i++){
            System.out.print("Enter number " + (i+1) + " of array : ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        
        System.out.print("Enter element : ");
        int element = new Scanner(System.in).nextInt();
        
        System.out.println("Index for " + element + " = " + findElement(numbers, element));
    }
    
    public static int findElement(int[] array, int element){
        
        int size = array.length, index = -1;
        
        for (int i = 0 ; i < size ; i++){
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        
        return index;
    }
}