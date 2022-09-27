package JavaPlayGraund;

public class GugudanClass { //클래스로 분리

    public static int[] calculate(int times) {

        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1); // result[2] = 2 * (i+1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    }

