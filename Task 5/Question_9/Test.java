public class Test {
    public static void main(String[] args){
        /*
        Part a
        Circle circle = new Circle();
        Shape object1 = new Shape();
        
        System.out.println(circle instanceof Shape);
        System.out.println(object1 instanceof Shape);
        System.out.println(circle instanceof Circle);
        System.out.println(object1 instanceof Circle);
        
        Part b
        Circle circle = new Circle();
        Shape object1 = circle;
        
        Part c
        Shape object1 = new Shape();
        Circle circle = (Circle)object1;
        */
    }
}
/*
Part a: Error:  Incompatible conditional operand types Circle and Shape.
        Output: true
        Output: true
        Error:  Incompatible conditional operand types Shape and Circle.
Part b: Error:  Cannot convert from Circle to Shape.
Part c: Error:  Cannot cast from Shape to Circle.
*/