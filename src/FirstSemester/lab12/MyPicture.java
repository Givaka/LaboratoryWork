package FirstSemester.lab12;

import java.awt.*;
import javax.swing.*;

public class MyPicture extends JFrame{

    public MyPicture (String title) {
        super(title);

        // Методы задающие параметры окна
        setLayout(null);                // Отключение менеджера расположения компонентов в окне
        setSize(700,650);   // Указываем размеры окна, используя метод setSize
        setVisible(true);               // Окно выводится на экран
        setResizable(false);            // Запрет на изменение размера окна
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // метод завершения программы после закрытия окна
    }

    @Override // Переопределение метода paint
    public void  paint (Graphics g) {
        // Приведение контекста типа Graphics к типу Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        BasicStroke pen1 = new BasicStroke(2);

//        Палитра
        Color bg = new Color(0x1e201f);
        Color c1 = new Color(0xf1bd4d);
        Color c2 = new Color(0x7da7bf);
        Color c3 = new Color(0xd56f27);
        Color c4 = new Color(0xf1f3f2);
        Color c5 = new Color(0xe2ac26);

        // Очищаем фон
        Rectangle r = getBounds();
        // Устанавливаем фон
        g2.setBackground(bg);
        g2.clearRect(0, 0, r.width, r.height);

//        Устанавливаем размер кисти
        g2.setStroke(pen1);

//        Желтые элементы

//        Прямоугольники
        g.fillRect(500,500,50,50);

//        Многоугольники
        g.setColor(c1);
        int Yx1[] = {250, 250, 350}, Yy1[] = {100, 200, 200};
        g.fillPolygon(Yx1, Yy1, 3);

        int Yx2[] = {600, 550, 600}, Yy2[] = {400, 450, 500};
        g.fillPolygon(Yx2, Yy2, 3);

        int Yx3[] = {150, 125, 150}, Yy3[] = {400, 425, 450};
        g.fillPolygon(Yx3, Yy3, 3);

        int Yx4[] = {200, 225, 200}, Yy4[] = {400, 425, 450};
        g.fillPolygon(Yx4, Yy4, 3);

        int Yx5[] = {300, 350, 400}, Yy5[] = {550, 500, 550};
        g.fillPolygon(Yx5, Yy5, 3);


//        Синие элементы
        g.setColor(c2);

//        Окружнотси
        g.fillOval(400,300,150,150);

//        Многоугольники
        int Bx2[] = {225, 200, 225}, By2[] = {150, 200, 200};
        for (int i = 0; i < 2; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Bx2, By2, 3);
            for (int j = 0; j < 3; j++)         // Смещение
                Bx2[j] += 25;
        }
        int Bx3[] = {350, 300, 350}, By3[] = {100, 150, 200};
        g.fillPolygon(Bx3, By3, 3);

        int Bx4[] = {600, 550, 600}, By4[] = {100, 125, 125};
        for (int i = 0; i < 4; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Bx4, By4, 3);
            for (int j = 0; j < 3; j++)         // Смещение
                By4[j] += 25;
        }

        int Bx5[] = {400, 450, 450}, By5[] = {200, 200, 250};
        g.fillPolygon(Bx5, By5, 3);

        int Bx6[] = {500, 475, 500}, By6[] = {200, 225, 250};
        g.fillPolygon(Bx6, By6, 3);

        int Bx7[] = {100, 150, 150}, By7[] = {300, 300, 325};
        for (int i = 0; i < 4; i++) {
            g.fillPolygon(Bx7, By7, 3);
            for (int j = 0; j < 3; j++)
                By7[j] += 25;
        }

        int Bx8[] = {150, 175, 150}, By8[] = {300, 325, 350};
        for (int i = 0; i < 2; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Bx8, By8, 3);
            for (int j = 0 ; j<3 ; j++)         // Смещение
                By8[j] += 50;
        }

        int Bx9[] = {200, 175, 200, 225}, By9[] = {350, 375, 400, 375};
        for (int i = 0; i < 2; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Bx9, By9, 4);
            for (int j = 0 ; j<4 ; j++)         // Смещение
                Bx9[j] += 75;
        }

        int Bx10[] = {300, 250, 300}, By10[] = {450, 475, 475};
        for (int i = 0; i < 2; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Bx10, By10, 3);
            for (int j = 0 ; j<3 ; j++)         // Смещение
                By10[j] += 25;
        }

        int Bx11[] = {350, 400, 500, 400}, By11[] = {500, 550, 550, 450};
        g.fillPolygon(Bx11, By11, 4);

        int Bx12[] = {600, 550, 600}, By12[] = {500, 550, 550};
        g.fillPolygon(Bx12, By12, 3);

        int Bx13[] = {550, 600, 550}, By13[] = {500, 500, 550};
        g.drawPolygon(Bx13, By13, 3);

//        Красный
        g.setColor(c3);

//        Окружнотси
        g.drawOval(200, 200, 50, 50);

