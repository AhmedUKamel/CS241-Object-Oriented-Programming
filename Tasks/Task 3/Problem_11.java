import java.util.Scanner;
public class Problem_11{
 
    public static void main(String[] args) {
        
        int numbers[];
        numbers = new int[11];
        
        for (int i = 0; i<11 ; i++){
            System.out.print("Enter number " + (i+1) + " of array : ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        
        for (int i = 0; i<10 ; i++){
            if (numbers[i] > numbers[10]) System.out.println(numbers[i] + ">" + numbers[10]);
            else if (numbers[i] < numbers[10]) System.out.println(numbers[i] + "<" + numbers[10]);
            else if (numbers[i] == numbers[10]) System.out.println(numbers[i] + "=" + numbers[10]);
        }
    }
}