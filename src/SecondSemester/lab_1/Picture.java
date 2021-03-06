package SecondSemester.lab_1;

import java.awt.*;
import javax.swing.*;

public class Picture extends JFrame {

    public Picture(String s) {
        super(s);

        // Методы задающие параметры окна
        setLayout(null);                // Отключение менеджера расположения компонентов в окне
        setSize(600, 600);  // Указываем размеры окна, используя метод setSize
        setVisible(true);               // Окно выводится на экран
        setResizable(false);            // Запрет на изменение размера окна
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // метод завершения программы после закрытия окна
    }

    @Override
    public void paint (Graphics g){
//        Приведение контекста типа Graphics к типу Graphics2D
        Graphics2D g2 = (Graphics2D) g;

//        Палитра
        Color bg        = Color.yellow; //  Цвет задника
        Color square    = Color.blue;   //  Цвет квадратиков

//        Очищаем фон
        Rectangle r = getBounds();

//        Устанавливаем фон
        g2.setBackground(bg);
        g2.clearRect(0, 0, r.width, r.height);

//        Вывод квадратиков по диагонали
        g.setColor(square); //  Установка цвета кисти
        int i = 0;          //  Инициализация с присвоением итератора
        do{                 //  Цикл который выводит квадраты пока не достигнит либог левой, либо нижней стороны окна
            g.fillRect(50*i,50*i,50,50);    //  Вывод квадратика со смещением
            i++;
        } while (!((getWidth()/50 == i) || (getHeight()/50 == i)));
    }

    public static void main (String[]args){
        new Picture("Квадратики");
    }

}
