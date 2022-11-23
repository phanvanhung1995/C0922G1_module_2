package ss14.bai_tap.minh_hoa_thuat_toan_sx_chen;

public class InsertionSortByStep {

    public void insertionSortByStep(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int x = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > x) {
                System.out.println("Swap " + arr[j - 1] + " with " + arr[j]);
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }
    }
}
