public class Gugudan1 {

    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = 2 * (i + 1);

            System.out.println(result[i]);
        }
    }
}
