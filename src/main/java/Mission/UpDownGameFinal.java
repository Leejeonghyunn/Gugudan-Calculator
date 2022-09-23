package Mission;
import java.util.Scanner;
/**
 * Up & Down 게임 리팩토링 문자열 입력 버전
 */
public class UpDownGameFinal {
    public static void main(String[] args) {

        Scanner sc;
        UpDownGameTest game;
            //무한반복문
            while (true) {

                try {
                    sc = new Scanner(System.in);
                    System.out.println("게임 시작 1");
                    System.out.println("게임 종료 2");
                    System.out.println(">>");

                    int num = sc.nextInt(); //num은 사용자의 입력값

                    if (num == 1) {
                        game = new UpDownGameTest();
                        game.run2(num);
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
class UpDownGameTest { //static을 써야하는 이유?

    void run2(int userInput) {

        Scanner sc = new Scanner(System.in);

        int randomValue = (int) (Math.random() * 100 + 1); //랜덤값 설정
        //System.out.println("randomValue = " + randomValue);

        //반복문에 태그를 건다 : 반복문이 여러개있을떄 원하는 반복문만 break할 수 있게 하는 기능
        check:
        for (int cnt = 0; cnt < 10; cnt++) { //cnt : 시도횟수
            System.out.println("답을 입력해주세요. : ");

            String inputValue = sc.next(); //입력받은 값을 String 형태로 저장한다
            /**
             * String으로 입력을 받아도 if문에서 숫자와 조건비교를 하는 방법 : string.length() 로 받는다
             */
            for (int i = 0; i < inputValue.length(); i++) {
                char ch = inputValue.charAt(i); //입력받은 값에서 한 글자씩 가져온다

                if (!('0' <= ch && ch <= '9')) { //해당 입력받은 글자가 '0' ~ '9' 범위내의 값인지 확인한다
                    System.out.println("입력값이 정수가 아닙니다."); //범위를 벗어난다면 정수로 변경할 수 없다
                    continue check; //check for 문을 계속 실행한다(반복문)
                }
            }

            userInput = Integer.parseInt(inputValue); //inputValue : String 을 num : int 형으로 바꿔준다(정수형)

            if (!(0 < userInput && userInput < 100)) { //입력값의 범위를 확인한다
                System.out.println("100까지만 입력해주세요");
            }

            if (userInput < randomValue) {
                System.out.println("HIGH");
            } else if (userInput > randomValue) {
                System.out.println("LOW");
            } else {
                System.out.println("정답입니다. 시도횟수 : " + cnt);
                return;
            }
        }
        System.out.println("시도횟수를 넘기셨습니다. ");
    }
}
