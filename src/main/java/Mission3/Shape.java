package Mission3;

public class Shape {

    protected double width; //폭
    protected double height; //높이

    Shape() { //기본 생성자

    }
    Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() { //넓이
        return 0; //기본값
    }
}

class Rectangle extends Shape { //직사각형

    Rectangle() { //기본 생성자

    }
    Rectangle (double width, double height){
        super(width, height); //부모 생성자 호출
    }
    double getArea() { //메서드 완성 : override
        return this.width * this.height / 2.0; // 폭 x 높이
    }
}

class Triangle extends Shape { //삼각형

    Triangle() { //기본 생성자

    }
    Triangle(int width, int height) {
        super(width, height);
    }
    double getArea() { //메서드 완성 : override
        //삼각형 넓이는 폭 x 높이 % 2.0
        return this.width * this.height / 2.0;
    }
}

class ShapeTest {
    public static void main(String[] args) {

        Shape[] shape = {
                new Rectangle(20, 20),
                new Triangle(20, 20)
        };
        double sumArea = 0; //기본값

        for (Shape s : shape) {
            //각 자식 클래스에서 구현한 getArea가 실행된다.
            sumArea += s.getArea();
        }
        System.out.println(sumArea);
    }
}