package FirstSemester.lab2;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double number1, number2, number3, average;


        System.out.print("Введите 3 числа: ");
        number1 = in.nextDouble();
        number2 = in.nextDouble();
        number3 = in.nextDouble();

        average = (number1+number2+number3)/3;

        System.out.println("Среднее арифмитичекое чисел: " + number1 + ", " + number2 + ", " + number3 + " = " + average);
    }
}
