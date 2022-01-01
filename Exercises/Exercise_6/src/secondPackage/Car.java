package secondPackage;
import firstPackage.*;
public class Car extends Vehicle {
    private int number_of_doors;

    // Constructors
    public Car(){
        super();
        // variables will be set to ZEROS automatic
    }

    protected Car(int r1, Person o, int s, double r2, String c, int n){
        super(r1, o, s, r2, c);
        this.number_of_doors = n;
    }

    // Setters
    protected void setNumberOfDoors(int n){
        this.number_of_doors = n;
    }

    // Getters
    public int getNumberOfDoors(){
        return this.number_of_doors;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "Number of doors : " + this.number_of_doors;
    }

    public static void emptyVehicle(Vehicle vehicle){
        vehicle = new Vehicle();
    }
}
/*
> In this class you can:
 *  Create an empty Object (Car()) from any Package or class..
 *  Create an non-empty Object (Car(int r1, Person o, int s, double r2, String c, int n)) 
    from only this package.
 *  Set any value from only this Package.
 *  Get any value from any package.
 *  Use any Methods under 'Other Methods' from any package.
**/