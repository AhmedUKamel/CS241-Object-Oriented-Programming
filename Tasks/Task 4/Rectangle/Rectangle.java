package Rectangle;
public class Rectangle {
    double height;
    double width;

    // Constructors
    public Rectangle(){
        height = 1;
        width = 1;
    }

    // Getters
    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return ( height + width ) * 2;
    }

    // Main
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.width = 4;
        r1.height = 40;
        r2.width = 3.5;
        r2.height = 35.9;

        System.out.println("Width of first Rectangle : " + r1.width);
        System.out.println("Height of first Rectangle : " + r1.height);
        System.out.println("Area of first Rectangle : " + r1.getArea());
        System.out.println("Perimeter of first Rectangle : " + r1.getPerimeter());

        System.out.println("Width of second Rectangle : " + r2.width);
        System.out.println("Height of second Rectangle : " + r2.height);
        System.out.println("Area of second Rectangle : " + r2.getArea());
        System.out.println("Perimeter of second Rectangle : " + r2.getPerimeter());
    }
}
