package ss14.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Peter");
        al.add("John");
        al.add("Marry");
        al.add("Andrew");

        Collections.sort(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
