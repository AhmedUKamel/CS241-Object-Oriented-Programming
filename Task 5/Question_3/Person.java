package Question_3;
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
}