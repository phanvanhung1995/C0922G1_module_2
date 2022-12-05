package casestudy.views;

import casestudy.model.people.Customer;
import casestudy.model.people.Employee;

import java.util.Scanner;

public class CustomerInput {

    public static Customer inputCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập mã khách hàng : ");
        String idCustomer = scanner.nextLine();
        System.out.println("nhập tên khách hàng : ");
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
        String rankCustomer = scanner.nextLine();
        System.out.println("nhập vị trí  : ");
        String address = scanner.nextLine();

        return new Customer(idCustomer,name,dateOfBirth,gender,id,phoneNumber,email,rankCustomer,address);
    }
}
