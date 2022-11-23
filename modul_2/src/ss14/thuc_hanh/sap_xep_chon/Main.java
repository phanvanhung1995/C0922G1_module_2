package ss14.thuc_hanh.sap_xep_chon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3] ;
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortSelection(arr);

        System.out.println(Arrays.toString(arr));
    }
}
