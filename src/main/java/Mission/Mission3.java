package Mission;
import java.util.Scanner;

public class Mission3 {
    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("몇층을 쌓을까요?");

        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int k = 0; k < num - i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) { //별을 홀수개만큼 찍어야 하기 때문에
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
