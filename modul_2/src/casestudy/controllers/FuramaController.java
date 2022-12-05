package casestudy.controllers;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu() {

        System.out.println("------Menu------");
        System.out.println("1.\tEmployee Management\n" + "2.\tCustomer Management\n"
                + "3.\tFacility Management \n" + "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" + "6.\tExit\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lựa chọn : ");
        int optionMenu = scanner.nextInt();

        switch (optionMenu) {
            case 1:
                EmployeeController.displayEmployee();
                break;
            case 2:
                CustomerController.displayCustomer();
                break;
            case 3:
               FacilityController.displayFacility();
                break;
            case 4:
                BookingController.displayBooking();
                break;
            case 5:
                PromotionController.displayPromotion();
                break;
            case 6:
                System.exit(2);
                break;
            default:
                System.out.println("lựa chọn không có trong menu, vui lòng chọn lại : ");
        }
    }
}
