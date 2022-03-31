package SecondSemester.lab_3;

import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        // Подключенмие внешнего класса
        Scanner in = new Scanner(System.in);

        // Получение от пользователя данных
        System.out.print("Введите два целочиленных числа: ");
        int x = in.nextInt(),
            y = in.nextInt();

        // Вывод результата
        System.out.println("НОД "+ x +" и "+ y + " = " + nodN1N2(x,y));
    }

    public static int nodN1N2(int n1, int n2){
        int nod = 1,    // Выходная переменная
            k = 1;      // Пргомежуточная переменная

        // Нахождение НОДа
        while (n1>=k && n2>=k){
            k++;
            if (n1%k == 0 && n2%k == 0){
                nod = k;
            }
        }

        return nod;
    }
}
