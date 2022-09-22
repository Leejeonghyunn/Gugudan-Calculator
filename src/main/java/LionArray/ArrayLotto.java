package LionArray;

/**
 * 배열 6개 선언
 * 1부터 45 랜덤으로 숫자를 넣고 출력하시오. 단 중복없이
 */
public class ArrayLotto {
    public static void main(String[] args) {

        int[] ball = new int[45]; //45개의 정수값을 저장하기 위한 배열 생성

        //1. 배열의 각 요소에 1 ~ 45의 값을 저장한다
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1; //ball[0]에 1이 저장된다
        }
        int tmp = 0; //두 값을 바꾸는데 사용할 임시변수
        int k = 0; //임의의 값을 얻어서 저장할 변수

        //2. 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        for (int i = 0; i < 6; i++) { //6개만 바꾼다
            k = (int) (Math.random() * 45); //0 ~ 44범위의 임의의 값을 얻는다 - 범위의 값을 모두 얻어어 해당 인덱스의 값을 바꿀 수 있다

            tmp = ball[i];
            ball[i] = ball[k];
            ball[k] = tmp;
        }

        //배열 ball의 앞에서부터 6개의 요소를 출력한다
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n" , i , ball[i]);
        }
    }
}
