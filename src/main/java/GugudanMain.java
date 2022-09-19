public class GugudanMain {

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = GugudanClass.calculate(i);

            GugudanClass.print(result);
        }
    }
}
