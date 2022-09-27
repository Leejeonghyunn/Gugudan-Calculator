package Mission2;
import java.util.Scanner;
/**
 * 문자형 2차원 배열 5행 5열을 만들고 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하시오
 * 또한 계속해서 반복 실행하도록 구현하고 행이나 열 입력시 0 미만 5 이상의 수가 입력되면 프로그램을 종료하시오.
 */
public class ArryaOmok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][5]; //값을 입력해야됨
        int row;
        int col;

        while (true) {
            //값을 입력받는다
            System.out.print("행 인덱스 입력 : ");
            row = sc.nextInt();
            System.out.print("열 인덱스 입력 : ");
            col = sc.nextInt();

            //유효성 검사 : 값이 0이거나 5이상이면 프로그램을 종료한다
            if (row < 0 || row > 4 || col < 0 || col > 4) {
                System.out.print(" 프로그램을 종료합니다. ");
                break;
            }

            arr[row][col] = 'X'; //입력이 된 좌표값에 X를 입력한다
            System.out.println(" 0 1 2 3 4");

            for (int i = 0; i < arr.length; i++) { //arr.length = 5
                System.out.print(i + " ");
                for (int k = 0; k < arr[i].length; k++) {
                    System.out.print(arr[i][k] + " ");
                    System.out.println(); //줄 바꿈
                }
                System.out.println();
            }
            sc.close();
        }
    }
}
