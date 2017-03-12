import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FirstForm {
    private JPanel rootPanel;
    private JTextField secondName;
    private JTextField name;
    private JTextField patronymic;
    private JButton clickMeButton;


    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTextField getName() {
        return name;
    }

    public JTextField getSecondName() {
        return secondName;
    }

    public JTextField getPatronymic() {
        return patronymic;
    }

    public JButton getClickMeButton() {
        return clickMeButton;
    }

    public void setPerson(Person person) {
        name.setText(person.name);
        secondName.setText(person.secondName);
        patronymic.setText(person.patronymic);
    }

    public Person getPerson() {
        Person person = new Person();
        person.name = name.getText();
        person.secondName = secondName.getText();
        person.patronymic = patronymic.getText();
        return person;
    }
}
