package ss10.bai_tap.mykedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();

        Student s1 = new Student(1, "hung");
        Student s2 = new Student(2, "hau");
        Student s3 = new Student(3, "vu");
        Student s4 = new Student(4, "dat");

       myLinkedList.add(3,s1);
        System.out.println(myLinkedList);
    }
}
