/**
 * 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 정해진다
 *
 * 문자열을 입력 받은 후(scanner의 nextLine() 메서드 활용) 빈 공백 문자열을 기준으로 문자들을 분리해야 한다
 * String value = scanner.nextLine();
 * String[] values = value.split(" ");
 *
 * 문자열을 숫자로 변경하는 방법
 * int number = Integer.parseInt("문자열");
 */
import java.util.Scanner;
public class StringCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 값 입력 : " );

        String value = scanner.nextLine();
        System.out.println("입력 값 = " + value);

        String[] values = value.split(" ");
        // 5A+A10A+A15 -> value.split("A");
        // 5
        // +
        // 10
        // +zxcvzcxv
        // 15
        int first = Integer.parseInt(values[0]);
        System.out.println("first = " + first);

        int result = first; // 5

        // [ 5, +, 10, + , 15]
        for(int i = 1 ; i < values.length; i = i + 2) {
            String symbol = values[i];  // +
            System.out.println("symbol = " + symbol);

            int second = Integer.parseInt(values[i + 1]);
            System.out.println("second = " + second);
            //4
            result = CalculatorMethod.calculate(result, symbol, second);
        }

        CalculatorMethod.print(result);
    }

}
