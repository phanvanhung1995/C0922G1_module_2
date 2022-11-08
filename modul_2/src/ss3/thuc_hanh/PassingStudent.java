package ss3.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class PassingStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("nhập vào số lượng");
            size = Integer.parseInt(sc.nextLine());
            if (size < 1 || size > 30) {
                System.out.println("nhập không hợp lệ, mời nhập lại");
            }
        } while (size > 30 || size < 1);

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            do {
                System.out.println("nhập vào điểm thi của sinh viên " + (i + 1));
                arr[i] = Integer.parseInt(sc.nextLine());
                if (arr[i] < 0 || arr[i] > 10) {
                    System.out.println("mời bạn nhập lại, nhập sai");
                }
            } while (arr[i] < 0 || arr[i] > 10);

        }
        System.out.print("danh sách điểm thi là ");
        System.out.println(Arrays.toString(arr));
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] >= 5) {
                count += 1;
            }
        }
        System.out.println("số sinh viên đậu là " + count);
    }
}
