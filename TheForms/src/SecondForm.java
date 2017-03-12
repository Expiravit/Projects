import javax.swing.*;

public class SecondForm {
    private JPanel rootPanel;
    private JTextField fullNameTextField;
    private JButton clickMeButton;
    private JProgressBar progressBar;


    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTextField getFullNameTextField(){
        return fullNameTextField;
    }

    public JButton getClickMeButton() {
        return clickMeButton;
    }

    public void setPerson(Person person) {
        String unity = person.secondName + " " + person.name + " " + person.patronymic;
        fullNameTextField.setText(unity);
    }

    public Person getPerson() {
        Person person = new Person();
        String fullName = fullNameTextField.getText();
        String[] temp = fullName.split(" ");
        try {
            person.name = temp[1];
            person.secondName = temp[0];
            person.patronymic = temp[2];
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        return person;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }
}
