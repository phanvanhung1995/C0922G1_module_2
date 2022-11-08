package ss1.thuc_hanh;

import java.util.Scanner;

public class YearLeap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int year;
        System.out.println("nhập số năm bạn muốn kiểm tra");
        year = scanner.nextInt() ;
        boolean result = true ;

        if (year%4 == 0) {
            if (year %100 == 0) {
                if (year %400 == 0) {
                    result = true ;
                } else {
                    result = false ;
                }
            } else {
                result = true;
            }
        } else {
            result = false;
        }
        if (result =true) {
            System.out.printf("%d is a leap year" , year);
        } else {
            System.out.printf("%d not is a leap year", year);
        }
    }
}
