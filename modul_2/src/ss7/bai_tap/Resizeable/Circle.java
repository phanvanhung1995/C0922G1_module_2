package ss7.bai_tap.Resizeable;

public class Circle extends Shape {
    double radius = 1.0 ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent /100 + getRadius());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius ;
    }
}
