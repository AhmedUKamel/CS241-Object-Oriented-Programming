package Invoice;
public class Customer {
    private int ID;
    private String name;
    private int discount;

    // Constructors
    public Customer(int i, String n, int d){
        this.ID = i;
        this.name = n;
        this.discount = d;
    }

    // Setters
    public void setDiscount(int d){
        this.discount = d;
    }

    // Getters
    public int getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public int getDiscount(){
        return this.discount;
    }

    // Other Methods
    public String toString(){
        return  "Customer ID : " + this.ID +
                "\nCustomer Name : " + this.name +
                "\nCustomer Discount : " + this.discount + " %";
    }
}
