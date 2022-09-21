package JavaReturn;
import java.util.Scanner;

/**
 * 1에서 부터 입력받은 어떤 수까지 있는 소수를 찾아보자
 * : 소수는 약수가 1과 자기 자신 뿐인 자연수. 그 외에 다른 약수가 존재하면 소수가 아님
 * : 입력받은 수를 i로 나누었을 때 0일 경우가 존재하면 소수가 아님 - 1과 자기자신을 제외하면 나눠질 수 없다
 * : 1과 자기 자신을 제외할 때까지 반복하려면 시작값을 2 끝값을 '자기 자신 - 1'까지 설정
 * : 출력시 문제가 되지 않도록 boolean flag 변수 선언을 해준다.
 */

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("수를 입력해 주세요 : ");
        int input = sc.nextInt();

        int primeNum; //소수 변수 선언
        boolean isPrimeNum = false; //소수에 대한 flag변수

        System.out.println(2 + "\t - 소수 0"); //2는 소수이므로 미리 출력

        for (primeNum = 1; primeNum <= input; primeNum++) { // 1부터 입력받은값 사이의 소수를 구하므로 input까지 반복

            for (int i = 2; i <= input - 1; i++) { //1과 자기 자신은 포함시키지 않는다
                if (primeNum > i) { // primeNum을 i로 나눈 나머지를 구해야 하므로 primeNum > i
                    if (primeNum % i == 0) { // i는 primeNum의 약수라는 뜻
                        isPrimeNum = false; // 소수가 아니다
                        break;
                    } else {
                        isPrimeNum = true; //소수가 맞다
                    }
                } else {
                    break;
                }
                }
            if (isPrimeNum == true) {
                System.out.println(primeNum + "\t - 소수 0");
            }
            }
        }
    }

