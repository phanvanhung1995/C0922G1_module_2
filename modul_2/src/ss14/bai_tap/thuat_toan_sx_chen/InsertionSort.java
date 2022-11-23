package ss14.bai_tap.thuat_toan_sx_chen;

public class InsertionSort {

    public void insertionSort(int[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) {
            int x = list[i];
            int j = i - 1;


            while (j>= 0 && list[j]> x) {
                list[j+1] = list[j];
                j-- ;
            }
            list[j+1] = x ;
        }


    }
}
