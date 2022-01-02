import java.util.Scanner;
public class Problem_13{
 
    public static void main(String[] args) {
        
        // get array 1
        System.out.print("Enter array size 1 : ");
        int size1 = new Scanner(System.in).nextInt();
        
        int numbers1[];
        numbers1 = new int[size1];
        
        for (int i = 0; i < size1; i++){
            System.out.print("Enter element " + (i+1) + " of array 1 : ");
            numbers1[i] = new Scanner(System.in).nextInt();
        }

        // get array 2        
        System.out.print("Enter array size 2 : ");
        int size2 = new Scanner(System.in).nextInt();
        
        int numbers2[];
        numbers2 = new int[size2];
        
        for (int i = 0; i < size2; i++){
            System.out.print("Enter element " + (i+1) + " of array 2 : ");
            numbers2[i] = new Scanner(System.in).nextInt();
        }
        
        // common array
        int common[], index = 0;
        common = new int[size1];
        
        for (int i = 0 ; i < size1 ; i++){
            for (int j = 0 ; j < size2 ; j++){
                if (numbers1[i] == numbers2[j]){
                    common[index++] = numbers1[i];
                }
            }
        }
        
        
        if (common.length == 0) System.out.println("No common elements found");
        else {
            for (int i = 0; i < index ; i++) System.out.print(common[i] + "\t");
        }
    }
}