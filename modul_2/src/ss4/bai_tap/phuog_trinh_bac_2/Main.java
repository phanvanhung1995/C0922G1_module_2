package ss4.bai_tap.phuog_trinh_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double a ,b,c ;

        System.out.println("nhập vào giá trị a");
        a = Integer.parseInt(sc.nextLine()) ;
        System.out.println("nhập vào giá trị b");
        b = Integer.parseInt(sc.nextLine()) ;
        System.out.println("nhập vào giá trị c");
        c = Integer.parseInt(sc.nextLine()) ;

        QuadraticEquation pt1 = new QuadraticEquation(a,b,c) ;
        System.out.println(pt1.getDiscriminant());
        double delta = pt1.getDiscriminant() ;

        final double canDelta = Math.pow(delta,0.5) ;

        if (pt1.getDiscriminant()<0) {
            System.out.println("phương trình vô nghiệm");
        } else if (pt1.getDiscriminant()==0) {
            double x = -b / (2*a) ;
            System.out.println("phuong trình có 1 nghiệm kép :x1 =x2 = " + x);
        } else {
            double x1 = (-b + canDelta)/2*a ;
            double x2 = (-b - canDelta)/2*a ;

            System.out.println("phương trình có 2 nghiệm là :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
