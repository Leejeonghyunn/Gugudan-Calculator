package Mission2;

/**
 * int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보
 * x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
 * -> (2, 2)에서 크기가 8x7인 사각형 : s의 면적은 36, t는 r을 포함합니다
 */

class Rectangle {

    //네가지 멤버변수를 private로 설정
    private int x;
    private int y;
    private int width; //너비
    private int height; //높이

    public Rectangle() { //기본 생성자

    }

    //x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //사각형 넓이 리턴 = 너비 x 높이
    public int square() {
        return this.width * this.height;
    }

    //사각형의 좌표와 넓이를 화면에 출력
    public void show() {
        System.out.println
                ("( " + this.x + " , " + this.y + " ) 에서 크기가 " + this.width + " X " + this.height + " 인 삼각형");
    }

    //매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
    //boolan contains : 이 문자열 내에서 지정한 문자가 표시되는지를 나타내는 값을 반환한다(대소문자 구분)
    public boolean contains(Rectangle r) {

        if (((r.x + r.width) < (this.x + this.width))
                && ((r.y + r.height) < (this.y + this.height))
                && (this.x < r.x) && (this.y < r.y)) {

            return true;
        } else {
            return false;
        }
    }
}

public class RectangleTest {
        public static void main(String[] args) {

            Rectangle r = new Rectangle(2, 2, 8, 7);
            Rectangle s = new Rectangle(5, 5, 6, 6);
            Rectangle t = new Rectangle(1, 1, 10, 10);

            r.show();

            System.out.println("s의 면적은" + s.square());
            if (t.contains(r))
                System.out.println("t는 r을 포함합니다");

            if (t.contains(s))
                System.out.println("t는 s를 포함합니다");
        }

    }
