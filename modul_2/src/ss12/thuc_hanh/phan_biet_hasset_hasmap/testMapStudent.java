package ss12.thuc_hanh.phan_biet_hasset_hasmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class testMapStudent {
    public static void main(String[] args) {
        Student student1 = new Student("hùng", 28, "nghệ an") ;
        Student student2 = new Student("hậu", 18, "Quảng nam") ;
        Student student3 = new Student("vũ", 31, "Quảng trị") ;
        Student student4 = new Student("Quỳnh", 30 , "Đà nẵng") ;

        Set<Student> s = new HashSet<>() ;
        s.add(student1) ;
        s.add(student2) ;
        s.add(student3) ;
        s.add(student4) ;

        System.out.println(s.toString());

        Map<Integer, Student > m = new HashMap<>() ;

        m.put(1, student1) ;
        m.put(2, student2) ;
        m.put(3, student3) ;
        m.put(4, student4) ;
        for (Map.Entry<Integer,Student> entry:m.entrySet()) {
            System.out.println(entry.toString());
        }
    }
}
