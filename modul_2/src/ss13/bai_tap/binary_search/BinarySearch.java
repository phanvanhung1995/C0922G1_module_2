package ss13.bai_tap.binary_search;

public class BinarySearch {

    public int binarySeach(int[] arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (left <= right) {
            if (arr[middle] == value) {
                return middle;
            } else if (arr[middle] > value) {
                right = middle - 1;
                return binarySeach(arr, left,  right,  value);
            } else if (arr[middle] < value){
                left = middle + 1;
                return binarySeach(arr, left,  right,  value);
            }
        }
        return -1;
    }
}

