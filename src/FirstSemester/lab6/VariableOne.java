package FirstSemester.lab6;

import java.util.Scanner;

public class VariableOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double    PricePKM = 8,               //Цена за километр
                        NumDecimal = 2;             //Значение чисел после запятой
        double  mileageBegin,                       //Пробег до поездки
                mileageAfter,                       //Пробег после
                drove,                              //Сколько проехали
                fare,                               //Стоймость проезда
                scale = Math.pow(10, NumDecimal);   //Основание округлегния
//        Получиение данных пользователя
        System.out.print("Введите начальное показия спидометра: ");
        mileageBegin = in.nextDouble();
        System.out.print("Введите конечные показия спидометра: ");
        mileageAfter = in.nextDouble();
//        Вычисления

        drove   = Math.ceil((mileageAfter - mileageBegin) * scale) / scale; // Расчет сколько проехали
        fare    = drove*PricePKM; // Расчет стоймости поездки
//        Вывод полученных данных
        System.out.println("Вы проехали "+ drove + " км. Из расчета " + PricePKM +
                " ₽ за км, стоймость проезда = " + (int)fare + " руб. " +
                (int)Math.ceil((fare%(int)fare)*100) + " коп.");
    }
}
