import javax.swing.*;
import java.awt.*;

public class Loader {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); //новое окно

        frame.setLayout(new FlowLayout());
        JButton button = new JButton();
        button.setText("Click me!");
        frame.add(button);

        frame.setSize(800, 600); //устанавливаем размер
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //центрируем
        frame.setTitle("Hello World"); //название заголовка
        frame.setVisible(true); //видимый
    }
}
