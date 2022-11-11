package ss6.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 3) ;
        Cylinder c2 = new Cylinder("red",3, 6) ;
        Cylinder c3 = new Cylinder(6) ;
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c2.getArea());
        System.out.println(c3.toString());
    }
}
