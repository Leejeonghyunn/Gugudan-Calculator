package OOP;

public class OopStudent {
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Kim";
        student.id = "20221937";
        student.age = 20;

        System.out.println("학생의 이름 : " + student.getName());
        System.out.println("학생의 학번 : " + student.getId());
        System.out.println("학생의 나이 : " + student.getAge());
    }
}
class Student {
    String name;
    String id;
    int age;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
}