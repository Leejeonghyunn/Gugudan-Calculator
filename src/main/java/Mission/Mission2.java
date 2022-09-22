package Mission;
import java.util.Scanner;

/**
 * UP & Down 숫자 맞추기 게임
 */

public class Mission2 {
    public static void main(String[] args) {

        //1~100사이의 임의의 값을 얻어 randomMath 에 저장한다 - Math.random() 메서드 사용
        int randomMath = (int)(Math.random() * 100) + 1;
        // 1 <= (int)(Math.random() * 100) + 1 < 101

        int input = 0; //사용자 입력을 저장할 공간
        int count = 0; //시도횟수를 세기 위한 변수

        //화면으로부터 사용자 입력을 받기 위해서 Scanner 클래스 사용
        Scanner sc = new Scanner(System.in);

        do{
            count ++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");

            input = sc.nextInt(); //입력받은 값을 변수 input안에 저장한다

            if (randomMath > input) {
                System.out.println("더 큰 수를 입력하세요"); //1. 작을떄
            } else if (randomMath < input) {
                System.out.println("더 작은 수를 입력하세요"); //2. 클때
            } else {
                System.out.println("맞췄습니다"); //3. 같을때
                System.out.println("시도횟수는 " + count + "번 입니다.");

                break; //do-while문을 벗어난다
            }
        } while(true); //do-while 무한반복문
        sc.close();
    }
}