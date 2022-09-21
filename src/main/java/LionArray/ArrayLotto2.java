package LionArray;

import java.util.Arrays;

public class ArrayLotto2 {
    public static void main(String[] args) {

        int[] arrLotto = new int[6];

        for (int i = 0; i < arrLotto.length; i++) {
            arrLotto[i] = (int) (Math.random() * 46) + 1;

            for (int k = 0; k < i; k++) {
                if (arrLotto[i] == arrLotto[k]) //중복이 나오면 다시 반복한다
                    i--;
            }
        }
        System.out.println(Arrays.toString(arrLotto));
    }
}
