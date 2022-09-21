package Lion;

public class Gugudan3 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println();

            if (i % 2 == 0) {  //짝수를 구분하는 방법
                for (int k = 1; k < 10; k++) {
                    System.out.println(i + " * " + k + " = " + (i * k));
                }
                }
        }
    }
}
