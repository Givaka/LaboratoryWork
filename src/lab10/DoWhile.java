package lab10;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

        int firstNum, secondNum;    // Входные переменные
        short triggerFN, triggerSN; // Промежуточные переменные

//        Инициализация
        triggerFN = triggerSN = 0;

        do { // Выполняется пока не будут соблюдены условия
            System.out.print("Введите два числа через пробел: ");
            firstNum    = in.nextInt();
            secondNum   = in.nextInt();

            if (firstNum  % 2 == 0) triggerFN = 1;          // Проверка четности 1 числа
            if (firstNum  % secondNum == 0) triggerSN = 1;  // Проверка кратоности
            if (secondNum % firstNum  == 0) triggerSN = 2;  // Проверка кратоности

        } while (((triggerFN == 0) || (triggerSN == 0)) == true);

//        Вывод результата
        System.out.print("В последней пере ");
        switch (triggerSN) { //  Вывод результат какое число кратоно какому
            case 1:
                System.out.println("1-е число кратно 2-му");
                break;

            case 2:
                System.out.println("2-е число кратно 1-му");
                break;

        }
    }
}
