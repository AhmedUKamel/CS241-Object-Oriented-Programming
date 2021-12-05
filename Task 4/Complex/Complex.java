package Complex;
public class Complex {
    private double realPart;
    private double imaginaryPart;

    // Constructors
    public Complex(){
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double r, double i){
        realPart = r;
        imaginaryPart = i;
    }
    
    // Setters
    public void setRealPart(double r){
        realPart = r;
    }

    public void setImaginaryPart(double i){
        imaginaryPart = i;
    }

    // Getters
    public double getRealPart(){
        return realPart;
    }

    public double getImaginaryPart(){
        return imaginaryPart;
    }

    // Other Methods
    public Complex addComplex(Complex n){
        return new Complex(n.getRealPart()+this.getRealPart(), n.getImaginaryPart()+this.getImaginaryPart());
    }

    public Complex subComplex(Complex n){
        return new Complex(-n.getRealPart()+this.getRealPart(), -n.getImaginaryPart()+this.getImaginaryPart());
    }

    public void printComplex(){
        System.out.println(this.getRealPart() + " + (" + this.getImaginaryPart() + ")I");
    }
}