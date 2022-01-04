package lab9;

public class DegreeOfTwo {
    public static void main(String[] args) {
        int i = 0;  // Показатель степени

        // Вывод показателя степени и степени числа 2 по показателю
        while (i <= 6) { // Цикл работает пока показатель степени не станет больше 6
            System.out.println(i + "\t" + (int) Math.pow(2, i++));
        }
    }
}
