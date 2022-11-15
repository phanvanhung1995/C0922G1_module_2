package ss7.bai_tap.Resizeable;

public class Rectangle extends Shape {
    private double width = 1.0 ;
    private double height = 1.0 ;

    public double getWidth() {
        return width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()*percent/100 + getWidth());
        setHeight(getHeight()*percent/100 + getHeight());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
