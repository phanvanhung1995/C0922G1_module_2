package ss6.bai_tap.poind;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point3D(2,5,6) ;
        Point2D p2 = new Point2D(3,9) ;
        Point3D p3 = new Point3D(2,4,6) ;

        System.out.println(p2);
        System.out.println(p1.toString());
        p1.setXY(3,7);
        System.out.println(p1.toString());
        p3.setXYZ(6,7,8);
        System.out.println(p3.toString());
    }
}
