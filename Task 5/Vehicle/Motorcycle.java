package Vehicle;
public class Motorcycle extends Vehicle{
    private int manufacturerDiscount;
    private boolean hasSideCar;

    // Constructors
    public Motorcycle(){
        super();
        // variables will be set to ZEROS automatic
    }

    public Motorcycle(int r1, Person o, int s, double r2, String c, int m, boolean h){
        super(r1, o, s, r2, c);
        this.manufacturerDiscount = m;
        this.hasSideCar = h;
    }

    // Setters
    public void setManufacturerDiscount(int n){
        this.manufacturerDiscount = n;
    }

    public void setHasSideCar(boolean h){
        this.hasSideCar = h;
    }

    // Getters
    public int getManufacturerDiscount(){
        return this.manufacturerDiscount;
    }

    public boolean getHasSideCar(){
        return this.hasSideCar;
    }

    // Other Methods
    @Override
    public double getSalePrice(){
        return super.getRegularPrice() - this.manufacturerDiscount;
    }
}
