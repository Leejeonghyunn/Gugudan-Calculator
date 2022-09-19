import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 입력 값 : ");

        int first = scanner.nextInt();
        System.out.println(first);

        int result = first; //앞 단계에서 계산한 결과 값은 이후 연산의 첫번째 값으로 사용해야 한다

        while (true) {
            System.out.println("사칙연산 기호 : ");
            String symbol = scanner.next();
            System.out.println(symbol);

            if (symbol.equals("quit")) { //"quit"이라는 문자열을 입력하는 경우 break을 사용해 프로그램을 종료할 수 있다
                System.out.println("최종 결과 값 : " + result);
                break; //프로그램을 종료하려면 break 키워드를 사용하면 된다
            }
            System.out.println("두 번째 입력 값 : ");

            int second = scanner.nextInt();
            System.out.println(second);

            if (symbol.equals("+")) {
                result = result + second;
                System.out.println("덧셈 : " + result);
            } else if (symbol.equals("-")) {
                result = result - second;
                System.out.println("뺄셈 : " + result);
            } else if (symbol.equals("*")) {
                result = result * second;
                System.out.println("곱셈 : " + result);
            } else if (symbol.equals("/")) {
                result = result / second;
                System.out.println("나눗셈 : " + result);
            } else {
                System.out.println("사칙연산 기호가 아닙니다");

            }
        }
    }
}
