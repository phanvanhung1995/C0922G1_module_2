package ss1.bai_tap;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        double usd ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the amount you want to convert ");
        usd = sc.nextDouble() ;

        double vnd = usd * 23000 ;
        System.out.println(" vậy : " + usd + "$ = " + vnd + "đ");

    }
}
