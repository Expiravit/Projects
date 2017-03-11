import javax.swing.*;
import java.awt.*;
/*Урок 2. Создаём простой интерфейс
- Создать форму с полями: “Фамилия”, “Имя”, “Отчество”, “Дата рождения” и “Город проживания”.*/
public class Loader {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); //новое окно

        Form form = new Form();
        frame.setContentPane(form.getRootPanel());

        frame.setSize(300, 200); //устанавливаем размер
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //центрируем
        frame.setTitle("Hello World"); //название заголовка
        frame.setVisible(true); //видимый
    }
}
