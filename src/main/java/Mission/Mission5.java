package Mission;
import java.util.Scanner;
/**
 * 문자형 2차원 배열 5행 5열을 만들고 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하시오
 * 또한 계속해서 반복 실행하도록 구현하고 행이나 열 입력시 0 미만 5 이상의 수가 입력되면 프로그램을 종료하시오.
 */
public class Mission5 {

    //1. 클래스 내의 멤버들이 접근 가능한 멤버변수 배열 char[][] arrayBoard 를 선언한다.
    char[][] omock;

    //2. 모든 항목이 '0'으로 초기화 된 배열을 만든다.
    //   매겨변수의 배열 크기를 전달받아 그 크기만큼 배열을 만들것이다.
    char[][] makeOmock(int value) {

        //유효성 검사 - 0이하의 수가 들어왔을 때, 다시 입력을 받음
        do {
            if (value <= 0) {
                System.out.println("1이상의 수를 입력해주세요.");
            } else {
                //배열의 크기가 1이상으로 정상적으로 입력되었으면 do-while문 벗어남
                break;
            }
        } while (value <= 0); //0보다 작을경우 do-while문이 계속 실행된다

        omock = new char[value][value];

        /**
         String[][] arrayBoard = {

         {" ", " ", " ", " ", " "},
         {" ", " ", " ", " ", " "},
         {" ", " ", " ", " ", " "},
         {" ", " ", " ", " ", " "},
         {" ", " ", " ", " ", " "},
         };
         */
        for (int i = 0; i < value; i++) {
            for (int k = 0; k < value; k++) {
                omock[i][k] = '0';
            }
        }
        return omock;
    }

    //3. 배열의 결과를 출력하는 메서드를 만들었다
    void showOmock(char[][] a) {
        for(char[] col : a) {
            for (char tmp : col) {
                System.out.print(tmp + "");
            }
            System.out.println();
        }
    }
    //4. 인수를 전달받아 해당 위치의 배열요소를 X로 바꾼다
    char[][] markOmock(int x, int y) {

        omock[x - 1][y - 1] = 'X';
        return omock;
    }

    //5. 5 x 5 배열을 만든다. 콘솔에서 좌표값을 받아 표시한다
    public static void main(String[] args) {

        Mission5 point = new Mission5();

        point.omock = point.makeOmock(5);

        point.showOmock(point.omock);

        System.out.println("원하는 위치의 좌표를 입력하시오.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("X : ");
        int x = scanner.nextInt();
        System.out.println("Y : ");
        int y = scanner.nextInt();

        scanner.close();

        point.showOmock(point.markOmock(x, y));
    }
}
