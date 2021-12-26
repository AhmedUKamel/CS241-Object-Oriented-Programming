package Vehicle;
public class Truck extends Vehicle {
    private int number_of_axles;
    private int weight;

    // Constructors
    public Truck(){
        super();
        // variables will be set to ZEROS automatic
    }

    public Truck(int r1, Person o, int s, double r2, String c, int n, int w){
        super(r1, o, s, r2, c);
        this.number_of_axles = n;
        this.weight = w;
    }

    // Setters
    public void setNumberOfAxles(int n){
        this.number_of_axles = n;
    }

    public void setWeight(int w){
        this.weight = w;
    }

    // Getters
    public int getNumberOfAxles(){
        return this.number_of_axles;
    }

    public int getWeight(){
        return this.weight;
    }

    // Other methods
    @Override
    public double getSalePrice(){
        if (this.weight > 2000)
            return super.getRegularPrice() * 0.9; // 10 % discount
        else
            return super.getRegularPrice() * 0.8; // 20 % discount
    }
}
