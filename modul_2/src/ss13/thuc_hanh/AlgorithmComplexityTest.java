package ss13.thuc_hanh;

import java.util.Locale;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("nhập vào chuỗi ký tự : ");
        String string = scanner.nextLine();


        int[] mangCon = new int[255] ;
        for (int i = 0; i < string.length(); i++) {
            int ascii = string.charAt(i) ;
            mangCon[ascii] +=1 ;
        }

        int max = 0 ;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (mangCon[i]> max) {
                max = mangCon[i] ;
                character = (char) i ;
            }
        }

        System.out.println("chữ cái xuất hiện nhiều nhất là :" + character + " tần suất xuất hiện là : " + max + " lần");
    }
}
