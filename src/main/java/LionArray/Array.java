package LionArray;

public class Array {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        int sum = 0;

        //입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            //sum += i+1;
        }
        //합 구하기
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //합 구하기
        for (int num : arr) { //for-each 루프
            sum += num;
        }
        System.out.println(sum);
    }
}
