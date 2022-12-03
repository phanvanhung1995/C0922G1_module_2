package casestudy.controllers;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacility() {
        System.out.println("-----MenuFacility -----");
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lựa chọn : ");
        int optionFacility = scanner.nextInt();


        switch (optionFacility) {
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
        }
    }
}
