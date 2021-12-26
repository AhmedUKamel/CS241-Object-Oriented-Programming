package Invoice;
public class Invoice{
    private int ID;
    private Customer customer;
    private double amount;

    // Constructors
    public Invoice(int i, Customer c, double a){
        this.ID = i;
        this.customer = c;
        this.amount = a;
    }

    // Setters
    public void setCustomer(Customer c){
        this.customer = c;
    }

    public void setAmount(double a){
        this.amount = a;
    }

    // Getters
    public int getID(){
        return this.ID;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public double getAmount(){
        return this.amount;
    }

    public int getCustomerID(){
        return this.customer.getID();
    }

    public double getAmountAfterDiscount(){
        return this.amount * (100 - this.customer.getDiscount()) / 100;
    }

    // Other Methods
    public String toString(){
        return  "Invoice ID : " + this.ID +
                "\nCustomer : \n" + this.customer.toString() +
                "\nAmount : " + this.amount +
                "\nAmount After Discount : " + this.getAmountAfterDiscount();
    }
}