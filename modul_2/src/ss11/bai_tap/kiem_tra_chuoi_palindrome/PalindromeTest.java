package ss11.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mỗi chuỗi ký tự từ bàn phím");
        String arr = sc.nextLine();
        String[] word = arr.toUpperCase().split("");

        Stack<String> arrStack = new Stack<>();
        Queue<String> arrQueue = new ArrayDeque<String>();

        System.out.print("Stack sau khi pust : ");
        /*loại bỏ các phần tử dấu cách */
        for (int i = 0; i < word.length; i++) {
            if (!Objects.equals(word[i], " ")) {
                arrStack.push(word[i]);
            }
        }
        System.out.println(arrStack);
        System.out.print("Stack sau khi pop() : ");
        int sizeStack = arrStack.size();
        String popStack = "";
        /*lấy ra phần tử sau đó thêm vào 1 String khác*/
        for (int i = 0; i < sizeStack; i++) {
            popStack += arrStack.pop();
        }
        System.out.print(popStack);


        System.out.println();
        System.out.print("Queue sau khi pust : ");
        /* loại bỏ phần tử khoảng trắng dư thừa*/
        for (int i = 0; i < word.length; i++) {
            if (!Objects.equals(word[i], " ")) {
                arrQueue.offer(word[i]);
            }
        }
        System.out.print(arrQueue);
        System.out.println();


        int sizeQueue = arrQueue.size();
        String popQueue = "";
        System.out.print("Queue sau khi poll : ");
        /*lấy ra phần tử sau đó thêm vào 1 String khác*/
        for (int i = 0; i < sizeQueue; i++) {
            popQueue += arrQueue.poll();
        }
        System.out.print(popQueue);
        System.out.println();
        /*so sánh 2 mảng ngược nhau để tìm ra đối xứng*/
        if (popQueue.equals(popStack)) {
            System.out.println("chuỗi đối xứng");
        } else {
            System.out.println("chuỗi không đối xứng");
        }
    }
}
