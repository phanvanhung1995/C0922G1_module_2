package ss2.bai_tap;

import java.util.Scanner;

public class ResultPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int num ;
        int count = 0 ;
        int countSNT = 0 ;
        System.out.println("nhập số lượng số nguyên tố cần hiển thị");
        num = Integer.parseInt(sc.nextLine()) ;
        for (int i=2; i< 1000; i++) {
            if (countSNT < num) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j==0)
                        count +=1;
                }
                if (count == 0) {
                    System.out.println(i);
                    countSNT +=1;
                }
                count = 0;
            } else break;
        }

    }
}
