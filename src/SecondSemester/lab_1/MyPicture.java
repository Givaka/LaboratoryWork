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

    public void pictureStatic (Graphics g){

    }

    public void pictureDynamic (Graphics g){

    }

    public void enterNum(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        switch (x) {
            case 1:

                break;
            case 2:
                break;
        }
    }

    public static void main(String[] args) {

    }
}
