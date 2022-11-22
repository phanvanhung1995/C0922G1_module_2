package ss7.bai_tap.Resizeable;

public class Square extends Shape {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        setSize(getSize()*percent /100 + getSize());
    }

    @Override
    public double getArea() {
        return  size * size ;
    }
}
