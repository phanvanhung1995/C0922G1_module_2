package ss18.bai_tap.validate_phone;

import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("input your phone : ");
            String phone  = scanner.nextLine();
            ValidatePhone validatePhone = new ValidatePhone();
            validatePhone.checkPhone(phone);
            break;
        } while (true) ;

    }
}
