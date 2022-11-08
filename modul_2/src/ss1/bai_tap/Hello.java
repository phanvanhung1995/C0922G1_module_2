package ss1.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String name = "" ;
        System.out.println("your Name");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
