package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("nhập số cạnh của ma trận");
        size = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("nhập các phần tử của ma trận");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.print("ma trận của bạn là : ");
        System.out.println(Arrays.deepToString(arr));

        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tổng các số trên đường chéo chính là : " + sum);
    }
}
