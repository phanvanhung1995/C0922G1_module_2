package ss6.bai_tap.Moveable_point;

public class TestMove {
    public static void main(String[] args) {
        Point p1 = new Point() ;
        Point p2 = new MoveablePoint(3,4,12,15) ;

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        MoveablePoint m1 = new MoveablePoint(3,6,3,5) ;
        System.out.println(m1.toString());
        System.out.println(m1.move());
    }
}
