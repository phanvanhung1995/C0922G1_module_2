package ss1.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        int a ;
        int b ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nhập biến a");
        a = scanner.nextInt() ;
        System.out.println("nhập biến b");
        b= scanner.nextInt() ;
        int x = -b / a ;
        System.out.println("x = " + x);
    }
}
