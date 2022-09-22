package Mission;
import java.util.Scanner;

public class Mission1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfLines = sc.nextInt(); //층의 높이

        for (int i = 0; i < numOfLines; i++) { //층 높이

            for (int k = 0; k < numOfLines - i; k++) { //줄 갯수만큼 루프 - (중앙 - 1)에서 하나씩 감소
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) { // 1,3,5...(줄 갯수 * 2)-1 식으로 증가
                System.out.print( "* ");
            }
            System.out.println(""); //줄 바꿈
        }
        sc.close(); //OS자원을 돌려주고, 추가적인 스캐너 입력 방지
    }
}
