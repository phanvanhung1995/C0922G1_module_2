package ss14.bai_tap.thuat_toan_sx_chen;

import java.util.Arrays;
import java.util.Scanner;

public class TestInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("nhập số lượng phần tử của mảng  : ");
        int size = Integer.parseInt(scanner.nextLine()) ;
        int[] list = new int[size] ;

        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ "+  (i+1) + "của mảng");
            list[i] = Integer.parseInt(scanner.nextLine()) ;
        }
        System.out.print("mảng ban đầu là ");
        System.out.println(Arrays.toString(list));

        InsertionSort insertionSort = new InsertionSort();
        System.out.print("mảng đã sắp xếp là : ");
        insertionSort.insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
