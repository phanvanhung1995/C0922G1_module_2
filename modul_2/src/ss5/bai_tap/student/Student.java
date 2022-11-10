package ss5.bai_tap.student;

public class Student {
    private String name = "join";
    private String classes = "co2";

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student() {

    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
