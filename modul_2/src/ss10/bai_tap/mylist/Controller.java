package ss10.bai_tap.mylist;

public class Controller {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Hung");
        Student s2 = new Student(2, "Hau");
        Student s3 = new Student(3, "Vu");
        Student s4 = new Student(4, "Nam");
        Student s5 = new Student(5, "Quynh");


        MyList<Student> studentMyList = new MyList<>();

        studentMyList.add(s1);
        studentMyList.add(s2);
        studentMyList.add(s3);
        studentMyList.add(s4);
        studentMyList.add(s5, 2);
        studentMyList.size() ;
//        studentMyList.clear();
        System.out.println(studentMyList.size());
        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println(studentMyList.get(3).getName()); ;
    }
}
