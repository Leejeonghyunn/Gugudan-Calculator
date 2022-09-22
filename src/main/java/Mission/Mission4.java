package Mission;
import java.util.Scanner;
/**
 * 평균이 90 수. 80 우. 70 미. 60 양. 50 가 를 출력하는 프로그램을 만드시오
 * 위의 코드를 테스트하는 GradeTest 클래스를 만드시오
 */

public class Mission4 {
    public static void main(String[] args) {

        System.out.println("점수를 입력해주세요 : ");

        char grade = ' ';
        int score = '0';

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();


        System.out.printf("당신의 점수는 %d입니다. %n", score); //printf

        if (score >= 90) {
            grade = '수';
        } else if (score >= 80) {
            grade = '우';
        } else if (score >= 70) {
            grade = '미';
        } else if (score >= 60) {
            grade = '양';
        } else  {
            grade = '가';
        }

        System.out.printf("당신의 학점은 %c 입니다", grade); //printf
    }
}
