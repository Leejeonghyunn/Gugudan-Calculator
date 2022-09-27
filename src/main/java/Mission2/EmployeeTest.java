package Mission2;

//직원
class Employee {

    String name; //이름
    int age; //나이
    String address; //주소
    String department; //부서
    int salary; //월급

    Employee() { //기본 생성자

    }
    //이름, 나이, 주소, 부서를 지정하는 생성자 정의
    Employee(String name, int age, String address, String department) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
    }

    //인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력
    public void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("부서 : " + department);
    }
}
//직원 종류 - 정규직
class Regular extends Employee{

    //생성자
    Regular(String name, int age, String address, String department) {
        //부모 생성자 호출
        super(name, age, address, department);
    }
    //월급 정보를 업데이트하는 필드 지정
    public void setSalary(int salary) {
        this.salary = salary;
    }
    //'정규직'이라는 정보와 월급을 출력
    public void printInfo() {
        super.printInfo();
        System.out.println("정규직");
        System.out.println("급여 : " + salary);
    }
}
//직원 종류 - 비정규직
class Temporary extends Employee{

    int workhour; //일한 시간
    int time_pay; //시간당 보수

    Temporary(String name, int age, String address, String department) {
        //부모 생성자 호출
        super(name, age, address, department);
        time_pay = 10000; //시간당 보수의 초기값을 10000으로 저장한다
    }
    //Setter : 일한시간을 지정, 급여 = 일한시간 * 시간당 보수 로 저장
    public void setworkhour(int workhour) {
        this.workhour = workhour;
        this.salary = workhour * time_pay;
    }
    //비정규직이라는 정보과 일한시간, 급여를 출력
    public void printInfo() {
        super.printInfo();
        System.out.println("비정규직");
        System.out.println("일한 시간 : " + workhour);
        System.out.println("급여 : " + salary);
        System.out.println();
    }

}
public class EmployeeTest {
    public static void main(String[] args) {

        Regular r = new Regular("이순신", 35, "서울", "인사부");
        Temporary t = new Temporary("장보고", 25, "인천", "경리부");
        //정규직의 급여
        r.setSalary(5000000);
        r.printInfo();
        //비정규직의 일한 시간
        t.setworkhour(120);
        t.printInfo();
    }
}
