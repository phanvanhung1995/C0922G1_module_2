package ss5.bai_tap.student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student() ;
        Student s2 = new Student("hùng", "C0922G1") ;

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
