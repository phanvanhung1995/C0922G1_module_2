package ss7.bai_tap.Colorable;

import ss7.bai_tap.Resizeable.Shape;

public class Square extends Shape implements InterfaceColorable{
    @Override
    public void howColor() {
        System.out.println("color all four sider");
    }
    private double size  ;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Square(double size) {
        this.size = size;
    }

    public Square() {

    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public void resize(double percent) {

    }

    @Override
    public double getArea() {
        return size * size;
    }
}
