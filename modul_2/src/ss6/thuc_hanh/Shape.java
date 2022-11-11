package ss6.thuc_hanh;

public class Shape {
    private String color = "red" ;
    private boolean filled = true ;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
