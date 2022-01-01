package firstPackage;
import secondPackage.*;
public class Person {
    private String name;
    private String address;
    protected double salary;
    protected static int no_of_person;
    public String gender;
    double tall;

    // Constructors
    public Person(){
        no_of_person++;
    }

    protected Person(String n, String a){
        no_of_person++;
        this.name = n;
        this.address = a;
    }

    private Person(String n, String a, double s, String g, double t){
        this.name = n;
        this.address = a;
        this.salary = s;
        this.gender = g;
        this.tall = t;
        no_of_person++;
    }

    // Setters
    protected void setName(String n){
        this.name = n;
    }

    protected void setAddress(String a){
        this.address = a;
    }

    protected void setSalary(double s){
        this.salary = s;
    }

    protected void setGender(String g){
        this.gender = g;
    }
    
    protected void setTall(double t){
        this.tall = t;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getGender(){
        return this.gender;
    }

    public double getTall(){
        return this.tall;
    }

    public static int getNumberOfPersons(){
        return no_of_person;
    }

    // Other Methods
    public String toString(){
        return  "Name : " + this.name +
                "\nAddress : " + this.address +
                "\nSalary : " + this.salary +
                "\nGender : " + this.gender +
                "\nTall : " + this.tall;
    }

    public static Person personConstructor(String n, String a, double s, String g, double t){
        return new Person(n, a, s, g, t);
    }
}
/*
> In this class you can:
 *  Create an empty Object (Person()) from any Package or class.
 *  Create an non-empty Object (Person(String n, String a)) 
    from only this package or subclasses outside this package.
 *  Create an non-empty Object (Person(String n, String a, double s, String g, double t)) from only this class.
 *  Set any value from only this Package or subclasses outside this package.
 *  Get any value from any package.
 *  Use any Methods under 'Other Methods' from any package.
**/