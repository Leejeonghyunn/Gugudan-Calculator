package Lion;
/**
 * 문자 -> 숫자
 * :문자를 입력받아 숫자로 표현한다
 */
import java.util.Scanner;

public class Casting2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("알파벳을 입력해주세요");

        char ch = scanner.nextLine().charAt(0); //char 중에서 0번째 글자를 반환

        int num = (int) ch;

        System.out.println((int) ch);
    }
}
