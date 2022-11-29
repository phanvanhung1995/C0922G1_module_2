package ss18.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekEmail {
//    phanvanhung1224@gmail.com
    private  Pattern pattern;
    private Matcher matcher ;

    private static final String EMAIL_REGEX =  "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public ChekEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String email) {
        matcher = pattern.matcher(email);
        return matcher.find();
    }
}
