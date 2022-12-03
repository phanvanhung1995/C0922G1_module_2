package casestudy.views;

import casestudy.model.people.Employee;

import java.util.Scanner;

public class EmployeeInput {

    public static Employee inputEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập mã nhân viên : ");
        String idEmployee = scanner.nextLine();
        System.out.println("nhập tên nhân viên : ");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính : ");
        String gender = scanner.nextLine();
        System.out.println("nhập số căn cước công dân : ");
        String id = scanner.nextLine();
        System.out.println("nhập số điện thoại : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhập email  : ");
        String email = scanner.nextLine();
        System.out.println("nhập trình độ : ");
        String lever = scanner.nextLine();
        System.out.println("nhập vị trí  : ");
        String rank = scanner.nextLine();
        System.out.println("nhập mức lương : ");
        String salary = scanner.nextLine();

        return new Employee(idEmployee,name,dateOfBirth,gender,id,phoneNumber,email,lever,rank,salary);
    }
}
