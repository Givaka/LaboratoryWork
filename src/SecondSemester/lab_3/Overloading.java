package SecondSemester.lab_3;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        // Подключенмие внешнего класса
        Scanner in = new Scanner(System.in);

        // Получение от пользователя двух int
        System.out.print("Введите два целочисленных числа: ");
        int i = in.nextInt(),
            j =in.nextInt();

        // Вывод
        System.out.println("Самое большое число из представленных: "+ max(i,j));


        // Получение от пользователя двух double
        System.out.print("Введите два вещественных числа: ");
        double  x = in.nextDouble(),
                y = in.nextDouble();

        // Вывод
        System.out.println("Самое большое число из представленных: "+ max(x,y));

        // Получение от пользователя данных
        System.out.print("Введите три вещественных числа: ");
                x = in.nextDouble();
                y = in.nextDouble();
        double  z = in.nextDouble();

        // Вывод
        System.out.println("Самое большое число из представленных: "+ max(x,y,z));
    }

    // Поиск наибольшого (из 2 целых)
    public static int max(int n1, int n2){
        return (n1 > n2) ? n1 : n2; // Проверка наибольшего из 2 int
    }

    // Поиск наибольшого (из 2 дробных)
    public static double max(double n1, double n2){
        return ((int)(n1*100) > (int)(n2*100)) ? n1 : n2; // Проверка наибольшего из 2 double
    }

    // Поиск наибольшого (из 3 дробных)
    public static double max(double n1, double n2, double n3){
        // Проверка наибольшего из 3 double
        if ((int)(n1*100) > (int)(n2*100) && (int)(n1*100) > (int)(n3*100))      return n1;
        else if ((int)(n2*100) > (int)(n3*100)) return n2;
        else                                    return n3;
    }
}
