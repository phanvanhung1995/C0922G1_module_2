package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + " của mảng ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int number, index;
        System.out.println("nhập số cần chèn vào ");
        number = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vị trí cần chèn vào ");
        index = Integer.parseInt(sc.nextLine());

        if (index < 0 || index > arr.length) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length-1; i > index; i--) {
                arr[i -1] = arr[i - 2] ;
            }

            arr[index] = number ;
            System.out.println(Arrays.toString(arr));
        }
    }
}
