package FirstSemester.lab10;

import java.util.Scanner;

public class SmallestDivider {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

        int num, // Входная переменна
            i;   // Промежуточная

//        Инициализвация переменных
        System.out.print("Введите число, для которого нужно найти наименьший делитель, отличный от 1: ");
        num = in.nextInt();
        i = 2;

//        Нахождение наименьшего делителя
        do {
            if (num % i == 0 ) break;
        } while (i++ >= 2);

//        Вывод
        System.out.println("Наименьший делитель числа " + num + " = " + i);
    }
}
