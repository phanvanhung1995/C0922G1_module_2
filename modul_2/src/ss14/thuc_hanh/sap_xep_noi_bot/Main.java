package ss14.thuc_hanh.sap_xep_noi_bot;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 4, 2};

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.SortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
