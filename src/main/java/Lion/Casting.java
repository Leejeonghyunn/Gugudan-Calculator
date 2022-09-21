package Lion;

public class Casting {

    public static void main(String[] args) {

        double pi = 3.1415;
        int wholeNumber = (int)pi; //가능

        long num1 = 30000000007L;
        int num2 = (int)num1; //가능

        short num3 = 1;
        short num4 = 2;

        short numA = (short) (num3 + num4); //short로 형변환 해주어야 한다
        int numB = num3 + num4;

        System.out.println(numA);
        System.out.println(numB);

        //int 범위 이하에 대해서는 두개 더하게 되면 자동으로 int로 형변환이 일어나게 된다
    }
}
