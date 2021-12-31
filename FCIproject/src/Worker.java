import java.util.Scanner;
public class Worker extends Person {
    private static Scanner sc = new Scanner(System.in);
    private double salary;

    // Constructors
    public Worker(){};

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

    public static Worker addWorker(){
        Worker w = new Worker();
        try {
            System.out.print("Enter worker's First Name : ");
            w.setFirstName(sc.next());
            System.out.print("Enter worker's Last Name : ");
            w.setLastName(sc.next());
            System.out.print("Enter worker's Gender : ");
            w.setGender(sc.next());
            System.out.print("Enter worker's Address : ");
            w.setAddress(sc.next());
            System.out.print("Enter worker's Social society number : ");
            w.setSSN(sc.next());
            System.out.print("Enter worker's Age : ");
            w.setAge(sc.nextInt());
            System.out.print("Enter worker's Salary : ");
            w.setSalary(sc.nextDouble());
            return w;
        } catch (Exception e){
            System.out.println("Invalid input.");
            return new Worker();
        }
    }

    public void editWorker(){
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