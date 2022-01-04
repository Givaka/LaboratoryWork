package lab2;

// класс Scanner находится в пакете java.util package
import java.util.Scanner;

// объявление класса ComputeAreaWithConstant
public class ComputeAreaWithConstant {
    // главный метод программы
    public static void main(String[] args) {
        // создание объекта класса Scanner
        Scanner in = new Scanner(System.in);

        // константа - число Пи
        final double PI = Math.PI;
        // объявление переменной radius и area
        double radius, area;

        // Получить радиус круга
        System.out.print("Введите радиус круга: ");
        //присвоить  переменной  radius  введенное  значение  с  помощью  метода  input.nextDouble()
        radius = in.nextDouble();

        // Вычислить площадь круга
        // значение выражения присваивается переменной area
        area = PI*Math.pow(radius,2);

        // Отобразить площадь круга
        System.out.println("Площадь круга с радиусом " + radius + " равна " + area + ".");
    }
}
