package lab5;

import java.util.Scanner;

public class ComputeLoan {

    public static void main(String[] args) {
//        Подключение классов
        Scanner in = new Scanner(System.in);

//        Объявление переменных
//        Константы
        final int MPY = 12;                 // Месяцев в году

//        Входные данные
        int     numberOfYears;              // Срок кредита в годах
        double  annualInterestRate,         // Годовая процентная ставка по кредиту, в %
                loanAmount;                 // Сумма кредита в рублях

//        Промежуточные данные
        double  monthlyInterestRate;        // Ежемесячная % ставка по кредиту, в долях единицы

//        Выходные данные
        double  monthlyPayment,             // Ежемесячный платеж по кредиту в рублях
                totalPayment;               // Стоимость кредита

//        Получиение данных от пользователя
        System.out.print("Введите ежегодную ставку по кредиту в %: ");
        annualInterestRate = in.nextDouble();
        System.out.print("Введите срок кредита в годах: ");
        numberOfYears = in.nextInt();
        System.out.print("Введите сумму кредитов в рублях: ");
        loanAmount = in.nextDouble();

//        Вычисления
        monthlyInterestRate = (annualInterestRate / MPY) / 100; // Вычисление ежемесячной % ставки по кредиту
        monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow((1 + monthlyInterestRate),
                        (numberOfYears * MPY))));               // Вычисление ежемесячного платежа по кредиту в руб.
        totalPayment = monthlyPayment * (numberOfYears * MPY);  // Вычисление стоимости кредита

//        Вывод полученных данных
        System.out.print("Ежемесячный платеж = " + (Math.ceil(monthlyPayment * 100) / 100) +
                " ₽;\nСтоймость кредита = " + (Math.ceil(totalPayment * 100) / 100) + " ₽");
    }
}