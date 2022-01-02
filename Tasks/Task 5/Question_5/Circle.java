package Question_5;
public class Circle {
    private double radius;

    // Constructors
    public Circle(double radius){
        radius = radius;
    }

    // Getters
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}