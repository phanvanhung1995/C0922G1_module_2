package ss12.thuc_hanh.phan_biet_hasset_hasmap;

public class Student {
    private String studentName ;
    private int age ;
    private String address ;

    public Student(String studentName, int age, String address) {
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
