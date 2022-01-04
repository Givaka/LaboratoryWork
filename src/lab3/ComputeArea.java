package lab3;
import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args) {
//        Создаени обьекта Scanner
        Scanner in = new Scanner(System.in);
//        Определение переменных
        double  x1, x2, x3, //Неизвестные переменные
                avr_nqrt;   //Значение среднего геометрического
//        Получение значений переменных
        System.out.print("Введите три вещественных чилса: ");
        x1 = in.nextDouble();
        x2 = in.nextDouble();
        x3 = in.nextDouble();
//        Получение среднего геометрического числа
        avr_nqrt = Math.pow((x1+x2+x3), 1.0/3.0);
//        Ввывод результата
        System.out.println("Среднее геометрической введенных чисел = " + avr_nqrt);
    }
}
