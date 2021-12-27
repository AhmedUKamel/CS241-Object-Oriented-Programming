package Question_2;
public class Faculty extends Employee {
    private double office_hours;
    private double rank;

    // Constructors
    public Faculty(){
        super();
        // variables will be set to ZEROS automatic
    }

    public Faculty(String n, String a, String p, String e, String o, double s, String h, double o2, double r){
        super(n, a, p, e, o, s, h);
        this.office_hours = o2;
        this.rank = r;
    }

    // Setters
    public void setOffice_hourse(double o){
        this.office_hours = o;
    }

    public void setRank(double r){
        this.rank = r;
    }

    // Getters
    public double getOfficeHours(){
        return this.office_hours;
    }

    public double getRank(){
        return this.rank;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
                "\nOffice hours : " + this.office_hours + 
                "\nRank : " + this.rank;
    }
}