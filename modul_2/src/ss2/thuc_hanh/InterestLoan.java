package ss2.thuc_hanh;

import java.util.Scanner;

public class InterestLoan {
    public static void main(String[] args) {
        double vnd , time , shared ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền bạn muốn gửi ");
        vnd = sc.nextDouble() ;
        System.out.println("nhập số tháng bạn muốn gửi ");
        time = sc.nextDouble();
        shared = vnd * (5.5/12/100) * time ;
        System.out.println("số tiền lãi trong 3 tháng là : " + shared);
    }
}
