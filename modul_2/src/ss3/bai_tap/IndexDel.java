package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class IndexDel {
    public static void main(String[] args) {
        int[] arr = new int[10] ;

        Scanner sc = new Scanner(System.in);
        for (int i=0; i< 10;i++) {
            System.out.println("nhập phần tử thứ " + (i+1) + " của mảng ");
            arr[i] = Integer.parseInt(sc.nextLine()) ;
        }
        System.out.println(Arrays.toString(arr));
        int index ;
        System.out.println("nhập phần tử cần xóa trong mảng");
        index = Integer.parseInt(sc.nextLine()) ;
        int[] newarr = new int[10] ;
        int count = 0;
        for (int i =0; i< arr.length;i++) {
            if(arr[i] != index) {
                newarr[count] = arr[i] ;
                count +=1 ;
            }
        }
        System.out.print("mảng sau khi xóa là :");
        System.out.println(Arrays.toString( newarr));
    }
}
