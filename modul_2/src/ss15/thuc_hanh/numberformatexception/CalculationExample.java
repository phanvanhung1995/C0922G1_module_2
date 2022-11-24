package ss15.thuc_hanh.numberformatexception;

public class CalculationExample {

    public void calculation(int x , int y) {
        try {
            int a = x+y ;
            int b = x- y ;
            int c = x* y ;
            int d = x/y ;

            System.out.println("tổng x + y = " + a);
            System.out.println("tổng x - y = " + b);
            System.out.println("tổng x * y = " + c);
            System.out.println("tổng x / y = " + d);
        } catch (Exception exception){
            System.err.println("xảy ra ngoại lệ : " + exception.getMessage());
        }
    }
}
