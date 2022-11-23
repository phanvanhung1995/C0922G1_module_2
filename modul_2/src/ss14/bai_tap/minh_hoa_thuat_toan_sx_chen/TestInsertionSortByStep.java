package ss14.bai_tap.minh_hoa_thuat_toan_sx_chen;

import java.util.Arrays;

public class TestInsertionSortByStep {
    public static void main(String[] args) {
        int[] arr = {1,5,6,9,5,1} ;

        InsertionSortByStep insertionSortByStep = new InsertionSortByStep() ;
        insertionSortByStep.insertionSortByStep(arr);

        System.out.print(Arrays.toString(arr));
    }
}
