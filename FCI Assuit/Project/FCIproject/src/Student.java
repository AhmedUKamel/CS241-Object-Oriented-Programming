import java.util.Scanner;
public class Student extends Person {
    private static Scanner sc = new Scanner(System.in);
    private String specialization;
    private double gpa;
    private int level;
    private int materials;

    // Constructors
    public Student(){};

    // Setters
    public void setSpecialization(String s){
        this.specialization = s;
    }

    public void setGPA(double g){
        this.gpa = g;
    }

    public void setLevel(int l){
        this.level = l;
    }

    public void setMaterial(int m){
        this.materials = m;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "\nSpecialization : " + this.specialization +
                "\nGPA : " + this.gpa + 
                "\nLevel : " + this.level +
                "\nMaterials : " + this.materials;
    }

    @Override
    public void printDetails(){
        System.out.println(this.toString());
    }


    public static Student addStudent(){
        Student s = new Student();
        try {
            System.out.print("Enter student's First Name : ");
            s.setFirstName(sc.next());
            System.out.print("Enter student's Last Name : ");
            s.setLastName(sc.next());
            System.out.print("Enter student's Gender : ");
            s.setGender(sc.next());
            System.out.print("Enter student's Address : ");
            s.setAddress(sc.next());
            System.out.print("Enter student's Social society number : ");
            s.setSSN(sc.next());
            System.out.print("Enter student's Age : ");
            s.setAge(sc.nextInt());
            System.out.print("Enter student's Specialization : ");
            s.setSpecialization(sc.next());
            System.out.print("Enter student's GPA : ");
            s.setGPA(sc.nextDouble());
            System.out.print("Enter student's Level : ");
            s.setLevel(sc.nextInt());
            System.out.print("Enter student's Material Number : ");
            s.setMaterial(sc.nextInt());
            return s;
        } catch (Exception e){
            System.out.println("Invalid input.");
            return new Student();
        }
    }

    public void editStudent(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose attribute to edit for " + this.getFirstName());
            System.out.println("1.First Name\n2.Last Name\n3.Gender\n4.Address");
            System.out.println("5.SSN\n6.Age\n7.Specialization\n8.GPA\n9.Level");
            System.out.print("10.Material Number\n11.Go back\nAnswer : ");
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
                    case 8: System.out.print("Enter new GPA : "); this.setGPA(sc.nextDouble()); break;
                    case 9: System.out.print("Enter new Level : "); this.setLevel(sc.nextInt()); break;
                    case 10: System.out.print("Enter new Material Number : "); this.setMaterial(sc.nextInt()); break;
                    case 11: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }
}