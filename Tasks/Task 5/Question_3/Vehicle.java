package Question_3;
public class Vehicle {
    private int registration_number;
    private Person owner;
    private int speed;
    private double regular_price;
    private String color;

    // Constructors
    public Vehicle(){
        // variables will be set to 'null' or ZEROS automatic
    }

    public Vehicle(int r1, Person o, int s, double r2, String c){
        this.registration_number = r1;
        this.owner = o;
        this.speed = s;
        this.regular_price = r2;
        this.color = c;
    }

    // Setters
    public void setRegistrationNumber(int r){
        this.registration_number = r;
    }

    public void setOwner(Person o){
        this.owner = o;
    }

    public void setSpeed(int s){
        this.speed = s;
    }

    public void setRegularPrice(double r){
        this.regular_price = r;
    }

    public void setColor(String c){
        this.color = c;
    }

    // Getters
    public int getRegistrationNumber(){
        return this.registration_number;
    }

    public Person getOwner(){
        return this.owner;
    }

    public int getSpeed(){
        return this.speed;
    }

    public double getRegularPrice(){
        return this.regular_price;
    }

    public String getColor(){
        return this.color;
    }

    // Other Methods
    public double getSalePrice(){
        return this.regular_price;
    }

    public void transferOwner(Person n){
        this.owner = n;
    }

    public static void printDetails (Vehicle myVehicle){
        String details =    "Registration Number : " + myVehicle.registration_number + 
                            "\nOwner : \n" + myVehicle.owner.toString() + 
                            "\nSpeed : " + myVehicle.speed +
                            "\nRegular price : " + myVehicle.regular_price +
                            "\nColor : " + myVehicle.color;
        System.out.println(details);
    }

    public static void printDetails (Car myCar){
        String details =    "Registration Number : " + myCar.getRegistrationNumber() + 
                            "\nOwner : \n" + myCar.getOwner().toString() + 
                            "\nSpeed : " + myCar.getSpeed() +
                            "\nRegular price : " + myCar.getRegularPrice() +
                            "\nColor : " + myCar.getColor() +
                            "\nNumber of doors : " + myCar.getNumberOfDoors();
        System.out.println(details);
    }

    public static void printDetails (Truck myTruck){
        String details =    "Registration Number : " + myTruck.getRegistrationNumber() + 
                            "\nOwner : \n" + myTruck.getOwner().toString() + 
                            "\nSpeed : " + myTruck.getSpeed() +
                            "\nRegular price : " + myTruck.getRegularPrice() +
                            "\nColor : " + myTruck.getColor() +
                            "\nNumber of axles : " + myTruck.getNumberOfAxles() +
                            "\nWeight : " + myTruck.getWeight() + 
                            "\nGet Sale Price : " + myTruck.getSalePrice();
        System.out.println(details);
    }

    public static void printDetails (Motorcycle myMotorcycle){
        String details =    "Registration Number : " + myMotorcycle.getRegistrationNumber() + 
                            "\nOwner : \n" + myMotorcycle.getOwner().toString() + 
                            "\nSpeed : " + myMotorcycle.getSpeed() +
                            "\nRegular price : " + myMotorcycle.getRegularPrice() +
                            "\nColor : " + myMotorcycle.getColor() +
                            "\nManufacturer Discount : " + myMotorcycle.getManufacturerDiscount() +
                            "\nHas Side Car : " + myMotorcycle.getHasSideCar() + 
                            "\nGet Sale Price : " + myMotorcycle.getSalePrice();
        System.out.println(details);
    }

    // Main
    public static void main(String[] args){
        // Create an Owner
        Person Ahmed = new Person();
        Ahmed.setName("AhmedKamel");
        Ahmed.setAddress("BNS");

        // Create a general Vehicle
        Vehicle vehicle = new Vehicle(150, Ahmed, 5, 1500, "Red");

        // Create a Car
        Car car = new Car(250, Ahmed, 6, 6500, "Black", 2);

        // Create a Truck
        Truck truck = new Truck(200, new Person(), 3, 9000, "Unknown", 4, 2200);

        // Create a Motorcycle
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setOwner(new Person("Mohammed", "Cairo", "011", "Mohammed@gmail.com"));
        motorcycle.setRegistrationNumber(350);
        motorcycle.setRegularPrice(7000);
        motorcycle.setSpeed(6);
        motorcycle.setHasSideCar(true);
        motorcycle.setColor("Blue");
        motorcycle.setManufacturerDiscount(2700);

        // Test printDetails Method
        Vehicle.printDetails(vehicle);
        System.out.println("---------------------------------------------");
        Vehicle.printDetails(car);
        System.out.println("---------------------------------------------");
        Vehicle.printDetails(truck);
        System.out.println("---------------------------------------------");
        Vehicle.printDetails(motorcycle);
    }
}