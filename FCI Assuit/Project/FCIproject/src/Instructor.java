import java.util.Scanner;
public class Instructor extends Person {
    private static Scanner sc = new Scanner(System.in);
    private String specialization;
    private String rank;
    private double salary;

    // Constructors
    public Instructor(){};

    // Setters
    public void setSpecialization(String s){
        this.specialization = s;
    }

    public void setRank(String r){
        this.rank = r;
    }

    public void setSalary(double s){
        this.salary = s;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "\nSpecialization : " + this.specialization +
                "\nRank : " + this.rank + 
                "\nSalary : " + this.salary;
    }

    @Override
    public void printDetails(){
        System.out.println(this.toString());
    }

    public static Instructor addInstructor(){
        Instructor i = new Instructor();
        try {
            System.out.print("Enter instructor's First Name : ");
            i.setFirstName(sc.next());
            System.out.print("Enter instructor's Last Name : ");
            i.setLastName(sc.next());
            System.out.print("Enter instructor's Gender : ");
            i.setGender(sc.next());
            System.out.print("Enter instructor's Address : ");
            i.setAddress(sc.next());
            System.out.print("Enter instructor's Social society number : ");
            i.setSSN(sc.next());
            System.out.print("Enter instructor's Age : ");
            i.setAge(sc.nextInt());
            System.out.print("Enter instructor's Specialization : ");
            i.setSpecialization(sc.next());
            System.out.print("Enter instructor's Rank : ");
            i.setRank(sc.next());
            System.out.print("Enter instructor's Salary : ");
            i.setSalary(sc.nextDouble());
            return i;
        } catch (Exception e){
            System.out.println("Invalid input.");
            return new Instructor();
        }
    }

    public void editInstructor(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose attribute to edit for " + this.getFirstName());
            System.out.println("1.First Name\n2.Last Name\n3.Gender\n4.Address");
            System.out.println("5.SSN\n6.Age\n7.Specialization\n8.Rank\n9.Salary");
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
                    case 7: System.out.print("Enter new Specialization : "); this.setSpecialization(sc.next()); break;
                    case 8: System.out.print("Enter new Rank : "); this.setRank(sc.next()); break;
                    case 9: System.out.print("Enter new Salary : "); this.setSalary(sc.nextDouble()); break;
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