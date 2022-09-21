package LionArray;

import java.util.Arrays;

/**
 * 배열 10개를 선언 후 랜덤으로 정수를 넣은 후 최대값을 구하시오
 */

public class Array2 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;

            for (int num : arr) {
                if(num > max)
                    max = num;
            }
            System.out.println(max);
        }
    }
}
