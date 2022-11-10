package ss5.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    public static String college = "BBDIT";


    Student(int no, String name) {
        this.rollno = no;
        this.name = name;
    }


    public static void setCollege(String college) {
        Student.college = college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
