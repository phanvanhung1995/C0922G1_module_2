package ss6.bai_tap.circle;

import org.omg.CORBA.MARSHAL;
import ss2.thuc_hanh.Prime;

public class Circle {
    private String color ;
    private double radius ;


    public Circle() {} ;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius ;
    }

    @Override
    public String toString() {
        return "," +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }

}
