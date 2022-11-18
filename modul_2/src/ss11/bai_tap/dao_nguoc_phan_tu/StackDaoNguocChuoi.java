package ss11.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class StackDaoNguocChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();

        System.out.println("nhập vào chuỗi muốn chuyển đổi ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!Objects.equals(words[i], "")) {
                wStack.push(words[i]);
            }
        }
        int sizeWStack = wStack.size();
        System.out.println("chuỗi đảo ngược là ");
        for (int i = 0; i < sizeWStack; i++) {
            System.out.print(wStack.pop() + " ");
        }
    }
}
