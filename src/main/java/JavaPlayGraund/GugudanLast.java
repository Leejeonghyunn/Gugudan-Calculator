package JavaPlayGraund;

import java.util.Scanner;

public class GugudanLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine(); //사용자가 입력한 값을 문자열로 받는다

        String[] inputValue = value.split(","); //사용자가 입력한 값을 쉼표(,)를 기준으로 분리한다

        int first = Integer.parseInt(inputValue[0]);
        int second = Integer.parseInt(inputValue[1]);
        //쉽표를 기준으로 분리한 문자열을 숫자로 변환한다 - Integer클래스의 parseInt 함수는 String 타입의 숫자를 int타입으로 변환해줌

        for (int i = 2; i <= first; i++) {
            for (int k = 1; k <= second; k++) {

                System.out.println(i + "X" + k + " = " + i * k);
            }
        }
        sc.close();
    }

}
