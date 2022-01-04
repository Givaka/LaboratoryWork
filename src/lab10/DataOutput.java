package lab10;

public class DataOutput {
    public static void main(String[] args) {
        final int ROW_PRINT = 3; // Количество выводимых строк

        for (int i = 0; i < ROW_PRINT; i++){ // Вертикальный смещение
//            Смещение каретки до нужного места
            for (int s = 0; s <= i; s++)
                System.out.print("  ");

//            Вывод фигуры
            for (int j = 1, k = (2-ROW_PRINT) ; j < ((ROW_PRINT * 2) - i); j++, k++){
                if (j > (ROW_PRINT - i)) {              // Проверка на прохождение центра
                    if ((j - i - k) > 0)                // Проверка выводимого символа на 0
                        System.out.print(j - i -k++);   // Вывод обрытного отсчета
                }
                else
                    System.out.print(j);    // Вывод отсчета
                System.out.print(" ");      // Пробел между символами
            }
            System.out.println();           // Переход на новую строку
        }
    }
}
