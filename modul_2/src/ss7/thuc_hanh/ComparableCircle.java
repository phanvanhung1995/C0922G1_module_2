package ss7.thuc_hanh;

import ss6.thuc_hanh.Circle;

public class ComparableCircle extends Circle {
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
    }
}
