package _2_lab3;

public class Rectangle {
    double  width = -1,
            height = -1;

    public static void main(String[] args) {

    }

    public double getArea() {
        return height*width;
    }

    public double getPerimeter() {
        return 2*(height+width);
    }
}
