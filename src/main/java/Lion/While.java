package Lion;

/**
 * 반복문 while
 * 1+2+3+4+5+6+7+8+9+10 의 값을 구하시오
 */

public class While {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0; //합계

        while (num <= 10) {
            sum += num; //sum = sum+num
            num++;
        }
        System.out.println("합계" + sum);

        }
}
