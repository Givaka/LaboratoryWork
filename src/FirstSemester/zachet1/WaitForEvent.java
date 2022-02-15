package FirstSemester.zachet1;

import java.time.Month;
import java.util.Scanner;

public class WaitForEvent {
    public static void main(String[] args) {
//        Подключение внешнего класса
        Scanner in = new Scanner(System.in);

//        Обьявление переменных
        final int   MOY = 12,   // Количество месяцев в году
                    DOY = 365;  // Количество дней в году
        int startMonth,         // Номер месяца покупки билета, вводится пользователем
            startYear,          // Год покупки билета, вводится пользователем
            numberOfMonths,     // Количество месяцев до события (период ожидания), вводится пользователем
            monthsCount = 0,    // Счетчик месяцев
            i = 2021,           // Текущий год
            j = 1;              // Текущий месяц

//        Получение данных от пользоавтеля
        System.out.print("Номер месяца покупки билета: ");
        startMonth = in.nextInt();
        System.out.print("Год покупки билета: ");
        startYear = in.nextInt();
        System.out.print("Количество месяцев до события: ");
        numberOfMonths = in.nextInt();

//      Подсчет оставшихся месяцев до события
        while (monthsCount < numberOfMonths){
            for (j = 1; j <= MOY; j++){
                if (i == startYear && j <= startMonth) continue;    // Смещение до начала отсчета месяцев
                if ((monthsCount) == numberOfMonths) break;         // Выход по достяжение нужного месяца
//                Вывод оставшигося времни до концерта
                System.out.println("Текущий месяц: "+ Month.of(j) +", "+ i+". До концерта осталось "+ (numberOfMonths-++monthsCount) +" месяцев");
            }
            if (!((monthsCount) == numberOfMonths)){ // Переход в новый год
                i++;
            }
        }

//        Вывод результата
        System.out.println(" Концерт состоится в "+ Month.of(j-1) +" месяце "+ i +" года");
    }
}
