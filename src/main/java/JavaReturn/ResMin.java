package JavaReturn;
        import java.util.Scanner;

/**
 * 두 수를 입력받아 최소공배수를 구해보자
 */
public class ResMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //두 수를 입력받는다
        System.out.print("num1 : ");
        int num1 = sc.nextInt();

        System.out.print("num2 : ");
        int num2 = sc.nextInt();

        int max; //둘 중 큰 수 변수 선언
        int resMin = 0; //최소공배수 변수 선언

        if (num1 >= num2) { //둘 중에 큰 수를 찾는다
            max = num1;
        } else {
            max = num2;
        }

        for (int i = max; i >= max; i++) { //큰 수를 시작값으로 1씩 증가하는 무한반복 - 반복문
            if (i % num1 == 0 && i % num2 == 0) { //두 수를 각각 i로 나눈 나머지가 0일때까지 반복 - 조건문

                resMin = i; //if의 조건식이 성립하는 조건이 곧 최소공배수
                break;
            }
        }
        System.out.println(num1 + " , " + num2 + "의 최소공배수 : " + resMin);
    }
}
