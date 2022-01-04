package lab7;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

//        Переменные
//        Константы
        final int SPM = 100; // Сантиметоров в метре

//        Входные
        double  weight;
        int     height;

//        Промежуточные
        double bmi;

//        Выходные
        String resultBMI;


//        Получение данных от пользователя
        System.out.print("Укажите ваш вес в килограммах: ");
        weight = in.nextDouble();
        System.out.print("Укажите ваш рост в сантиметрах: ");
        height = in.nextInt();

//        Вычисление индекса массы тела
        bmi = (double) Math.round((weight / Math.pow(((double) height / SPM) , 2)) * 10) / 10;

//        Определения результата
        if ( bmi < 18.5)
            resultBMI = "недостаточный вес";
        else if (bmi < 25)
            resultBMI = "нормальный вес";
        else if (bmi < 30)
            resultBMI = "избычтоный вес";
        else
            resultBMI = "ожирение";

//        Вывод результатов
        System.out.println("Ваш ИМТ = " + bmi + ", у вас " + resultBMI + ".");
    }
}
