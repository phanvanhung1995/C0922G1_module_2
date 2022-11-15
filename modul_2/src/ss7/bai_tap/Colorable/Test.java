package ss7.bai_tap.Colorable;

import ss7.bai_tap.Resizeable.Circle;
import ss7.bai_tap.Resizeable.Rectangle;
import ss7.bai_tap.Resizeable.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0,5.0);
        shapes[2] = new Square(3.0);
        shapes[3] = new Square(3.0);


        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof InterfaceColorable) {
                InterfaceColorable interfaceColorable = (InterfaceColorable) shape;
                interfaceColorable.howColor();
            }
        }
    }
}
