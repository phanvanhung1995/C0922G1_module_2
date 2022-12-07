package casestudy.libsx;

import casestudy.utils.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
   static Scanner scanner = new Scanner(System.in);
    //    kiểm tra nhập mã dịch vụ :  :
    public static String regexFacility(String id, String regex, String err) {

        boolean check = true;
        do {
            if (id.matches(regex)) {
                check = false;
            } else {
                System.out.println(err);
                id = scanner.nextLine();
            }
        } while (check);
        return id;
    }

//    kiểm tra đủ 18 tuổi  :

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        String result = null;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);

                    LocalDate now = LocalDate.now();

                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 10) {
                        check = false;
                    } else {
                        throw new AgeException("Age > 18 and Age <100");
                    }
                } else {
                    throw new AgeException("Định dạng không đúng");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Re-input: ");
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
