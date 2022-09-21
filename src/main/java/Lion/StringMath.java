package Lion;

/**
 * 연산자의 우선순위
 * 문자열과 다른 실수 등의 데이터 타입을 같이 연산을 하게되면 한쪽으로 데이터 타입을 맞춘다
 * : 자동 캐스팅 된다
 *
 */
public class StringMath {

    public static void main(String[] args) {

        String s1 = "안녕하세요" + 6.0; //문자열로 반환이 된다 -> 데이터 타입을 맞춘다
        //6.0 -> "6.0"
        System.out.println(s1); //안녕하세요6.0

        String s2 = "JDK" + 3 + 3.0;
        String s3 = 3 + 3.0 + "JDK";
        System.out.println(s2); //JDK33.0
        System.out.println(s3); //6.0JDK -> 실수의 연산 먼저 수행된다
    }
}
