public abstract class Person{
    private String first_name;
    private String last_name;
    private String gender;
    private String address;
    private String ssn;
    private int age;

    // Constructors
    public Person(){};

    // Setters
    public void setFirstName(String f){
        this.first_name = f;
    }

    public void setLastName(String l){
        this.last_name = l;
    }

    public void setGender(String g){
        this.gender = g;
    }

    public void setAddress(String a){
        this.address = a;
    }

    public void setSSN(String s){
        this.ssn = s;
    }

    public void setAge(int a){
        this.age = a;
    }

    // Getters
    public String getFirstName(){
        return this.first_name;
    }

    public String getLastName(){
        return this.last_name;
    }

    public String getGender(){
        return this.gender;
    }

    public String getAddress(){
        return this.address;
    }

    public String getSSN(){
        return this.ssn;
    }

    public int getAge(){
        return this.age;
    }

    // Other Methods
    public String toString(){
        return  "First Name : " + this.first_name +
                "\nLast Name : " + this.last_name + 
                "\nGender : " + this.gender +
                "\nAddress : " + this.address +
                "\nSocial society number : " + this.ssn +
                "\nAge : " + this.age + " years";
    }

    public void printDetails(){
        System.out.println(this.toString());
    }
}