package Vehicle;
public class Car extends Vehicle {
    private int number_of_doors;

    // Constructors
    public Car(){
        super();
        // variables will be set to ZEROS automatic
    }

    public Car(int r1, Person o, int s, double r2, String c, int n){
        super(r1, o, s, r2, c);
        this.number_of_doors = n;
    }

    // Setters
    public void setNumberOfDoors(int n){
        this.number_of_doors = n;
    }

    // Getters
    public int getNumberOfDoors(){
        return this.number_of_doors;
    }
}