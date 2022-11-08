package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class IndexMin {
    public static void main(String[] args) {
        int[] array = new int[5] ;
        int size = 5 ;
        Scanner sc = new Scanner(System.in) ;


        for (int i =0; i<size; i++ ) {
            System.out.println("nhập phần tử thứ " + (i+1) + "của mảng");
            array[i] = Integer.parseInt(sc.nextLine()) ;
        }

        System.out.print("mảng của bạn là :");
        System.out.println(Arrays.toString(array));

        int min = array[0] ;

        for (int i =0 ; i< size; i++) {
            if (array[i] <= min) {
                min = array[i] ;
            }
        }
        System.out.println("giá trị nhỏ nhất là " + min);
    }
}