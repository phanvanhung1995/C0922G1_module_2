package ss11.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackDaoNguocPhanTu {
    public static void main(String[] args) {
        int[] arrInteger = new int[3];
        Scanner sc = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        int size = arrInteger.length;

        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + "trong mảng bạn muốn đảo ngược :");
            arrInteger[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng bạn nhập : " + Arrays.toString(arrInteger));

        for (int i = 0; i < size; i++) {
            numbers.push(arrInteger[i]);
        }

        for (int i = 0; i < size; i++) {
            arrInteger[i] = numbers.pop();
        }

        System.out.println("mảng đảo ngược : " + Arrays.toString(arrInteger));
    }
}
