public class Car {
    String comapny;
    String name;
    String color;
    int model;
    int number_of_cars;

    // Constructors
    public Car(){
        number_of_cars++;
    }
    
    public Car(String  c1, String n, String c2, int m){
        this.comapny = c1;
        this.name = n;
        this.color = c2;
        this.model = m;
        number_of_cars++;
    }

    public Car(String n, String c2, int m){
        if(this.name == "Land Cruiser")
            this.comapny = "Toyota";
        this.name = n;
        this.color = c2;
        this.model = m;
        number_of_cars++;
    }

    // Setters
    public void setFullName(String c, String n){
        if(this.name == "Land Cruiser")
            this.comapny = "Toyota";
        else
            this.name = n; this.comapny = c;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void setModel(int m){
        if (m <= 1500)
            this.setFullName("Unknown", null);
        else
            this.model = m;
    }

    public void setName(String n){
        if (this.comapny != null)
            this.name = n;
    }

    // Other Methods
    public String toString(){
        return  "Full Name : " + this.comapny +
                " " + this.name +
                "\nModel : " + this.model +
                "\nColor : " + this.color +
                "\nNumber : " + this.number_of_cars;
    }

    // Main
    public static void main(String[] args){
        // See the test cases. 
    }

}