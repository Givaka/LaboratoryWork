package FirstSemester.lab10;

import java.util.Scanner;

public class SmallestDividerWithoutBreak {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

        int num,        // Входная переменна
            i;          // Промежуточная
        boolean trigger;// Сигнальная метка

//        Инициализвация переменных
        System.out.print("Введите число, для которого нужно найти наименьший делитель, отличный от 1: ");
        num = in.nextInt();
        i = 2;
        trigger = true;

//        Нахождение наименьшего делителя
        do {
            i++;
            if (num % i == 0 ) trigger = false; // Замена break
        } while (trigger);

//        Вывод
        System.out.println("Наименьший делитель числа " + num + " = " + i);
    }
}
