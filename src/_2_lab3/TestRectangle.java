package _2_lab3;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();

        obj1.width = 4;
        obj1.height = 40;

        obj2.width = 3.5;
        obj2.height = 35.9;


        System.out.println("Прямоугольник с высотой: "+obj1.width+" и ширеной: "+obj1.height+", имеет площадь = "+obj1.getArea()+" и периметр = "+obj1.getPerimeter());
        System.out.println("Прямоугольник с высотой: "+obj2.width+" и ширеной: "+obj2.height+", имеет площадь = "+obj2.getArea()+" и периметр = "+obj2.getPerimeter());
    }
}
