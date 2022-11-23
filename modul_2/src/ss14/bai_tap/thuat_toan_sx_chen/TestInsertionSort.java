package ss14.bai_tap.thuat_toan_sx_chen;

import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] list = {1,5,9,2,3} ;

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
