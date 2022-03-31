package SecondSemester.lab_1;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MyPicture extends JFrame {

    public MyPicture (String title){
        super(title);

        // Методы задающие параметры окна
        setLayout(null);                // Отключение менеджера расположения компонентов в окне
        setSize(600, 600);  // Указываем размеры окна, используя метод setSize
        setVisible(true);               // Окно выводится на экран
        setResizable(false);            // Запрет на изменение размера окна
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // метод завершения программы после закрытия окна
    }

    public static void main(String[] args) {
        new MyPicture("Буб");
    }

    public void paint (Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(0, 0, getWidth(), getHeight());
        enterNum(g);
    }

    public void pictureStatic (Graphics g){
        g.setColor(Color.red);
        for (int i = 0; !((getWidth()/50 == i) || (getHeight()/50 == i)); i++){
            g.fillRect(50*i,50*i,50,50);    //  Вывод квадратика со смещением
        }

        g.setColor(Color.blue);
        for (int i = 0; !((getWidth()/50 == i) || (getHeight()/50 == i)); i++){
            g.fillRect(50*(getWidth()/50 - i - 1),50*i,50,50);    //  Вывод квадратика со смещением
        }
    }

    public void pictureDynamic (Graphics g) {
        g.setColor(Color.red);
        for (int i = 0; !((getWidth() / 50 == i) || (getHeight() / 50 == i)); i++) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            } finally {
                g.fillRect(50 * i, 50 * i, 50, 50);    //  Вывод квадратика со смещением
            }
        }

        g.setColor(Color.blue);
        for (int i = 0; !((getWidth()/50 == i) || (getHeight()/50 == i)); i++) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e){
                e.printStackTrace();
                break;
            } finally {
                g.fillRect(50*(getWidth()/50 - i - 1),50*i,50,50);    //  Вывод квадратика со смещением
            }
        }
    }

    public void enterNum(Graphics g){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите режим вывод (1 - статический; 2 - динамический.): ");
        int x = in.nextInt();
        switch (x) {
            case 1:
                pictureStatic(g);
                break;
            case 2:
                pictureDynamic(g);
                break;
            default:
                    System.exit(0);
        }
    }


}
