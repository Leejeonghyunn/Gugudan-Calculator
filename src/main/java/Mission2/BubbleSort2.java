package Mission2;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2 {
    static void startSort(int[] array) {
        int tmp = 0;
        for (int i = array.length; i >= 1; i--) {
            // 배열을 뒤에서부터 크기 순대로 다시 기록한다고 생각하면,
            // 배열길이가 n일때, index = 1 까지 기록하므로, n-1번 진행해야 한다.
            // ex) 배열 길이가 4일 때, [ o o o x] -> [o o x x] -> [o x x x] 남은 o은 알아서 최솟값이 기록되므로..
            // 루프 3번 진행
            for (int j = 1; j <= i - 1; j++) {
                // 배열의 제일 끝 값에 기록한 값은 원소 들 중 제일 최댓값임을 알 고 있으므로
                // j <= i - 1
                if (array[j - 1] > array[j]) { // 대소 비교
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
        System.out.println("최종 결과 : "+Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열크기를 입력하세요");

        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("배열을 입력하세요. 원소 " + N + "개");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        startSort(array);
    }
}