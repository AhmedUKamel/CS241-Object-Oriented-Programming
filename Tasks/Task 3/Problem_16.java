import java.util.Scanner;
public class Problem_16{
 
    public static void main(String[] args) {
    
        System.out.print("Enter size of two arrays : ");
        int size = new Scanner(System.in).nextInt();
        
        double[] arr1 = new double[size];
        double[] arr2 = new double[size];
        
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i+1) + " for array 1 : ");
            arr1[i] = new Scanner(System.in).nextInt();
        }
        
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i+1) + " for array 2 : ");
            arr2[i] = new Scanner(System.in).nextInt();
        }
        
        if (equalArrays(arr1, arr2)) System.out.println("Two arrays are equal");
        else System.out.println("Two arrays are not equal");
    }
    
    public static boolean equalArrays(double[] arr1, double[] arr2){
        
        int size = arr1.length;
        boolean flag = true;
        
        for (int i = 0; i < size; i++){
            if (arr1[i] != arr2[i]){
                flag = false;
                break;
            }
        }
        
        return flag;
    }
}