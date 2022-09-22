package LionArray;

import java.util.Arrays;

public class ArrayLotto2 {
    public static void main(String[] args) {

        int[] arrLotto = new int[6]; //6개의 값을 생성하기 위한 배열 생성

        for (int i = 0; i < arrLotto.length; i++) { // i = 1
            arrLotto[i] = (int) (Math.random() * 45) + 1;

            for (int k = 0; k < i; k++) {
                if (arrLotto[i] == arrLotto[k]) //중복이 나오면 다시 반복한다
                    i--; //i = 0
            }
        }
        System.out.println(Arrays.toString(arrLotto));
    }
}
