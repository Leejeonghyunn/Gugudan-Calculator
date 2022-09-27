package Mission2;

import java.util.Arrays;

/**
 * 버블 정렬 : 옆에 있는 데이터와 비교하여 더 작은 값을 앞으로 보낸다
 */
public class Bubble {

    public static int[] bubbleSort(int n, int[] array) {

        for (int i = 1; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                int tmp = 0;

                if (array[k] > array[k + 1]) {
                    tmp = array[k];
                    array[k] = array[k + 1];
                    array[k+1] = tmp;
                }
            }
            System.out.printf("%d회전 정렬 결과 : " ,i);
            System.out.println(Arrays.toString(array));
        }
        return array;
    }


    public static void main(String[] args) {

        int[] array = new int[]{7, 4, 5, 1, 3};

        System.out.println("정렬 전 : " + Arrays.toString(array));

        bubbleSort(array.length, array);

        System.out.println("정렬 후 : " + Arrays.toString(array));
    }
}