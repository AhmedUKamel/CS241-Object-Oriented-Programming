package secondPackage;
import firstPackage.*;
public class Vehicle {
    private int registration_number;
    protected Person owner;
    protected int speed;
    public double regular_price;
    String color;

    // Constructors
    public Vehicle(){
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
    public void setRegistrationNumber(int r){
        this.registration_number = r;
    }

    public void setOwner(Person o){
        this.owner = o;
    }

    public void setSpeed(int s){
        this.speed = s;
    }

    public void setRegularPrice(double r){
        this.regular_price = r;
    }

    public void setColor(String c){
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