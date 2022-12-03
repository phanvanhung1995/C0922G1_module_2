package casestudy.controllers;

import java.util.Scanner;

public class PromotionController {
    public static void displayPromotion() {
        System.out.println("-----MenuPromotion -----");
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lựa chọn : ");
        int optionPromotion = scanner.nextInt();

        switch (optionPromotion) {
            case 1:
            case 2:
            case 3:
            default:
                System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
        }
    }
}
