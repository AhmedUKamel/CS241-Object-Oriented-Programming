package Question_2;
public class Employee extends Person {
    private String office;
    private double salary;
    private String hire_date;

    // Constructors
    public Employee(){
        super();
        // variables will be set to 'null' or ZEROS automatic
    }

    public Employee(String n, String a, String p, String e, String o, double s, String h){
        super(n, a, p, e);
        this.office = o;
        this.salary = s;
        this.hire_date = h;
    }

    // Setters
    public void setOffice(String o){
        this.office = o;
    }

    public void setSalart(double s){
        this.salary = s;
    }

    public void setHireDate(String h){
        this.hire_date = h;
    }

    // Getters
    public String getOffice(){
        return this.office;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getHireDate(){
        return this.hire_date;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "\nOffice : " + this.office +
                "\nSalary : " + this.salary + 
                "\nHire Date : " + this.hire_date ;
    }
}