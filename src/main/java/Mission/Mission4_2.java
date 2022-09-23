package Mission;
import java.util.Scanner;
/**
 * Grade 클래스를 만들고, 국어 영어 수학 3개의 점수를 입력받는 기능을 만들고
 * 평균이 수(90점 이상), 우(80점 이상), 미(70점 이상), 양(60점 이상), 가(60점 미만)을 출력하는 프로그램을 만드시오
 * 위의 내용을 테스트 하는 Mission4_2 클래스
 */

public class Mission4_2 { //public 은 소스파일 이름과 같은 클래스에만 붙어야 한다. public 클래스는 2개가 존재해선 안된다.
    public static void main(String[] args) {

        Grade gradePrintMachine = new Grade();

        gradePrintMachine.gradePrint();
    }
}
class Grade {

    int kor;
    int eng;
    int math;
    char grade = ' ';

    void gradePrint() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 국어, 영어, 수학 3점수를 넣어주세요. 공백으로 구분해주세요 : "); //80 20 20

        this.kor = sc.nextInt();
        this.eng = sc.nextInt();
        this.math = sc.nextInt();

        double average = (double)((kor + eng + math) / 3.0);

        System.out.printf("당신의 평균점수는 %f 입니다. %n", average);

        if (average >= 90) {
            grade = '수';
        } else if (average >= 80) {
            grade = '우';
        } else if (average >= 70) {
            grade = '미';
        } else if (average >= 60) {
            grade = '양';
        } else  {
            grade = '가';
        }

        System.out.printf("당신의 학점은 %c 입니다", grade);

        sc.close();
    }
}
