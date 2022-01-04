package lab4;
import java.util.Scanner;
public class MethodsScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Подключение класса Scanner
//        Заголовок тестирования
        System.out.println("Даны числа:\n127; 14567L; 2147483647; -32768; 234,5F; 123,4\nВведите их, учитывая требуемый тип вводимого данного:");

//        Ответы на тест
        System.out.print("1. Введите наибольшее целое требуемое число типа Int: ");
        int a = in.nextInt();

        System.out.print("2. Введите наименьшее число типа Short: ");
        short b = in.nextShort();

        System.out.print("3. Введите наибольшее число типа Byte: ");
        byte c = in.nextByte();

        System.out.print("4. Введите число типа Long: ");
        long d = in.nextLong();

        System.out.print("5. Введите число типа Float: ");
        float e = in.nextFloat();

        System.out.print("6. Введите оставшееся действительное число, его тип будет Double: ");
        double h = in.nextDouble();
        in.nextLine();

        System.out.print("\n7. Введите строку \"Я изучаю Java\": ");
        String l = in.nextLine();

        System.out.print("8. Введите \"Я люблю Java\": ");
        String g = in.nextLine();

//        Вывод результата тестирования
        System.out.println("Результат:" +
                "\nint a = " + a + "\tshort b = " + b +
                "\nbyte c = " + c + "\tlong d = " + d +
                "\nfloat e = " + e + "\tdouble h = " + h +
                "\nString f = " + l +
                "\nString g = " + g );
    }
}
