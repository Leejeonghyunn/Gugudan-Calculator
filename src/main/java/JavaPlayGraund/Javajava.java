package JavaPlayGraund;

public class Javajava {

    public static void main(String[] args) {

        /**
         * 문자와 문자열은 반드시 구분 - 문자코드에 대한 이해가 우선 : 숫자와 문자의 일대일 매칭
         */
        char ch1 = '헐'; //char에 " "(큰따옴표)를 써서는 안된다
        String ch2 = "확";

        System.out.println(ch1 + ch2); //정수가 나옴
        System.out.println(ch1 + " " + ch2); //정상적으로 글자 출력

        /**
         * 문자 -> 숫자 : 인코딩
         * 숫자 -> 문자 : 디코딩
         */
        char ch3 = '헐';
        char ch4 = '확';

        char ch5 = 54736; //문자 '헐'의 유니코드 값
        char ch6 = 54869; //문자 '확'의 유니코드 값

        char ch7 = 0xD5D0;
        char ch8 = 0xD655;

        System.out.println(ch3 + " " + ch4);
        System.out.println(ch5 + " " + ch6);
        System.out.println(ch7 + " " + ch8);
    }
}
