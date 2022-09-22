package OOP;

class Rectangle{ //static 금지
    int width;
    int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

public class StudentApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(10);
        rectangle.setHeight(10);

        Rectangle rectangle2 = new Rectangle();

        rectangle2.setWidth(20);
        rectangle2.setHeight(20);

        System.out.println(rectangle.getArea()); //10
        System.out.println(rectangle2.getArea());
    }
}
