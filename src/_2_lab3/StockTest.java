package _2_lab3;

import _2_lab3.Stock;

public class StockTest {
    public static void main(String[] args) {
        Stock stc1  = new Stock();

        stc1.symbol = "SBER";
        stc1.name = "ПАО Сбербанк";
        stc1.previousClosingPrice = 281.5;


        stc1.currentPrice = 282.87;

        System.out.println("Процент изменения стоймости акций "+stc1.symbol+" с именем "+stc1.name+ " равен - " +stc1.getChangePercent());
    }
}
