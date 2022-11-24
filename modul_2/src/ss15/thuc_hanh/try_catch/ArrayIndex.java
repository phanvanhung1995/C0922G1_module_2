package ss15.thuc_hanh.try_catch;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int[] arr = new int[100] ;

        Random rd = new Random();

        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        int index = 0;
        System.out.println();
        System.out.print("nhập vào chỉ số phần tử : ");
        index = Integer.parseInt(scanner.nextLine());

        try {
            System.out.println("giá trị phần tử ở vị trí " + index + " là " + arr[index]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("chỉ số vượt quá giới hạn của mang");
        }
    }
}
