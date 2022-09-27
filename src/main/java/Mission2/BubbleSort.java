package Mission2;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class BubbleSort {

    public int[] bubbleSort(int num, int[] arr) {

        for (int i = 0; i < num - 1; i++) { //i = 턴의 횟수 i < 4까지 돈다
            for (int k = 0; k < num - i - 1; k++) { // k < 3까지 돈다
                if (arr[k] > arr[k + 1]) { //숫자 바꿔주는 역할

                    int tmp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        BubbleSort bubble = new BubbleSort();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); //num값을 입력받는다
        int[] arr = new int[num]; //num개의 배열 arr를 만든다

        for (int i = 0; i < num; i++) { //오름차순으로 정렬
            arr[i] = scanner.nextInt();
            for(int x : bubble.bubbleSort(num, arr)){ //forEach문으로 bubbleSort의 return 배열을 받는다
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
