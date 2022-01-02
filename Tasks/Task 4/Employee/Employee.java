package Employee;
public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    // Constructors
    public Employee(String f, String l, double s){
        firstName = f;
        lastName = l;
        if (s > 0) monthlySalary = s;
        else monthlySalary = 0;
    }
    
    // Setters
    public void setFirstName(String f){
        firstName = f;
    }
    
    public void setLastName(String l){
        lastName = l;
    }

    public void setMonthlySalary(double s){
        monthlySalary = s;
    }

    // Getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }
}