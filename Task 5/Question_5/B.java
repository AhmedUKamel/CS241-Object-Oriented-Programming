package Question_5;
public class B extends Circle {
    private double length;

    // Constructors
    public B(double radius, double length){
        Circle(radius);
        length = length;
    }

    @Override
    public double getArea(){
        return super.getArea() * length;
    }
}

/*
	Error: Implicit super constructor Circle() is undefined.
    Must explicitly invoke another constructor.
    
    Correct: replace Circle(radius) with super(radius).
*/