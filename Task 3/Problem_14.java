import java.util.Scanner;
public class Problem_14{
 
    public static void main(String[] args) {
    
        int sum = 0, counter = 0;
        
        while (true){
            System.out.print("Enter Score : ");
            int score = new Scanner(System.in).nextInt();
            
            if (score >= 0 && score <= 100) {
                sum += score;
                counter ++;
            }
            else break;
        }
        
        System.out.println("Average = " + (sum/counter));
    }
}