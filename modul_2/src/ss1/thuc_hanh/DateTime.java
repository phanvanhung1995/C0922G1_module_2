package ss1.thuc_hanh;

import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        int date ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nập vào tháng ba muốn kiểm tra");
        date = scanner.nextInt() ;
        switch (date) {
            case 2 :
                System.out.println("Tháng 2 có 28 hoăc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("tháng "+ date + " có 30 ngày");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng "+ date + " có 31 ngày");
                break;
            default:
                System.out.println("tháng nhập bị sai, mời bạn nhập lại");
                break;
        }
    }
}
