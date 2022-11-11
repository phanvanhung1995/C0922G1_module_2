package ss6.thuc_hanh;

public class Square extends Rectangle {
    public Square(double size) {
        super(size,size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public Square(){

    }

    public double getSize() {
        return getWidth() ;
    }

    public void setSize( double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public String toString() {
        return   super.toString();
    }


    public static void main(String[] args) {
        Square s1 = new Square() ;
        System.out.println(s1.toString());
        Square s2 = new Square(3) ;
        System.out.println(s2.toString());
        Square s3 = new Square("yellow", true, 5) ;
        System.out.println(s3.toString());
    }

}
