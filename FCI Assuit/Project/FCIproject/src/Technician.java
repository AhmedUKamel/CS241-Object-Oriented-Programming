import java.util.Scanner;
public class Technician extends Person {
    private static Scanner sc = new Scanner(System.in);
    private double salary;

    // Constructors
    public Technician(){};

    // Setters
    public void setSalary(double s){
        this.salary = s;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "\nSalary : " + this.salary;
    }

    @Override
    public void printDetails(){
        System.out.println(this.toString());
    }

    public static Technician addTechnicians(){
        Technician t = new Technician();
        try {
            System.out.print("Enter technicians's First Name : ");
            t.setFirstName(sc.next());
            System.out.print("Enter technicians's Last Name : ");
            t.setLastName(sc.next());
            System.out.print("Enter technicians's Gender : ");
            t.setGender(sc.next());
            System.out.print("Enter technicians's Address : ");
            t.setAddress(sc.next());
            System.out.print("Enter technicians's Social society number : ");
            t.setSSN(sc.next());
            System.out.print("Enter technicians's Age : ");
            t.setAge(sc.nextInt());
            System.out.print("Enter technicians's Salary : ");
            t.setSalary(sc.nextDouble());
            return t;
        } catch (Exception e){
            System.out.println("Invalid input.");
            return new Technician();
        }
    }

    public void editTechnicians(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose attribute to edit for " + this.getFirstName());
            System.out.println("1.First Name\n2.Last Name\n3.Gender\n4.Address");
            System.out.print("5.SSN\n6.Age\n7.Salary\n8.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: System.out.print("Enter new First Name : "); this.setFirstName(sc.next()); break;
                    case 2: System.out.print("Enter new Last Name : "); this.setLastName(sc.next()); break;
                    case 3: System.out.print("Enter new Gender : "); this.setGender(sc.next()); break; 
                    case 4: System.out.print("Enter new Address : "); this.setAddress(sc.next()); break;
                    case 5: System.out.print("Enter new SSN : "); this.setSSN(sc.next()); break;
                    case 6: System.out.print("Enter new Age : "); this.setAge(sc.nextInt()); break;
                    case 7: System.out.print("Enter new Salary : "); this.setSalary(sc.nextDouble()); break;
                    case 8: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }
}