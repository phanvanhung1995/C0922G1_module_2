package ss14.thuc_hanh.sap_xep_chen;

import java.util.Scanner;

public class SapXepChen {
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i <n ; i++) {
            int x = arr[i];
            int j = i-1 ;

            while (j>= 0 && arr[j] > x ) {
                arr[j+1] = arr[j] ;
                j-- ;
            }
            arr[j+1] = x ;
        }
    }
}
