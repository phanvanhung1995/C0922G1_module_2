package ss2.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int rec = -1;
        Scanner sc = new Scanner(System.in);
        while (rec != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. print the square triangle");
            System.out.println("3. print isosceles triangle");
            System.out.println("4. exit");
            System.out.println("enter your rec : ");
            rec = Integer.parseInt(sc.nextLine());
            switch (rec) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*   ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 7; j > i; j--) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("nhập sai,mời bạn nhập lại hoặc ấn 4 để kết thúc");
            }
        }
    }
}
