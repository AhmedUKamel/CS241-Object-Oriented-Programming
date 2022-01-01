package secondPackage;
import firstPackage.*;
public class Vehicle {
    private int registration_number;
    protected Person owner;
    protected int speed;
    public double regular_price;
    String color;

    // Constructors
    protected Vehicle(){
        // variables will be set to 'null' or ZEROS automatic
    }

    public Vehicle(int r1, Person o, int s, double r2, String c){
        this.registration_number = r1;
        this.owner = o;
        this.speed = s;
        this.regular_price = r2;
        this.color = c;
    }

    // Setters
    protected void setRegistrationNumber(int r){
        this.registration_number = r;
    }

    protected void setOwner(Person o){
        this.owner = o;
    }

    protected void setSpeed(int s){
        this.speed = s;
    }

    protected void setRegularPrice(double r){
        this.regular_price = r;
    }

    protected void setColor(String c){
        this.color = c;
    }

    // Getters
    public int getRegistrationNumber(){
        return this.registration_number;
    }

    public Person getOwner(){
        return this.owner;
    }

    public int getSpeed(){
        return this.speed;
    }

    public double getRegularPrice(){
        return this.regular_price;
    }

    public String getColor(){
        return this.color;
    }

    // Other Methods
    public double getSalePrice(){
        return this.regular_price;
    }

    public void transferOwner(Person n){
        this.owner = n;
    }
}
/*
> In this class you can:
 *  Create an empty Object (Vehicle()) from only this package.
 *  Create an non-empty Object (Vehicle(int r1, Person o, int s, double r2, String c)) from any Package or class.
 *  Set any value from only this Package.
 *  Get any value from any package.
 *  Use any Methods under 'Other Methods' from any package.
**/