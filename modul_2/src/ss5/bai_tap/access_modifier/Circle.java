package ss5.bai_tap.access_modifier;

public class Circle {
    private Double radius = 1.0;
    private String color = "red";

    private double area;

    public Double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
