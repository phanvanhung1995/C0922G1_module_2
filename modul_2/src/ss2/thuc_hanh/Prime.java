package ss2.thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int number ;
        Scanner sc = new Scanner(System.in) ;
        do {
            System.out.println("nhập số bạn muồn kiểm tra");
            number = Integer.parseInt(sc.nextLine()) ;
        } while (number<1);
        boolean flag = true ;
        if (number==1) {
            System.out.println(number + " là số nguyên tố");
        } else {
            for (int i =2 ; i< Math.sqrt(number); i++) {
                if (number % i ==0) {
                    flag = false ;
                }
            }
            if (flag) {
                System.out.println( number + " là số nguyên tố ");
            } else {
                System.out.println(number + " không phải là số nguyên tố ");
            }
        }

    }
}
