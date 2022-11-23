package ss14.thuc_hanh.sap_xep_noi_bot;

public class BubbleSort {

    public void SortBubble(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = arr.length -1; j > i ; j--) {
                if (arr[j]< arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                }
            }
        }
    }
}
