package lab2;

import java.util.Scanner;

public class ComputeCircumference {
    public static void main(String[] args) {
        // создание объекта класса Scanner
        Scanner in = new Scanner(System.in);

        // константа - число Пи
        final double PI = Math.PI;
        // объявление переменной radius и area
        double radius, perimeter;

        // Получить радиус круга
        System.out.print("Введите радиус круга: ");
        //присвоить  переменной  radius  введенное  значение  с  помощью  метода  input.nextDouble()
        radius = in.nextDouble();

        // Вычислить длины окружности круга
        perimeter = 2*PI*radius;

        // Отобразить длину окружности круга
        System.out.println("Длина окружности круга с радиусом " + radius + " равна " + perimeter + ".");
    }
}
