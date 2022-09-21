package Lion;

/**
 * 복합 대입 연산자
 * 전위연산, 후위연산
 */
public class StringMath2 {

    public static void main(String[] args) {

        int x = 1, y=1;

        int a = x++; //x의 값이 사용되고 난 후 증가 : a = 1
        int b = ++y; //y의 값이 사용되기 전에 증가 : b = 2

        System.out.println(" a= " + a + " , b= " + b);
    }
}
