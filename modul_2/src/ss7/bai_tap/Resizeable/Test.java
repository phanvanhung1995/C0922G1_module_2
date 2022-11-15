package ss7.bai_tap.Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3] ;

        shapes[0] = new Circle(3.0) ;
        shapes[1] = new Rectangle(3,6) ;
        shapes[2] = new Square(5) ;

        System.out.println("diện tích ban đầu : ");

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

        shapes[0].resize(100);
        shapes[1].resize(100);
        shapes[2].resize(100);

        System.out.println("diện tích sau tăng là : ");

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
