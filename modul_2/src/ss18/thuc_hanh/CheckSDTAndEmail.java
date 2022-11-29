package ss18.thuc_hanh;

import javafx.scene.transform.Scale;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckSDTAndEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhập sdt từ bàn phím : ");
            String sdt = scanner.nextLine();
            Pattern p = Pattern.compile("^[0-9]{3}-[0-9]{7}$");
            if (p.matcher(sdt).find()) {
                System.out.println("phone is oke");
            } else {
                System.out.println("phone is not oke");
            }
        }
    }
}
