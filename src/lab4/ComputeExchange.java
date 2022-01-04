package lab4;

import java.util.Scanner;

public class ComputeExchange {

    public static void main(String[] args) {
//        Подключение классов
        Scanner in = new Scanner(System.in);

// Объявление и инициализация переменных
//        Объявление и инициализация входных данных
        System.out.print("Введите сумму в рублях, кратную 50: ");
        int sumRUB = in.nextInt();

//        Объявление и инициализация промежуточных данных
        int fiveThousandthBill  = sumRUB /  5000,
            twoThousandthBill   = ( sumRUB % 5000 ) / 2000,
            oneThousandthBill   = (( sumRUB % 5000) % 2000 ) / 1000,
            fiveHundredBill     = ((( sumRUB % 5000) %2000 ) % 1000 ) / 500,
            twoHundredBill      = (((( sumRUB % 5000 ) % 2000 ) % 1000 ) % 500 ) / 200,
            oneHundredBill      = ((((( sumRUB % 5000 ) % 2000 ) % 1000 ) % 500 ) % 200 ) / 100,
            fivetyBill          = (((((( sumRUB % 5000 ) % 2000 ) % 1000 ) % 500 ) % 200 ) % 100 ) / 50;

//        Разделение суммы на купюры разных наминалов
        System.out.println("Ваша сумма состоит из:\n" +
                "\t"+ fiveThousandthBill + " шт. 5-тыс. руб купюр,\n" +
                "\t"+ twoThousandthBill  + " шт. 2-тыс. руб купюр,\n" +
                "\t"+ oneThousandthBill  + " шт. 1-тыс. руб купюр,\n" +
                "\t"+ fiveHundredBill    + " шт. 500 руб купюр,\n" +
                "\t"+ twoHundredBill     + " шт. 200 руб купюр,\n" +
                "\t"+ oneHundredBill     + " шт. 100 руб купюр,\n" +
                "\t"+ fivetyBill		 + " шт. 50 руб купюр.");
    }
}
