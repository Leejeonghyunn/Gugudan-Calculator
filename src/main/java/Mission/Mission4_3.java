package Mission;
import java.util.Scanner;
/**
 * Grade 클래스를 만들고, 국어 영어 수학 3개의 점수를 입력받는 기능을 만들고
 * 평균이 수(90점 이상), 우(80점 이상), 미(70점 이상), 양(60점 이상), 가(60점 미만)을 출력하는 프로그램을 만드시오
 * 위의 내용을 테스트 하는 Mission4_2 클래스
 */

public class Mission4_3 {
    public static void main(String[] args) {

        Grade2 gradePrintMachine= new Grade2();

        gradePrintMachine.gradePrint();
    }
}

class Grade2 {

    void gradePrint() {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력해주세요 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요 : ");
        int math = sc.nextInt();

        double average = (double)((kor + eng + math) / 3.0);

        if(average <= 100 && average > 90) {
            System.out.println("수 점수 = " + average);
        } else if (average >= 80) {
            System.out.println("우 점수 = " + average);
        } else if (average >= 70) {
            System.out.println("미 점수 = " + average);
        } else if (average >= 60) {
            System.out.println("양 점수 = " + average);
        } else if (average < 60 && average > 0) {
            System.out.println("가 점수 = " + average);
        } else {
            System.out.println("다시 입력하세요");
        }
    }
}