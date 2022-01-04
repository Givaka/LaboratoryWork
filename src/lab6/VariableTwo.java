package lab6;

import java.util.Scanner;

public class VariableTwo {

    public static void main(String[] args) {
//        Подключение классов
        Scanner in = new Scanner(System.in);

//        Объявление переменных
        int   	numStudents,        // Количество студентов
                percentNonAdmission,// Процент недопушенных
                numAdmission;       // Количество допушенных
        double  numNotAdmission;	// Количество не допушенных

//        Вывод заголовка
        System.out.println("КОЛИЧЕСТОВ СТУДЕНТОВ, ПРИШЕДШИХ НА ЭКЗАМЕН");

//        Получение пользовательских данных
        System.out.print("Введите количество студентов в группе: ");
        numStudents = in.nextInt();
        System.out.print("Введите процент студентов, не допущенных к экзамену: ");
        percentNonAdmission = in.nextInt();

//        Вычисление количество допущенных студентов к экзамену
        numNotAdmission = Math.round(numStudents * ((double)percentNonAdmission/100));
        numAdmission    = numStudents - (int)numNotAdmission;

//        Вывод количества допущенных студентов
        System.out.println("На экзамен придут " + (int)numAdmission + " человека.");
    }
}
