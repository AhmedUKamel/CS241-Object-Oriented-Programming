import java.util.Scanner;
public class Problem_10{
 
    public static void main(String[] args) {
        
        System.out.print("Enter Milliseconds: ");
        long milliseconds = new Scanner(System.in).nextLong();
        
        System.out.print(convertMillis(milliseconds));
        
    }
 
    public static String convertMillis(long millis){
        String seconds, minutes, hours;
        
        hours = String.valueOf(millis/(1000*60*60));
        millis %= (1000*60*60);
        minutes = String.valueOf(millis/(1000*60));
        millis %= (1000*60);
        seconds = String.valueOf(millis/1000);
        
        return hours + ":" + minutes + ":" + seconds;
    }
}