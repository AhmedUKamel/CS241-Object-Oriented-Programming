public class Complex {
    private double realPart;
    private double imaginaryPart;
    private static int ctr;

    // Constructors
    public Complex(){
        ctr++;
    }
    
    public Complex(double r, double i){
        ctr++;
        this.realPart = r;
        this.imaginaryPart = i;
    }
    
    // Setters
    public void setRealPart(double r){
        this.realPart = r;
    }

    public void setImaginaryPart(double i){
        this.imaginaryPart = i;
    }

    // Getters
    public double getRealPart(){
        return this.realPart;
    }

    public double getImaginaryPart(){
        return this.imaginaryPart;
    }

    public static int getNumberOfComplexes(){
        return ctr;
    }

    // Other Methods
    public Complex addComplex(Complex n){
        return new Complex(n.getRealPart()+this.getRealPart(), n.getImaginaryPart()+this.getImaginaryPart());
    }

    public static Complex addComplex(Complex n1, Complex n2){
        return new Complex(n1.getRealPart()+n2.getRealPart(), n1.getImaginaryPart()+n2.getImaginaryPart());
    }

    public Complex subComplex(Complex n){
        return new Complex(-n.getRealPart()+this.getRealPart(), -n.getImaginaryPart()+this.getImaginaryPart());
    }

    public String toString(){
        return this.getRealPart() + " + (" + this.getImaginaryPart() + ") I";
    }

    public static String toString(Complex c){
        return c.getRealPart() + " + (" + c.getImaginaryPart() + ") I";
    }

    public void printComplex(){
        if (this.realPart == 0 && this.imaginaryPart == 0)
            System.out.println(Complex.toString(new Complex(5, 5)));
        else if (this.realPart == 0)
            System.out.println(Complex.toString(new Complex(5, this.imaginaryPart)));
        else if (this.imaginaryPart == 0)
            System.out.println(Complex.toString(new Complex(this.realPart, 5)));
        else
            System.out.println(Complex.toString(new Complex(this.realPart, this.imaginaryPart)));
    }

    // Main
    public static void main(String[] args){
        // See the test cases.
    }
}