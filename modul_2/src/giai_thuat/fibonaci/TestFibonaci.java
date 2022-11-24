package giai_thuat.fibonaci;

import java.util.Scanner;

public class TestFibonaci {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in) ;
        do {
            System.out.println("nhập vào số nguyên n ");
            n = Integer.parseInt(scanner.nextLine()) ;
        } while (n>20&&n<0) ;

        Fibonaci fibonaci = new Fibonaci();
        System.out.println(fibonaci.fibonaci(n)); ;
    }
}
