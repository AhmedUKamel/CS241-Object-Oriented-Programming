import java.util.Scanner;
import java.util.Random;
public class Problem_15{
 
    public static void main(String[] args) {
        
        // frequency array
        int[] frequeny = new int[10];
        
        for (int i = 1 ; i<= 200 ; i++){
            int x = new Random().nextInt(10);
            
            frequeny[x]++;
        }
        
        for (int i = 0; i < 10 ; i++){
            System.out.println("Counter for " + i + " = " + frequeny[i]);
        }
    }
}