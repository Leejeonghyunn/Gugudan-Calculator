package Lion;

/**
 * 삼항 연산자를 이용하여 세개의 수 중에 max값과 min값을 구하시오
 */
public class Math3 {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;

        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
