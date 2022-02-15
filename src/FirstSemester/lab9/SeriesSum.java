package FirstSemester.lab9;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

//        Определение входных, промежуточных и выходных переменных
        int n,      // Количество итераций
            i,      // Член ряда
            sum;    // Сумма ряда

//        Инициализация переменных
        i = sum = 0;
        System.out.print("Введите верхний придел ряда: ");
        n = in.nextInt();

//        Нахождение суммы ряда
        while (i <= n )
            sum += i++;

//      Выводим результат сравнения получившийся значение с (n * ( n + 1 )) / 2
        System.out.println("∑("+ n +") = " + sum + ", и "+ ((sum == (n * ( n + 1 )) / 2)? "" : "не ")  +
                "эквивалентен выражению \"(n * ( n + 1 )) / 2\" = "+ (n * ( n + 1 )) / 2);
    }
}
