package FirstSemester.lab10;

public class TestBreak {
    public static void main(String[] args) {
        int sum, number;
        boolean triger = true;  // Сигнальная метка

        sum = number = 0;

        while (triger) {
            sum += number++;
            if (sum >= 100 || number >= 20) triger = false; // Замена break
        }

        System.out.println("Число равно " + number);
        System.out.println("Сумма равна " + sum);
    }
}
