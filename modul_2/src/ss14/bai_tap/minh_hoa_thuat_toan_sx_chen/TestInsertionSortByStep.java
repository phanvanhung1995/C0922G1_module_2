package ss14.bai_tap.minh_hoa_thuat_toan_sx_chen;

import java.util.Arrays;
import java.util.Scanner;

public class TestInsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nhập số lượng phần tử của mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size] ;

        for (int i = 0; i < size; i++) {
            System.out.println(" nhập phần tử thứ " + (i+1) + " của mảng ");
            arr[i] = Integer.parseInt(scanner.nextLine()) ;
        }

        InsertionSortByStep insertionSortByStep = new InsertionSortByStep() ;
        insertionSortByStep.insertionSortByStep(arr);
        System.out.print("mảng đã sắp xếp là : ");
        System.out.print(Arrays.toString(arr));
    }
}
