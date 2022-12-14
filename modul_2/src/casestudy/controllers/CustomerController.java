package casestudy.controllers;

import casestudy.model.people.Customer;
import casestudy.services.impl.CustomerServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class CustomerController {

    public static void displayCustomer() throws IOException {

        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int optionCustomer ;

        do {
            System.out.println("-----MenuCustomer-----");
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập lựa chọn : ");
            optionCustomer = scanner.nextInt();


            switch (optionCustomer) {
                case 1:
                    customerService.displayAll();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    System.out.println("nhập id cần sửa : ");
                    String idEdit = scanner.nextLine();
                    System.out.print("nhập tên cần sửa : ");
                    String newName = scanner.nextLine();
                    System.out.print("nhập ngày sinh cần sửa : ");
                    String newDateOfBirth = scanner.nextLine();
                    System.out.print("nhập giới tính cần sửa : ");
                    String newGender = scanner.nextLine();
                    System.out.print("nhập số cmnd cần sửa : ");
                    String newid = scanner.nextLine();
                    System.out.print("nhập sô điện thoại cần sửa : ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("nhập email cần sửa : ");
                    String newEmail = scanner.nextLine();
                    System.out.print("nhập loại khách hàng cần sửa : ");
                    String newRankCustomer = scanner.nextLine();
                    System.out.print("nhập địa chỉ cần sửa : ");
                    String newAddress = scanner.nextLine();

                    Customer customer = new Customer(newName, newDateOfBirth, newGender, newid, newPhoneNumber, newEmail,
                            idEdit, newRankCustomer, newAddress);
                    customerService.editCus(customer);
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
            }
        } while (optionCustomer != 0);
    }
}
