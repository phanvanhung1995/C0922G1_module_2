package casestudy.controllers;

import java.util.Scanner;

public class BookingController {
    public static void displayBooking() {
        System.out.println("-----MenuBooking -----");
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tReturn main menu\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lựa chọn : ");
        int optionBooking = scanner.nextInt();


        switch (optionBooking) {
            case 1:
            case 2:
            case 3:
            default:
                System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
        }
    }
}
