package casestudy.controllers;

import java.util.Scanner;

public class EmployeeController {

    public static void displayEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------MenuEmployee------");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" + "3\tDelete employee\n"
                + "4\tEdit employee\n" + "5\tReturn main menu\n");
        System.out.print("mời nhập mục cần sử dụng: ");
        int optionEmployee = Integer.parseInt(scanner.nextLine());
        switch (optionEmployee) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
        }
    }
}
