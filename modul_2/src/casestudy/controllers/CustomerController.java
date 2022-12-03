package casestudy.controllers;

import java.util.Scanner;

public class CustomerController {

    public static void displayCustomer() {
        System.out.println("-----MenuCustomer-----");
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lựa chọn : ");
        int optionCustomer = scanner.nextInt();


        switch (optionCustomer) {
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
        }
    }
}
