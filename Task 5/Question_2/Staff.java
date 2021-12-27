package Question_2;
public class Staff extends Employee {
    private String title;

    // Constructors
    public Staff(){
        super();
        // variables will be set to 'null' automatic
    }

    public Staff(String n, String a, String p, String e, String o, double s, String h, String t){
        super(n, a, p, e, o, s, h);
        this.title = t;
    }

    // Setters
    public void setTitle(String t){
        this.title = t;
    }

    // Getters
    public String getTitle(){
        return this.title;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "\nTitle : " + this.title;
    }
}