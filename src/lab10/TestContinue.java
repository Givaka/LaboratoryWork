package lab10;

public class TestContinue {
    public static void main(String[] args) {
        int sum, number;

        sum = number = 0;

        while (number < 20) {
            number++;
            if (!(number == 10 || number == 11)) sum += number; // Замена continue
        }
        System.out.println("Сумма равна " + sum);
    }
}
