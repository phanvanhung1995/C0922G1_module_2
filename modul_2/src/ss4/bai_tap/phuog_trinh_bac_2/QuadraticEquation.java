package ss4.bai_tap.phuog_trinh_bac_2;

public class QuadraticEquation {
    private double a ;
    private double b ;
    private double c ;
    private double delta ;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a,double b,double c) {
        this.a =a ;
        this.b = b;
        this.c =  c;
    }

    public QuadraticEquation() {
    }

    public double getDiscriminant() {
        return delta = (b*b - 4*a*c) ;
    }

}
