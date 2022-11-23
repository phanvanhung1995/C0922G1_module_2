package ss14.thuc_hanh.sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        SapXepChen sapXepChen = new SapXepChen() ;
        System.out.println("nhập số phần tử của mảng");
        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[size] ;
        for (int i = 0; i < size; i++) {
            System.out.print("nhập phần từ thứ " + (i+1) + " của mảng : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("mảng ban đầu : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("mảng sau khi sắp xếp : ");

        sapXepChen.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
