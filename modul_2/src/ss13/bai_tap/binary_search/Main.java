package ss13.bai_tap.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("nhập số lượng phần tử mảng : ");
        int size = Integer.parseInt(scanner.nextLine()) ;
        int[] arr =new int[size] ;


        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ " + (i+1) + " của mảng : ");
            arr[i] = Integer.parseInt(scanner.nextLine()) ;
        }
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập phần tử muốn tìm kếm trong mảng : ");
        int input = Integer.parseInt(scanner.nextLine()) ;

        BinarySearch binarySearch = new BinarySearch();

        System.out.print("phần tử cần tìm ở vị trí : " + binarySearch.binarySeach(arr, 0, n-1,input ));
    }
}
