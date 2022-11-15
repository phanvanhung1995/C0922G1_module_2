package ss7.bai_tap.Resizeable;

public class Square extends Rectangle {
    private double size;


    public Square(double size) {
        super(size, size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }
}