//        Многоугольники
        int Rx1[] = {200, 100, 200}, Ry1[] = {100, 200, 200};
        g.fillPolygon(Rx1, Ry1, 3);

        int Rx2[] = {125, 100, 125}, Ry2[] = {100, 125, 125};
        for (int i = 0; i < 3; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Rx2, Ry2, 3);
            for (int j = 0; j < 3; j++)         // Смещение
                switch (i) {                    // Смещение в разном направление
                    case 0:
                        Rx2[j] += 25;
                        break;
                    case 1:
                        Rx2[j] -= 25;
                        Ry2[j] += 25;
                }
        }
        int Rx3[] = {350, 450, 450}, Ry3[] = {100, 200, 100};
        g.fillPolygon(Rx3, Ry3, 3);

        int Rx4[] = {100, 150, 150}, Ry4[] = {200, 250, 200};
        g.fillPolygon(Rx4, Ry4, 3);

        int Rx5[] = {250, 300, 250}, Ry5[] = {250, 250, 300};
        g.fillPolygon(Rx5, Ry5, 3);

        int Rx6[] = {300, 350, 400, 350}, Ry6[] = {250, 300, 250, 200};
        g.fillPolygon(Rx6, Ry6, 4);

        int Rx7[] = {450, 550, 550}, Ry7[] = {300, 300, 200};
        g.fillPolygon(Rx7, Ry7, 3);

        int Rx8[] = {100, 100, 150}, Ry8[] = {300, 325, 325};
        for (int i = 0; i < 4; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Rx8, Ry8, 3);
            for (int j = 0; j < 3; j++)         // Смещение
                Ry8[j] += 25;
        }

        int Rx9[] = {350, 400, 350}, Ry9[] = {300, 350, 400};
        g.fillPolygon(Rx9, Ry9, 3);

        int Rx10[] = {550, 575, 600, 575}, Ry10[] = {325, 350, 325, 300};
        g.fillPolygon(Rx10, Ry10, 4);

        int Rx11[] = {550, 600, 550}, Ry11[] = {400, 400, 450};
        g.fillPolygon(Rx11, Ry11, 3);

        int Rx12[] = {250, 200, 250}, Ry12[] = {400, 450, 450};
        g.fillPolygon(Rx12, Ry12, 3);

        int Rx13[] = {100, 200, 300}, Ry13[] = {550, 450, 550};
        g.fillPolygon(Rx13, Ry13, 3);

        int Rx14[] = {300, 400, 300}, Ry14[] = {450, 450, 550};
        g.fillPolygon(Rx14, Ry14, 3);

        int Rx15[] = {500, 550, 550}, Ry15[] = {450, 450, 475};
        for (int i = 0; i < 2; i++) {           // Отрисовка подобных элементов
            g.fillPolygon(Rx15, Ry15, 3);
            for (int j = 0; j < 3; j++)         // Смещение
                Ry15[j] += 25;
        }

//        Белый
        g.setColor(c4);
        g.fillRect(150, 150, 50, 50);
        g.fillRect(450, 100, 50, 50);
        g.fillRect(500, 150, 50, 50);

        int Wx1[] = {550, 600, 550}, Wy1[] = {250, 250, 300};
        g.fillPolygon(Wx1, Wy1, 3);

        int Wx2[] = {200, 225, 250}, Wy2[] = {400, 425, 400};
        g.fillPolygon(Wx2, Wy2, 3);

//        Зеленый
        g.setColor(c5);
        g.fillRect(500, 100, 50, 50);
        g.fillRect(450, 150, 50, 50);
        for (int i = 0, j = 0; i < 3; i++) {        // Отрисовка подобных элементов
            g.fillRect(150 + (i * 50), 200 + (50 * j), 50, 50);
            j = (i % 2 == 0) ? 1 : 0;               // Смещение
        }
        g.fillRect(550,350,25,25);
        g.fillRect(575,375,25,25);
        g.fillRect(150,400,50,50);
        g.fillRect(300, 400,100,50);

        int Gx1[] = {100, 150, 100}, Gy1[] = {200, 250, 300};
        g.fillPolygon(Gx1, Gy1, 3);

        int Gx2[] = {450, 500, 450}, Gy2[] = {200, 250, 300};
        g.fillPolygon(Gx2, Gy2, 3);

        int Gx3[] = {550, 600, 550}, Gy3[] = {200, 250, 250};
        g.fillPolygon(Gx3, Gy3, 3);

        int Gx4[] = {350, 400, 450}, Gy4[] = {300, 250, 300};
        g.fillPolygon(Gx4, Gy4, 3);

        int Gx5[] = {200, 175, 200, 225}, Gy5[] = {300, 325, 350, 325};
        g.fillPolygon(Gx5, Gy5, 4);

        int Gx6[] = {100, 125, 150, 125}, Gy6[] = {450, 475, 450, 425};
        g.fillPolygon(Gx6, Gy6, 4);

        int Gx7[] = {425, 425, 450}, Gy7[] = {450, 475, 475};
        for (int i = 0; i < 6; i++) {               // Отрисовка подобных элементов
            g.fillPolygon(Gx7, Gy7, 3);
            if (i == 2 || i == 4)                   // Излом порядка
                for (int j = 0; j < 3; j++) {
                    Gx7[j] -= 100 / i;
                    Gy7[j] -= (i == 4) ? 50 : 75;
                }

            for (int j = 0; j < 3; j++) {           // Смещение
                Gx7[j] += 25;
                Gy7[j] += 25;
            }
        }


//        Желтый Вверхний слой
        g.setColor(c1);
        int XUx1[] = {400, 450, 500}, YUy1[] = {100, 150, 100};
        g.fillPolygon(XUx1, YUy1, 3);

//        Синий Вверхний слой
        g.setColor(c2);
        int BUx1[] = {525, 525, 550}, BUy1[] = {225, 250, 225};
        for (int i = 0; i < 6; i++) {               // Отрисовка подобных элементов
            g.fillPolygon(BUx1, BUy1, 3);
            if (i == 2 || i == 4)                   // Излом порядка
                for (int j = 0; j < 3; j++) {
                    BUx1[j] += (i == 4) ? 50 : 75;
                    BUy1[j] -= 100 / i;
                }

            for (int j = 0; j < 3; j++) {           // Смещение
                BUx1[j] -= 25;
                BUy1[j] += 25;
            }
        }

    }

    public static void main (String[]args){
        new MyPicture("Геометрическая форма");
    }
}