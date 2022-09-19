public class GugudanMethod {

    public static int[] calculate(int times) { //int times - 입력값, int[] - 반환값

        int[] result = new int[9]; //타입과 메서드의 반환값을 일치시켜 준다

        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1); //times의 값이 2,3...9단을 결정
        }
        return result; //int[] = result
    }

    public static void print(int[] result) { //배열에 담겨있는 값 출력

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            int[] result = calculate(i); //2,3,4,5...9단 까지
            print(result);
        }

    }
}
