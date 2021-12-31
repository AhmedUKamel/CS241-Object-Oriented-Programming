import java.util.Scanner;
public class Administrator extends Person {
    private static Scanner sc = new Scanner(System.in);
    private String job;
    private double salary;
    private double working_hours;

    // Constructors
    public Administrator(){};

    // Setters
    public void setJob(String j){
        this.job = j;
    }

    public void setSalary(double s){
        this.salary = s;
    }

    public void setWorkingHours(double w){
        this.working_hours = w;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "\nJob : " + this.job +
                "\nSalary : " + this.salary + 
                "\nWorking Hours : " + this.working_hours;
    }

    @Override
    public void printDetails(){
        System.out.println(this.toString());
    }

    public static Administrator addAdministrators(){
        Administrator a = new Administrator();
        try {
            System.out.print("Enter administrators's First Name : ");
            a.setFirstName(sc.next());
            System.out.print("Enter administrators's Last Name : ");
            a.setLastName(sc.next());
            System.out.print("Enter administrators's Gender : ");
            a.setGender(sc.next());
            System.out.print("Enter administrators's Address : ");
            a.setAddress(sc.next());
            System.out.print("Enter administrators's Social society number : ");
            a.setSSN(sc.next());
            System.out.print("Enter administrators's Age : ");
            a.setAge(sc.nextInt());
            System.out.print("Enter administrators's Job : ");
            a.setJob(sc.next());
            System.out.print("Enter administrators's Salary : ");
            a.setSalary(sc.nextDouble());
            System.out.print("Enter administrators's Working hours : ");
            a.setWorkingHours(sc.nextDouble());
            return a;
        } catch (Exception e){
            System.out.println("Invalid input.");
            return new Administrator();
        }
    }

    public void editAdministrators(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose attribute to edit for " + this.getFirstName());
            System.out.println("1.First Name\n2.Last Name\n3.Gender\n4.Address");
            System.out.println("5.SSN\n6.Age\n7.Job\n8.Salary\n9.Working hours");
            System.out.print("10.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: System.out.print("Enter new First Name : "); this.setFirstName(sc.next()); break;
                    case 2: System.out.print("Enter new Last Name : "); this.setLastName(sc.next()); break;
                    case 3: System.out.print("Enter new Gender : "); this.setGender(sc.next()); break; 
                    case 4: System.out.print("Enter new Address : "); this.setAddress(sc.next()); break;
                    case 5: System.out.print("Enter new SSN : "); this.setSSN(sc.next()); break;
                    case 6: System.out.print("Enter new Age : "); this.setAge(sc.nextInt()); break;
                    case 7: System.out.print("Enter new Job : "); this.setJob(sc.next()); break;
                    case 8: System.out.print("Enter new Salary : "); this.setSalary(sc.nextDouble()); break;
                    case 9: System.out.print("Enter new Working hours : "); this.setWorkingHours(sc.nextDouble()); break;
                    case 10: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }
}