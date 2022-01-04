package zachet1;

import java.util.Scanner;

public class NumberOfAdmitted {
    public static void main(String[] args) {
//        Подключение классов
        Scanner in = new Scanner(System.in);

//        Объявление переменных
        int   	numStudents,        // Количество студентов
                percentNonAdmission,// Процент недопушенных
                numGroup;           // Количество групп
        double  numAdmission;		// Количество допушенных

//        Вывод заголовка
        System.out.println("КОЛИЧЕСТОВ СТУДЕНТОВ И ГРУПП, ДОПУЩЕННЫХ НА ЭКЗАМЕН");

//        Получение корректного количество групп
        do {
            System.out.print("Введите количество групп: ");
            numGroup = in.nextInt();

            if (!(numGroup > 0))    // Cообщение об ошибки ввода
                System.out.println("Количество групп, не может быть меньше одной.");
        } while (!(numGroup > 0));
        System.out.println();   // Отступ

//        Получение пользовательских данных
        do {
//            Проверка группы на ноличие студентов
            do {
                System.out.print("Введите количество студентов в группе: ");
                numStudents = in.nextInt();

                if (!(numStudents > 0))    // Cообщение об ошибки ввода
                    System.out.println("Количество студентов в группе, не может быть меньше одной.");
            } while (!(numStudents > 0));

//            Проверка диапозона процента
            do {
                System.out.print("Введите процент студентов, не допущенных к экзамену: ");
                percentNonAdmission = in.nextInt();

                if (percentNonAdmission > 100)  // Cообщение об ошибки ввода
                    System.out.println("Вы ввели процент провышающие 100%");
                if (percentNonAdmission < 0)    // Cообщение об ошибки ввода
                    System.out.println("Вы ввели процент меньше 0%");
            } while ((percentNonAdmission < 0) || (percentNonAdmission > 100));

//        Вычисление количество допущенных студентов к экзамену
            numAdmission = Math.ceil((double) (numStudents * (100 - percentNonAdmission)) / 100);

//        Вывод количества допущенных студентов
            if ((int) numAdmission == 0)
                System.out.println("На экзамен не допущена группа " + numGroup);
            else
                System.out.println("На экзамен " + (String) (((int) numAdmission > 1) ? "придут " : "придет ") + (int) numAdmission +
                        (String) (((int) numAdmission > 1) ? " студентов, " : " студент, ") + numGroup + " группы");
            System.out.println(); // Отступ
        } while (--numGroup > 0);
    }
}
