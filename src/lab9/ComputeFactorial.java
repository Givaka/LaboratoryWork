package lab9;

import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

        int base,       // Основание факториала
            i,          // Член факториала
            factorial;  // Факториал числа

//        Инициализация переменных
        i = factorial = 1;

//        Получение данных от пользователя
        System.out.print("Введите число для факториала: ");
        base = in.nextInt();

//        Вычисление факториала введеного числа
        while (i++ < base)
            factorial *= i;

//        Вывод факториала
        System.out.println(base + "! = " + factorial);
    }
}