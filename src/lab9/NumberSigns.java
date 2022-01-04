package lab9;

import java.util.Scanner;

public class NumberSigns {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

        final int SENTINEL = 0; // Сигнальная метка

        int inputNum,               // Вводиое число
            countPlus, countMinus;  // Счетчик для положительных и отрецательных чисел

//        Инициализация переменных
        countMinus = countPlus = 0;
        inputNum = 1;

//        Проверка и подсчет вводимого числа на знак
        System.out.println("Вводите целое число или " + SENTINEL + " для выхода: ");
        while (inputNum != SENTINEL){   // Цикл работает пока пользоавтель не введет 0
            inputNum = in.nextInt();    // Получение числа от пользователя
            if (inputNum != 0 && inputNum > 0) countPlus++; // Подсчет положительных, не нулевых, чисел
            else countMinus++;                              // Подсчет отрицательных чисел
        }

//        Вывод колчисвтва положительных и отрицательных чисел
        System.out.println("Вы ввели " + countPlus + " положительных чисел и " + countMinus + " отрицательных.");
    }
}
