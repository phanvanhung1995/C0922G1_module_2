package ss15.thuc_hanh.numberformatexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("nhập x : ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập y : ");
        int y = Integer.parseInt(scanner.nextLine());

        CalculationExample cla = new CalculationExample() ;
        cla.calculation(x,y);
    }
}
