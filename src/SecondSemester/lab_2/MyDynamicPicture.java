package SecondSemester.lab_2;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class MyDynamicPicture extends JFrame {

    int sizePlace   = 25, // Размер клетки
        padding     = 2;  // Отступ

    int weight = 20,
        height = 18;


    public MyDynamicPicture(String title) {
        super(title);

        // Методы задающие параметры окна
        setLayout(null);                // Отключение менеджера расположения компонентов в окне
        setSize((weight + padding * 2) * sizePlace , (height + padding * 2) * sizePlace);   // Размеры окна
        setVisible(true);               // Окно выводится на экран
        setResizable(false);            // Запрет на изменение размера окна
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // метод завершения программы после закрытия окна
    }

    public static void main(String[] args) {
        new MyDynamicPicture("Динамическая абстракция");
    }

    public void paint(Graphics g) {
        int[][][] abstraction = new int[weight][height][];

        // 0 - Тип ФP                  T  C  X     Y       W              H         A
        abstraction[0][0]   = new int[]{1, 3, 0,    0, sizePlace * 1, sizePlace * 1, 1};
        abstraction[0][1]   = new int[]{1, 3, 1,    0, sizePlace * 1, sizePlace * 1, 1};
        abstraction[0][2]   = new int[]{1, 3, 2,    0, sizePlace * 2, sizePlace * 2, 1};
        abstraction[0][3]   = new int[]{1, 2, 6,    0, sizePlace * 4, sizePlace * 4, 1};
        abstraction[0][4]   = new int[]{1, 1, 6,    0, sizePlace * 4, sizePlace * 4, 2};
        abstraction[0][5]   = new int[]{1, 3, 10,   0, sizePlace * 4, sizePlace * 4, 0};
        abstraction[0][6]   = new int[]{1, 1, 12,   0, sizePlace * 2, sizePlace * 2, 0};
        abstraction[0][7]   = new int[]{1, 1, 14,   0, sizePlace * 2, sizePlace * 2, 3};
        abstraction[0][8]   = new int[]{1, 4, 14,   0, sizePlace * 2, sizePlace * 2, 1};
        abstraction[0][9]   = new int[]{0, 5, 16,   0, sizePlace * 2, sizePlace * 2};
        abstraction[0][10]  = new int[]{1, 2, 18,   0, sizePlace * 2, sizePlace * 1, 1};

        abstraction[1][0]   = new int[]{1, 3, 0,    1, sizePlace * 1, sizePlace * 1, 1};
        abstraction[1][1]   = new int[]{1, 2, 18,   1, sizePlace * 2, sizePlace * 1, 1};

        abstraction[2][0]   = new int[]{1, 3, 0,    2, sizePlace * 2, sizePlace * 2, 1};
        abstraction[2][1]   = new int[]{0, 4, 2,    2, sizePlace * 2, sizePlace * 2};
        abstraction[2][2]   = new int[]{1, 2, 4,    2, sizePlace * 1, sizePlace * 2, 1};
        abstraction[2][3]   = new int[]{1, 2, 5,    2, sizePlace * 1, sizePlace * 2, 1};
        abstraction[2][4]   = new int[]{0, 5, 14,   2, sizePlace * 2, sizePlace * 2};
        abstraction[2][5]   = new int[]{0, 4, 16,   2, sizePlace * 2, sizePlace * 2};
        abstraction[2][6]   = new int[]{1, 2, 18,   2, sizePlace * 2, sizePlace * 1, 1};

        abstraction[3][0]   = new int[]{1, 2, 18,   3, sizePlace * 2, sizePlace * 1, 1};

        abstraction[4][0]   = new int[]{1, 1, 0,    4, sizePlace * 2, sizePlace * 2, 2};
        abstraction[4][1]   = new int[]{1, 3, 0,    4, sizePlace * 2, sizePlace * 2, 0};
        abstraction[4][2]   = new int[]{0, 1, 2,    4, sizePlace * 2, sizePlace * 2};
        abstraction[4][3]   = new int[]{4, 3, 4,    4, sizePlace * 2, sizePlace * 2};
        abstraction[4][4]   = new int[]{5, 1, 6,    4, sizePlace * 2, sizePlace * 2};
        abstraction[4][5]   = new int[]{2, 3, 8,    4, sizePlace * 4, sizePlace * 4};
        abstraction[4][6]   = new int[]{1, 2, 12,   4, sizePlace * 2, sizePlace * 2, 0};
        abstraction[4][7]   = new int[]{1, 5, 14,   4, sizePlace * 2, sizePlace * 2, 2};
        abstraction[4][8]   = new int[]{1, 2, 15,   4, sizePlace * 1, sizePlace * 1, 1};
        abstraction[4][9]   = new int[]{1, 3, 14,   4, sizePlace * 4, sizePlace * 4, 1};
        abstraction[4][10]  = new int[]{1, 5, 18,   4, sizePlace * 2, sizePlace * 2, 2};

        abstraction[5][0]   = new int[]{1, 2, 15,   5, sizePlace * 1, sizePlace * 1, 0};
        abstraction[5][1]   = new int[]{1, 2, 17,   5, sizePlace * 1, sizePlace * 1, 3};

        abstraction[6][0]   = new int[]{1, 1, 0,    6, sizePlace * 2, sizePlace * 2, 3};
        abstraction[6][1]   = new int[]{0, 5, 4,    6, sizePlace * 2, sizePlace * 2};
        abstraction[6][2]   = new int[]{1, 3, 6,    6, sizePlace * 2, sizePlace * 2, 3};
        abstraction[6][3]   = new int[]{1, 5, 10,   6, sizePlace * 2, sizePlace * 2, 1};
        abstraction[6][4]   = new int[]{1, 5, 12,   6, sizePlace * 2, sizePlace * 2, 2};
        abstraction[6][5]   = new int[]{1, 5, 14,   6, sizePlace * 2, sizePlace * 2, 3};
        abstraction[6][6]   = new int[]{1, 2, 16,   6, sizePlace * 1, sizePlace * 1, 3};
        abstraction[6][7]   = new int[]{1, 2, 17,   6, sizePlace * 1, sizePlace * 1, 3};
        abstraction[6][8]   = new int[]{1, 4, 18,   6, sizePlace * 2, sizePlace * 2, 3};

        abstraction[7][0]   = new int[]{1, 2, 15,   7, sizePlace * 1, sizePlace * 1, 3};
        abstraction[7][1]   = new int[]{1, 2, 16,   7, sizePlace * 1, sizePlace * 1, 3};
        abstraction[7][2]   = new int[]{1, 2, 17,   7, sizePlace * 1, sizePlace * 1, 3};

        abstraction[8][0]   = new int[]{1, 3, 0,    8, sizePlace * 2, sizePlace * 1, 2};
        abstraction[8][1]   = new int[]{1, 2, 0,    8, sizePlace * 2, sizePlace * 1, 0};
        abstraction[8][2]   = new int[]{1, 2, 2,    8, sizePlace * 1, sizePlace * 1, 2};
        abstraction[8][3]   = new int[]{2, 5, 3,    8, sizePlace * 2, sizePlace * 2};
        abstraction[8][4]   = new int[]{1, 3, 10,   8, sizePlace * 2, sizePlace * 2, 2};
        abstraction[8][5]   = new int[]{3, 2, 12,   8, sizePlace * 6, sizePlace * 6};
        abstraction[8][6]   = new int[]{2, 3, 18,   8, sizePlace * 2, sizePlace * 2};

        abstraction[9][0]   = new int[]{1, 3, 0,    9, sizePlace * 2, sizePlace * 1, 2};
        abstraction[9][1]   = new int[]{1, 2, 0,    9, sizePlace * 2, sizePlace * 1, 0};
        abstraction[9][2]   = new int[]{1, 2, 2,    9, sizePlace * 1, sizePlace * 1, 3};

        abstraction[10][0]  = new int[]{1, 3, 0,   10, sizePlace * 2, sizePlace * 1, 2};
        abstraction[10][1]  = new int[]{1, 2, 0,   10, sizePlace * 2, sizePlace * 1, 0};
        abstraction[10][2]  = new int[]{1, 2, 2,   10, sizePlace * 1, sizePlace * 1, 2};
        abstraction[10][3]  = new int[]{2, 2, 3,   10, sizePlace * 2, sizePlace * 2};
        abstraction[10][4]  = new int[]{2, 2, 6,   10, sizePlace * 2, sizePlace * 2};
        abstraction[10][5]  = new int[]{0, 5, 18,  10, sizePlace * 1, sizePlace * 1};

        abstraction[11][0]  = new int[]{1, 3, 0,   11, sizePlace * 2, sizePlace * 1, 2};
        abstraction[11][1]  = new int[]{1, 2, 0,   11, sizePlace * 2, sizePlace * 1, 0};
        abstraction[11][2]  = new int[]{1, 2, 2,   11, sizePlace * 1, sizePlace * 1, 3};
        abstraction[11][3]  = new int[]{0, 5, 19,  11, sizePlace * 1, sizePlace * 1};

        abstraction[12][0]  = new int[]{1, 1, 1,   12, sizePlace * 1, sizePlace * 1, 1};
        abstraction[12][1]  = new int[]{0, 5, 2,   12, sizePlace * 2, sizePlace * 2};
        abstraction[12][2]  = new int[]{1, 1, 4,   12, sizePlace * 1, sizePlace * 1, 2};
        abstraction[12][3]  = new int[]{1, 2, 4,   12, sizePlace * 2, sizePlace * 2, 1};
        abstraction[12][4]  = new int[]{1, 4, 4,   12, sizePlace * 1, sizePlace * 1, 0};
        abstraction[12][5]  = new int[]{1, 4, 5,   12, sizePlace * 1, sizePlace * 1, 3};
        abstraction[12][6]  = new int[]{0, 5, 8,   12, sizePlace * 4, sizePlace * 2};
        abstraction[12][7]  = new int[]{1, 2, 18,  12, sizePlace * 2, sizePlace * 2, 3};
        abstraction[12][8]  = new int[]{1, 1, 18,  12, sizePlace * 2, sizePlace * 2, 1};

        abstraction[13][0]  = new int[]{2, 5, 0,   13, sizePlace * 2, sizePlace * 2};
        abstraction[13][1]  = new int[]{1, 1, 1,   13, sizePlace * 1, sizePlace * 1, 0};
        abstraction[13][2]  = new int[]{1, 1, 4,   13, sizePlace * 1, sizePlace * 1, 3};

        abstraction[14][0]  = new int[]{1, 3, 0,   14, sizePlace * 4, sizePlace * 4, 1};
        abstraction[14][1]  = new int[]{1, 3, 4,   14, sizePlace * 4, sizePlace * 4, 2};
        abstraction[14][2]  = new int[]{1, 2, 6,   14, sizePlace * 2, sizePlace * 1, 1};
        abstraction[14][3]  = new int[]{1, 3, 8,   14, sizePlace * 4, sizePlace * 4, 3};
        abstraction[14][4]  = new int[]{1, 2, 10,  14, sizePlace * 2, sizePlace * 2, 1};
        abstraction[14][5]  = new int[]{1, 2, 12,  14, sizePlace * 4, sizePlace * 4, 2};
        abstraction[14][6]  = new int[]{1, 1, 13,  14, sizePlace * 1, sizePlace * 1, 2};
        abstraction[14][7]  = new int[]{1, 1, 14,  14, sizePlace * 1, sizePlace * 1, 2};
        abstraction[14][8]  = new int[]{1, 1, 15,  14, sizePlace * 1, sizePlace * 1, 2};
        abstraction[14][9]  = new int[]{1, 3, 16,  14, sizePlace * 2, sizePlace * 1, 0};
        abstraction[14][10] = new int[]{1, 1, 18,  14, sizePlace * 2, sizePlace * 2, 0};

        abstraction[15][0]  = new int[]{1, 2, 6,   15, sizePlace * 2, sizePlace * 1, 1};
        abstraction[15][1]  = new int[]{1, 1, 14,  15, sizePlace * 1, sizePlace * 1, 2};
        abstraction[15][2]  = new int[]{1, 1, 15,  15, sizePlace * 1, sizePlace * 1, 2};
        abstraction[15][3]  = new int[]{1, 3, 16,  15, sizePlace * 2, sizePlace * 1, 0};

        abstraction[16][0]  = new int[]{1, 1, 8,   16, sizePlace * 2, sizePlace * 2, 1};
        abstraction[16][1]  = new int[]{1, 1, 10,  16, sizePlace * 2, sizePlace * 2, 2};
        abstraction[16][2]  = new int[]{1, 2, 10,  16, sizePlace * 2, sizePlace * 2, 0};
        abstraction[16][3]  = new int[]{1, 1, 15,  16, sizePlace * 1, sizePlace * 1, 2};
        abstraction[16][4]  = new int[]{0, 1, 16,  16, sizePlace * 2, sizePlace * 2, 2};
        abstraction[16][5]  = new int[]{5, 2, 18,  16, sizePlace * 2, sizePlace * 2, 2};
        abstraction[16][6]  = new int[]{1, 2, 18,  16, sizePlace * 2, sizePlace * 2, 2};

        g.setColor(new Color(0x1e201f));
        g.fillRect(0, 0, getWidth(), getHeight());


        Scanner in = new Scanner(System.in);
        System.out.print("Введите режим вывода (1 - Линейный; 2 - Случайный): ");
        int mode = in.nextInt();

        int i,j;
        switch (mode){

            case 2: // Случайный вывод
                int[]   iArr = new int[weight],
                        jArr = new int[height];
                int zi=0,
                    zj=0;
                do {
                    boolean flagI = true,
                            flagJ = true;

                    i = (int)(Math.random() * weight);
                    j = (int)(Math.random() * height);

                    for(int x : iArr)
                        if(x == i){
                            flagI = false;
                            break;
                        }
                    if (flagI) {
                        iArr[zi] = i;
                        zi++;
                    }


                    for(int x : jArr)
                        if(x == j){
                            flagJ = false;
                            break;
                        }
                    if (flagJ) {
                        jArr[zj] = j;
                        zj++;
                    }

                    System.out.println(i + " " + j);
                    paintObject(g, abstraction[i][j], mode);
                } while (iArr.length == weight && jArr.length == height);
                break;
            case 1: // Линейный вывод по-строчно
            default:
                for (i = 0; i < weight; i++){
                    for (j = 0; j < height; j++) {
                        paintObject(g, abstraction[i][j], mode);
                    }
                }
        }



    }

    public void paintObject(Graphics g, int[] obj, int mode) {
        if (obj != null) {
            // Объевление палитры
            Color[] palette = new Color[6];
            // 0 - 4 Цвета объектов
            palette[0] = new Color(0x1e201f);
            palette[1] = Color.yellow;
            palette[2] = Color.magenta;
            palette[3] = Color.red;
            palette[4] = Color.cyan;
            palette[5] = Color.green;

            g.setColor(palette[obj[1]]); // Установка цвета

            Graphics2D g2 = (Graphics2D) g;
            BasicStroke pen1 = new BasicStroke(2);

            g2.setStroke(pen1); // Установка толшины пера

            final int PADDING_X = 8 + (padding * sizePlace),
                        PADDING_Y = 31 + (padding * sizePlace);

            switch (obj[0]) {
                case 0:     // Квадрат
                    g.fillRect(obj[2] * sizePlace + PADDING_X, obj[3] * sizePlace + PADDING_Y, obj[4], obj[5]);
                    break;
                case 1:     // Треугольник
                    int[] xT = new int[3], yT = new int[3];

                    switch (obj[6]) {
                        case 0:
                            xT = new int[]{obj[2] * sizePlace + PADDING_X, obj[2] * sizePlace + obj[4] + PADDING_X, obj[2] * sizePlace + obj[4] + PADDING_X};
                            yT = new int[]{obj[3] * sizePlace + PADDING_Y, obj[3] * sizePlace + PADDING_Y, obj[3] * sizePlace + obj[5] + PADDING_Y};
                            break;
                        case 1:
                            xT = new int[]{obj[2] * sizePlace + obj[4] + PADDING_X, obj[2] * sizePlace + obj[4] + PADDING_X, obj[2] * sizePlace + PADDING_X};
                            yT = new int[]{obj[3] * sizePlace + PADDING_Y, obj[3] * sizePlace + obj[5] + PADDING_Y, obj[3] * sizePlace + obj[5] + PADDING_Y};
                            break;
                        case 2:
                            xT = new int[]{obj[2] * sizePlace + PADDING_X, obj[2] * sizePlace + obj[4] + PADDING_X, obj[2] * sizePlace + PADDING_X};
                            yT = new int[]{obj[3] * sizePlace + PADDING_Y, obj[3] * sizePlace + obj[5] + PADDING_Y, obj[3] * sizePlace + obj[5] + PADDING_Y};
                            break;
                        case 3:
                            xT = new int[]{obj[2] * sizePlace + PADDING_X, obj[2] * sizePlace + obj[4] + PADDING_X, obj[2] * sizePlace + PADDING_X};
                            yT = new int[]{obj[3] * sizePlace + PADDING_Y, obj[3] * sizePlace + PADDING_Y, obj[3] * sizePlace + obj[5] + PADDING_Y};
                            break;
                        default:
                            System.out.println("Указан не правильный угол поворота");
                            System.exit(0);

                    }
                    g.fillPolygon(xT, yT, 3);
                    break;
                case 2:     // Ромб
                    int[]   xR = {obj[2] * sizePlace + obj[4] / 2 + PADDING_X, obj[2] * sizePlace + obj[4] + PADDING_X, obj[2] * sizePlace + obj[4] / 2 + PADDING_X, obj[2] * sizePlace + PADDING_X},
                            yR = {obj[3] * sizePlace + PADDING_Y, obj[3] * sizePlace + obj[5] / 2 + PADDING_Y, obj[3] * sizePlace + obj[5] + PADDING_Y, obj[3] * sizePlace + obj[5] / 2 + PADDING_Y};
                    g.fillPolygon(xR, yR, 4);
                    break;
                case 3:     // Круг
                    g.fillOval(obj[2] * sizePlace + PADDING_X, obj[3] * sizePlace + PADDING_Y, obj[4], obj[5]);
                    break;
                case 4:     // Окружность
                    g.drawOval(obj[2] * sizePlace + PADDING_X, obj[3] * sizePlace + PADDING_Y, obj[4], obj[5]);
                    break;
                case 5:     // Рамка
                    g.drawRect(obj[2] * sizePlace + PADDING_X, obj[3] * sizePlace + PADDING_Y, obj[4], obj[5]);
                    break;

                default:
                    System.out.println("Тип фигуры не найден.");
                    System.exit(0);
            }

//            if (mode > 0 && mode < 2){
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            }
        }
    }
}
