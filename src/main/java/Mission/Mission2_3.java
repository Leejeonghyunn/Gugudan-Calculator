package Mission;
import java.util.Scanner;
/**
 * Up & Down 게임 리팩토링
 */
public class Mission2_3 {

    public static void main(String args[]) {

        Scanner sc;
        UpDownGame game;

        //무한반복문
        while (true) {

            try {
                sc = new Scanner(System.in);

                System.out.println("게임 시작 1");
                System.out.println("게임 종료 2");
                System.out.println(">>");

                int num = sc.nextInt(); //num은 사용자의 입력값

                if (num == 1) {

                    game = new UpDownGame();
                    game.run(num);

                } else {
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                System.out.println("게임을 다시 시작 합니다.");
            }
        }
    }
}

class UpDownGame{

    Scanner sc = new Scanner(System.in);

    final int COUNT = 10; //10번의 기회
    int[] arrInput; // 사용자 입력횟수
    int answer; // 정답인 랜덤값

    void run(int num) {

        int[] arrInput = new int[COUNT]; //사용자 입력의 횟수가 10인 배열을 만든다
        int answer = (int)(Math.random() * 100 + 1); //1 <= answer < 101의 중에 하나의 랜덤값

        //기회가 10번인 배열
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print("숫자를 입력해주세요 : ");
            num = sc.nextInt(); //입력값

            if (num > answer) {
                System.out.println("Down ===> " + (COUNT - i - 1) + "번 남아 있습니다.");
            } else if (num < answer) {
                System.out.println("Up ====> " + (COUNT - i - 1) + "번 남아 있습니다.");
            } else {
                System.out.println("일치");
                break;
            }
        }

    }
}