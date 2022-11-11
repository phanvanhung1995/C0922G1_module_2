package ss5.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3) ;
        Circle circle2 = new Circle(5);


        System.out.println(circle1.getRadius());
        System.out.println(circle2.getArea());

        System.out.println(circle1.getColor());

    }
}
