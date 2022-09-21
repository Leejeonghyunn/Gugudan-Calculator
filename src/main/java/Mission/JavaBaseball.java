package Mission;
import java.util.Random;
import java.util.Scanner;

/**
 * 자바 숫자 야구게임
 * 1. 세 자리의 랜덤 숫자를 정한다.(범위는 1~9)
 * 2. 숫자를 맞추고 동시에 위치를 맞추면 Strike
 * 3. 숫자를 맞췄지만 위치가 다르면 Ball
 * 4. 번호와 위치 둘다 맞지 않을 시에는 out
 * 5. 세 자리의 숫자를 맞추게 되면 게임 끝
 */

public class JavaBaseball {
    public static void main(String[] args) {

        int com[] = new int[3]; //컴퓨터 1차 배열
        int user[] = new int[3]; //유저 1차 배열

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int strike = 0;
        int ball = 0;

        com[0] = r.nextInt(9) + 1;
        com[1] = r.nextInt(9) + 1;

        while (com[0] == com[1]) {
            com[1] = r.nextInt(9) + 1;
        }

        com[2] = r.nextInt(9) + 1;

        while (com[0] == com[2] || com[1] == com[2]) {
            com[2] = r.nextInt(9) + 1;
        }
        for (int x : com) {
            System.out.println(x);
        }
        System.out.println();

        while (true) {
            strike = 0;
            ball = 0;

            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + "번째 수를 입력하세요 : ");
                user[i] = sc.nextInt();
            }
            if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
                System.out.println("똑같은 입력이 있습니다");
                continue;
            }
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    if (i == k)
                        strike++;
                    else
                        ball++;
                }
            }
            if (strike == 3) {
                System.out.println("홈런입니다");

            } else if (strike == 0 && ball == 0) {
                System.out.println("Out입니다");
            } else {
                System.out.println("Strike : " + strike + " , " + "Ball : " + ball + "입니다");
            }
        }
    }
}

