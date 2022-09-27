package JavaPlayGraund;

import java.util.Scanner;

/**
 * 요구사항 : 사용자의 값을 입력하는 구현, 입력 값에 따라 사칙연산 구현, 사칙연산 결과 값을 출력하는 구현을 서로 다른
 * 메서드로 나누어 구현한다
 * 사용자의 값을 입력하는 구현은 첫 번째 숫자 값, 사칙연산 기호 및 quit, 두 번쨰 숫자 값 입력으로 나뉜다.
 */

public class CalculatorMethod {
    //1
    static int getFirstValue(Scanner scanner) { //static이 있는 메서드에서 가져올땐 static을 붙여야 한다
        System.out.println("첫 번째 입력 값 : " );

        int first = scanner.nextInt();
        System.out.println(first);

        return first;
    }
    //2
    static String getSymbol(Scanner scanner) {
        System.out.println("사칙연산 기호 : " );

        String symbol = scanner.next();
        System.out.println(symbol);

        return symbol;
    }

    //3
    static int getSecondValue(Scanner scanner) {
        System.out.println("두 번째 입력 값 : ");

        int second = scanner.nextInt();
        System.out.println(second);

        return second;
    }

    //4
    static int calculate(int first, String symbol, int second) {
        int result = 0;

        if (symbol.equals("+")) {
            result = first + second;
            System.out.println("덧셈 : " + result);
        } else if (symbol.equals("-")) {
            result = first - second;
            System.out.println("뺄셈 : " + result);
        } else if (symbol.equals("*")) {
            result = first * second;
            System.out.println("곱셈 : " + result);
        } else if (symbol.equals("/")) {
            result = first / second;
            System.out.println("나눗셈 : " + result);
        } else {
            System.out.println("사칙연산 기호가 아닙니다");
        }
        return result;
    }

    //5
    static void print(int result) { //void
        System.out.println("최종 결과값 = " + result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        int first = getFirstValue(scanner);

        int result = first; //앞 단계에서 계산한 결과 값은 이후 연산의 첫번째 값으로 사용해야 한다

        while (true) {
            //2
            String symbol = getSymbol(scanner);

            if (symbol.equals("quit")) {
                //5
                print(result);
                break;
            }
            //3
            int second = getSecondValue(scanner);
            //4
            result = calculate(result, symbol, second);
            //result = first 이기 떄문에 변수 first 자리에 넣고 결과값은 result 이다
        }
    }
}
