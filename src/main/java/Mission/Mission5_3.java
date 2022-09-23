package Mission;
import java.util.Scanner;
/**
 * 문자형 2차원 배열 5행 5열을 만들고 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하시오
 * 또한 계속해서 반복 실행하도록 구현하고 행이나 열 입력시 0 미만 5 이상의 수가 입력되면 프로그램을 종료하시오.
 */
public class Mission5_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("배열 크기를 입력하세요. >> ");

        int size;
        int row; //행
        int col; //열

        do {
            size = scanner.nextInt(); //배열의 크기를 입력받음
            if (size <= 0) {
                System.out.println("1 이상의 수를 입력해주세요."); //0 이하의 수가 들어왔을 때, 다시 입력을 받음
            } else {
                break; //배열의 크기가 1이상, 즉 정상적으로 입력되었으면, do-while 문을 벗어남
            }
        } while (size <= 0); //배열의 크기가 0보다 작을경우 Loop가 계속 돌아가게 한다.

        char[][] array = new char[size][size]; //'X'를 입력받아야 하기 때문에, char배열로 생성하였다

        while (true) {

            //try-catch문을 사용할 경우 정수값이 input되지 않을경우 에러 발생없이 프로그램이 종료된다
            //'X'를 표시할 행과 열을 입력받음
            try {
                System.out.println("행 인덱스를 입력하세요. (0 ~ " + (size - 1) + ") 입력 >> ");
                row = scanner.nextInt();
                System.out.println("열 인덱스를 입력하세요. (0 ~ " + (size - 1) + ") 입력 >> ");
                col = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("숫자만 입력하셔야 됩니다. 프로그램을 종료합니다. ");
                break;
            }
            //인덱스 값에 포함되지 않는 값이 들어올 경우 프로그램 종료
            if (array[row][col] != 'X') {
                array[row][col] = 'X';
            } else {
                System.out.println();
                System.out.println(" 이미 입력하셨습니다. ");
                System.out.println();
            }
            System.out.print(" ");

            for (int i = 0; i < size; i++) {
                System.out.print(i + " ");
                System.out.println();
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[i][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
