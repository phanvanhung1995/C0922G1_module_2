package ss18.bai_tap.validate_name_class;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.regex.Pattern;

public class ValidateNameClass {

    public void checkNameClass(String name) {

        Pattern p = Pattern.compile("^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$");
        Pattern p1 = Pattern.compile("^[a-zA-Z0-9]*$");

        if (p.matcher(name).find()&& p1.matcher(name).find()) {
            System.out.println("name of class is oke");
        }else {
            System.out.println("name of clas not oke");
        }
    }
}
