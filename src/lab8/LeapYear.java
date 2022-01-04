package lab8;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

//        Объявление переменных
        int year;
        String isLeapYear;

//        Получение значения
        System.out.print("Введите проверяемые год на высокостность: ");
        year = in.nextInt();

//        Проверка высокостности
        isLeapYear = (year % 4 == 0) && ( (year % 100 != 0) || (year % 400 == 0) ) ? "высокостным " : "обычным";

//        Вывод
        System.out.println(year + " год является " + isLeapYear);
    }
}
