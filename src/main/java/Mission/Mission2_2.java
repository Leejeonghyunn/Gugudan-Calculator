package Mission;
import java.util.Scanner;

/**
 * Up & Down 게임
 */

public class Mission2_2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        final int COUNT = 10;
        int[] arrInput;// 사용자 입력
        int answer;

        arrInput = new int[COUNT];
        answer = (int) (Math.random() * 100 + 1);

        while (true) {

            try {

                System.out.println("게임 시작 1");
                System.out.println("게임 종료 2");
                System.out.println(">>");

                int num = sc.nextInt();

                if (num == 1) {

                    for (int i = 0; i < arrInput.length; i++) {
                        System.out.print("숫자를 입력해주세요 : ");
                        num = sc.nextInt();

                        if (num > answer) {
                            System.out.println("Down ===> " + (COUNT - i - 1) + "번 남아 있습니다.");
                        } else if (num < answer) {
                            System.out.println("Up ====> " + (COUNT - i - 1) + "번 남아 있습니다.");
                        } else {
                            System.out.println("일치");
                            break;
                        }
                    }

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