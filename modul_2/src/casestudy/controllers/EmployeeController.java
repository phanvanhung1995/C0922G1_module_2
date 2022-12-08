package casestudy.controllers;

import casestudy.model.people.Employee;
import casestudy.services.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeController {

    public static void displayEmployee() throws IOException {
        EmployeeServiceImpl emp = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int optionEmployee;
        do {
            System.out.println("------MenuEmployee------");
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" + "3\tDelete employee\n"
                    + "4\tEdit employee\n" + "5\tReturn main menu\n");
            System.out.print("mời nhập mục cần sử dụng: ");
            optionEmployee = Integer.parseInt(scanner.nextLine());
            switch (optionEmployee) {
                case 1:
                    emp.displayAll();
                    break;
                case 2:
                    emp.addNew();
                    break;
                case 3:
                    System.out.println("nhập mã nhân viên muốn xóa : ");
                    String idEmployee = scanner.nextLine();
                    emp.deleteAll(idEmployee);
                    break;
                case 4:
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
                    System.out.print("nhập lever cần sửa : ");
                    String newLever = scanner.nextLine();
                    System.out.print("nhập mã rank cần sửa : ");
                    String newRank = scanner.nextLine();
                    System.out.print("nhập mã lương cần sửa : ");
                    String newSalary = scanner.nextLine();

                    Employee newemployee = new Employee(newName, newDateOfBirth, newGender, newid, newPhoneNumber, newEmail,
                            idEdit, newLever, newRank, newSalary);
                    emp.editNew(newemployee);
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
            }
        } while (optionEmployee !=0);
    }
}
