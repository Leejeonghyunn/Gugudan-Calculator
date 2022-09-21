package Lion;

public class Star2 {
    public static void main(String[] args) {

        for (int i = 5; i >=1; i--) { //세로
            for (int k = 1;  k <= i; k++) { //가로
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5; i++) { //세로
            for (int k = 1;  k <= 5 - i + 1; k++) { //가로
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.println(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
