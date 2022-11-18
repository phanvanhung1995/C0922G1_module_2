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
        for (int i = 0; i < word.length; i++) {
            if (!Objects.equals(word[i]," ")) {
                arrStack.push(word[i]);
            }
        }
        System.out.println(arrStack);
        System.out.print("Stack sau khi pop() : ");
        int sizeStack = arrStack.size();
        String popStack = "" ;

        for (int i = 0; i < sizeStack; i++) {
            popStack += arrStack.pop() ;
        }
        System.out.print(popStack);


        System.out.println();
        System.out.print("Queue sau khi pust : ");

        for (int i = 0; i < word.length; i++) {
            if (!Objects.equals(word[i]," ")) {
                arrQueue.offer(word[i]);
            }
        }
        System.out.print(arrQueue);
        System.out.println();


        int sizeQueue = arrQueue.size();
        String popQueue = "" ;
        System.out.print("Queue sau khi poll : ");

        for (int i = 0; i < sizeQueue; i++) {
            popQueue += arrQueue.poll() ;
        }
        System.out.print(popQueue);
        System.out.println();

        if (popStack.equals(popQueue)) {
            System.out.println("chuỗi đối xứng");
        } else {
            System.out.println("chuỗi không đối xứng");
        }
    }
}
