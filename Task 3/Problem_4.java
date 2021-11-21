import java.util.Scanner;
import java.text.DecimalFormat;
public class Problem_4{
	public static void main(String[] args) {
		System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
		DecimalFormat df = new DecimalFormat("###.####");

		int mile = 1, kilo = 20;
		for (int row = 1; row <= 10; row++){
		    System.out.print(mile + "\t" + df.format(mileToKilometer(mile)) + "\t\t|\t");
		    mile++;
		    
		    System.out.print(kilo + "\t\t" + df.format(kilometerToMile(kilo)));
		    kilo+= 5;
		    
		    System.out.println();
		}
		
	}
	public static double mileToKilometer(double mile){
	    return mile * 1.6;
	    
	}
    public static double kilometerToMile(double kilometer){
        return kilometer * 0.6215;
    }
}
