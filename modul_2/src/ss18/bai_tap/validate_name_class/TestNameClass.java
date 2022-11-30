package ss18.bai_tap.validate_name_class;

import java.util.Scanner;

public class TestNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateNameClass validateNameClass = new ValidateNameClass();
        do {
            System.out.println("input name of class : ");
            String nameClass = scanner.nextLine();
            validateNameClass.checkNameClass(nameClass);
        } while (true);
    }
}
