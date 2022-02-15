package FirstSemester.lab12;

// импорт библиотек
import java.awt.*;
import javax.swing.*;

public class Eclipse extends JFrame {

    public Eclipse (String title) {
        super(title);

        // методы задающие параметры окна
        setLayout(null); // //отключение менеджера расположения компонентов в окне
        setSize(300,500); //указываем размеры окна, используя метод setSize
        setVisible(true); //  окно выводится на экран
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // метод завершения программы после закрытия окна
    }


    @Override //переопределение метода paint
    public void  paint (Graphics g) {
        // приведение контекста типа Graphics к типу Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // очищаем фон
        Rectangle r=getBounds();
        // устанавливаем белый фон
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, r.width, r.height);

        // выводим надпись и выводим квадрат красного цвет
        g.setColor(Color.red);
        g.drawString("Hello, world", 20, 20);
        g.fillRect(60,60, 120, 120);
    }
    public static void main(String[] args) {
        new Eclipse("hhhh");
    }
}