package ss18.bai_tap.validate_phone;

import java.util.regex.Pattern;

public class ValidatePhone {

    public void checkPhone(String phone) {
        Pattern p = Pattern.compile("^\\([0-9]{2}\\)-\\([0-9]{10}\\)$");
        Pattern p1 = Pattern.compile("[0-9a-zA-Z]*");

        if (p.matcher(phone).find()&&p1.matcher(phone).find()) {
            System.out.println("phone is oke ");
        } else {
            System.out.println("phone is not oke ");
        }
    }
}
