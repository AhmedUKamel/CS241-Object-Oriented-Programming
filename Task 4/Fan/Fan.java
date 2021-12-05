package Fan;
public class Fan{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;

    String color;

    // Constructor
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }

    public Fan(int s, boolean o, double r, String c){
        on = o;
        color = c;
        if (s > 0 && s < 4) speed = s;
        else System.out.println("Invalid input");
        if (r > 0) radius = r;
        else System.out.println("Radius can\'t be negative");
    }

    // Setters
    public void setSpeed(int s){
        if (s > 0 && s < 4) speed = s;
        else System.out.println("Invalid input");
    }

    public void setOn(boolean o){
        on = o;
    }

    public void setRadius(double r){
        if (r > 0) radius = r;
        else System.out.println("Radius can\'t be negative");
    }

    public void setColor(String c){
        color = c;
    }

    // Getters
    public int getSpeed(){
        return speed;
    }

    public boolean getOn(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    // Other methods
    public String toString(){
        if (on) 
            return "The fan speed is " + speed + ", it\'s color is " + color + " and radius equals to " + radius;
        else 
            return "The fan is off, it\'s color is " + color + " and radius equals to " + radius;
    }

    // Main 
    public static void main(String[] args){
        Fan f1 = new Fan();
        f1.setSpeed(f1.FAST);
        f1.setOn(true);
        f1.setRadius(10);
        f1.setColor("Yellow");
        System.out.println(f1.toString());

        Fan f2 = new Fan();
        f2.setSpeed(f2.MEDIUM);
        System.out.println(f2.toString());
    }
}