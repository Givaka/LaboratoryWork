package FirstSemester.lab8;

import java.util.Scanner;

public class EqualityOfTwoNumbers {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

//        Объявление переменных
        double x, y;

//        Получение значения
        System.out.print("Введите первое число: ");
        x = in.nextDouble();
        System.out.print("Введите Второе число: ");
        y = in.nextDouble();

//        Проверка равенства чисел
        switch ((x > y) ? 1 : ( (x == y) ? 2 : 0) ){
            case 0:
                System.out.println("Число " + x + " меньше числа " + y);
                break;

            case 1:
                System.out.println("Число " + x + " больше числа " + y);
                break;

            case 2:
                System.out.println("Число " + x + " равен числу " + y);
                break;
        }
    }
}
