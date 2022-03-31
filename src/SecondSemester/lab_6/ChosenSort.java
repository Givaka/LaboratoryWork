package SecondSemester.lab_6;
import java.util.Arrays;
public class ChosenSort {
    public static void main(String[] args) {
        // Обьявление массива на 30 символов
        int[] arr = new int[30];

        // Заполнение массива случ числами от 53 до 90
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (52 - 90) + 1 + 90);
        }

        // Вывод заполненного массива
        System.out.println("Вывод не сортированного массива: " + Arrays.toString(arr));

        // Вызов метода сортировки
        arr = chosenSort(arr);

        // Вывод отсортированного массива
        System.out.println("Вывод отсортированного массива: " + Arrays.toString(arr));
    }

    public static int[] chosenSort(int[] array) {
        long timeWorkStart = System.nanoTime(); // Фиксация текущего вермени в наносекундах
        for (int i = 0; i < array.length; i++) {  // Цикл для прохождения массива
            // Промежуточные переменные
            int maxID = i;      // Фиксация индекса наибольшего элемента

            for (int j = i + 1; j < array.length; j++) { // Цикл для поиска наибольшего значения из оставшихся
                if (array[j] > array[maxID]) {    // Сравнение на наибольшесть
                    // Установление индекса на наибольший найденные элемент
                    maxID = j;
                }
            }

            // Замена элементов в массиве
            swap(array, i, maxID);
        }
        // Вывод времени затраченного на выполнение сортировки
        System.out.println("\nМассив был отсортирован за: " + (System.nanoTime() - timeWorkStart) / 1000 + " наносекунд.\n");
        return array;       // Возвращение отсортированного массива
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a]; // Фиксация начала в промежуточной переменной
        array[a] = array[b];// Замена нач элемента на наибольший
        array[b] = tmp;     // Обмен наибольшего на зафиксированный элемент начала
    }
}