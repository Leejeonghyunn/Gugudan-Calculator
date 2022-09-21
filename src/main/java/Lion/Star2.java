package Lion;

public class Star2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { //세로
            for (int k = i;  k < 6; k++) { //가로
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
