package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class Gt11_9 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + " của mảng ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("mảng bạn nhập là :");
        System.out.println(Arrays.toString(arr));

        int x;
        System.out.println("nhập số nguyên bạn muốn");
        x = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                if (arr[i] != arr[j] ) {
                    if (arr[i] + arr[j] == x) {
                        System.out.println("arr[i] = " + arr[i] + "  arr[j]" + arr[j]);
                    }
                }
            }
        }
    }
}
