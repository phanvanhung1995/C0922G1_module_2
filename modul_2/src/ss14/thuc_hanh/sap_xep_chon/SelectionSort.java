package ss14.thuc_hanh.sap_xep_chon;

public class SelectionSort {

    public void sortSelection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int indexMin = i ;
            for (int j = i+1; j <n ; j++) {
                if (arr[j]<= arr[indexMin]) {
                    indexMin = j ;
                }
            }
            int temp = arr[indexMin] ;
            arr[indexMin] = arr[i] ;
            arr[i] = temp ;
        }

    }
}
