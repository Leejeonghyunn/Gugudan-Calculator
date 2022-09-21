package LionArray;

/**
 * 배열 6개 선언
 * 1부터 45 랜덤으로 숫자를 넣고 출력하시오. 단 중복없이
 */
public class ArrayLotto {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        int tmp = 0;
        int k = 0;

        for (int i = 0; i < 6; i++) {
            k = (int) (Math.random() * 45);

            tmp = ball[i];
            ball[i] = ball[k];
            ball[k] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n" , i , ball[i]);
        }
    }
}
