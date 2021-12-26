package Person;
public class Person {
    private String name;
    private String address;
    private String phone;
    private String e_mail;

    // Constructors
    public Person(){
        // variables will be set to 'null' automatic
    }

    public Person(String n, String a, String p, String e){
        this.name = n;
        this.address = a;
        this.phone = p;
        this.e_mail = e;
    }

    // Setters
    public void setName(String n){
        this.name = n;
    }

    public void setAddress(String a){
        this.address = a;
    }

    public void setPhone(String p){
        this.phone = p;
    }

    public void setE_Mail(String e){
        this.e_mail = e;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getE_Mail(){
        return this.e_mail;
    }

    // Other Methods
    public String toString(){
        return  "Name : " + this.name +
                "\nAddress : " + this.address + 
                "\nPhone : " + this.phone + 
                "\nE-Mail : " + this.e_mail;
    }

    // Main
    public static void main(String[] args){
        // Test Person class
        Person person = new Person("Ahmed", "BNS", "+20 XXX XXX XXXX", "Username@domain.com");
        System.out.println(person.toString());

        System.out.println("---------------------------------------------");
        
        // Test Employee class
        Employee employee = new Employee();
        System.out.println(employee.toString());

        System.out.println("---------------------------------------------");
        
        // Test Faculty class
        Faculty faculty = new Faculty();
        faculty.setName("Faculty 1");
        faculty.setOffice("FCAI");
        faculty.setHireDate("12 Nov 2021");
        faculty.setRank(3.9);
        System.out.println(faculty.toString());
        
        System.out.println("---------------------------------------------");
        
        // Test Staff class
        Staff staff = new Staff("Ali", "Cairo", "+20 XXX XXX XXXX", "Ali@yhoo.com", "IT", 2600, "21 Oct 2020", "IT Manager");
        System.out.println(staff.toString());
        
        System.out.println("---------------------------------------------");

        // Test Student class
        Student student = new Student("Senior");
        System.out.println(student.toString());
    }
}