package ss5.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        System.out.println(Student.college);
        Student.setCollege("hùng");
        System.out.println(Student.college);

        Student s1 = new Student(1,"Hùng");
        System.out.println(s1.toString());
    }
}
