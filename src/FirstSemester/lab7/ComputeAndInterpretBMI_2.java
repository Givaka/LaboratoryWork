package FirstSemester.lab7;

import java.util.Scanner;

public class ComputeAndInterpretBMI_2 {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

//        Переменные
//        Константы
        final int SPM = 100; // Сантиметоров в метре

//        Входные
        double  weight;
        int     heightM, heightSM;

//        Промежуточные
        double  bmi,
                height;

//        Выходные
        String resultBMI;


//        Получение данных от пользователя
        System.out.print("Введите вес в килограммах: ");
        weight = in.nextDouble();
        System.out.print("Введите рост в метрах: ");
        heightM = in.nextInt();
        System.out.print("Введите рост в сантиметрах: ");
        heightSM = in.nextInt();

//        Вычисление индекса массы тела
        height = heightM + ((double)heightSM / 100);
        bmi = (double) Math.round( ((double)weight / Math.pow( height , 2)) * 10) / 10;

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
