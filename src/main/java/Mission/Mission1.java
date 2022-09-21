package Mission;

/**
 * 별찍기
 */

public class Mission1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            //세로줄을 나타내는 반복문 - 5행에 별이 증가하므로 5회 반복하는 증가하는 반복문

            for (int k = 0; k < 4-i; k++) {
                //1. 가로줄을 나타내는 반복문 - 공백 개수가 4,3,2,1,0 이므로 행이 증가할수록 줄어드는 반복문
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
                //2. 가로줄을 나타내는 반복문 - 별 개수가 1,3,5,7,9 이므로 1개부터 행이 증가할수록 2개씩 늘어나는 반복문
            }
            System.out.println(""); //세로줄 줄바꿈
        }
    }
}
