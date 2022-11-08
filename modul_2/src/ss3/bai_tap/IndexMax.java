package ss3.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class IndexMax {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhập vào các phần tử của ma trận");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("ma trận của bạn là :");
        System.out.println(Arrays.deepToString(array));
        int max = array[0][0] ;

        for (int i =0; i< array.length;i++) {
            for (int j=0; j< array[i].length;j++) {
               if (array[i][j] >= max  ) {
                   max = array[i][j] ;
               }
            }
        }
        System.out.println("giá trị lớn nhất của phần tử trong ma trận là "+ max);
    }
}
