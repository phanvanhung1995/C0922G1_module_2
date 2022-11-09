package ss3.bai_tap;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "phan van hung";
        int count = 0;
        System.out.println("nhập ký tự cần kiểm tra");
        String kyTu = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (kyTu.charAt(0) == str.charAt(i)) {
                count += 1;
            }
        }
        System.out.println("vậy số ký tự giống là : " + count);
    }
}
