package Complex;
public class ComplexTest {
    public static void main(String[] args){
        Complex c1 = new Complex();
        c1.setRealPart(5);
        c1.setImaginaryPart(-3);
        c1.printComplex();
        
        Complex c2 = new Complex(-2, 7);
        c2.printComplex();
        
        Complex c3 = c1.addComplex(c2);
        c3.printComplex();

        Complex c4 = c1.subComplex(c2);
        c4.printComplex();
    }   
}