public class Rectangle{
    double length;
    double width;

    // Constructors
    public Rectangle(){

    }

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    // Setters
    public void setLength(double l){
        this.length = l;
    }

    public void setWidth(double w){
        this.width = w;
    }

    // Getters
    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    // Other Methods
    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }

    public String toString(){
        return  "Length : " + this.length + 
                "\nWidth : " + this.width;
    }

    // Main
    public static void main(String[] args){
        // See the test cases.
    }
}