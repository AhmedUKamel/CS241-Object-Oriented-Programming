import java.util.Scanner;
public class Problem_17{
 
    public static void main(String[] args) {
    
        // integer array
        System.out.print("Enter size of integer arrays : ");
        int size1 = new Scanner(System.in).nextInt();
        
        int[] arr1 = new int[size1];
        
        for (int i = 0; i < size1; i++){
            System.out.print("Enter element " + (i+1) + " for integers array : ");
            arr1[i] = new Scanner(System.in).nextInt();
        }
        
        
        
        // double array
        System.out.print("Enter size of double arrays : ");
        int size2 = new Scanner(System.in).nextInt();
        
        double[] arr2 = new double[size2];
        
        for (int i = 0; i < size2; i++){
            System.out.print("Enter element " + (i+1) + " for double array : ");
            arr2[i] = new Scanner(System.in).nextDouble();
        }
        
        System.out.println("Average for integer = " + average(arr1));
        System.out.println("Average for double = " + average(arr2));
    }
    
    public static int average(int[] array){
        int size = array.length, sum = 0;
        
        for (int i = 0; i < size; i++) sum += array[i];
        
        return (sum/size);
    }
    
    public static double average(double[] array){
        double size = array.length, sum = 0;
        
        for (int i = 0; i < size; i++) sum += array[i];
        
        return (sum/size);
    }
}