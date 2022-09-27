package Mission;
import java.util.Scanner;
/**
 * 문자형 2차원 배열 5행 5열을 만들고 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하시오
 * 또한 계속해서 반복 실행하도록 구현하고 행이나 열 입력시 0 미만 5 이상의 수가 입력되면 프로그램을 종료하시오.
 */

public class Mission5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][5];

        int row; //행
        int column; //열

        //공백으로 된 5x5의 이차원 배열 만들기
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++)
                arr[i][j] = " ";
        }
        //무한반복문
        while (true){
            //행과 열의 입력값 받기
            System.out.println("행 인덱스 입력 >> ");
            row = sc.nextInt();
            System.out.println("열 인덱스 입력 >> ");
            column = sc.nextInt();

            //유효성 검사 : 행과 열의 좌표에서 5를 넘어선 안된다
            if (row > 0 && row < 6 && column > 0 && column <6) {
                arr[row][column] = "X";

                System.out.println("  0 1 2 3 4 ");

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(i + " ");
                    for (int j = 0; j < arr[0].length; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}