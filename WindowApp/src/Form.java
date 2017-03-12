import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form {
    private JButton clickMeButton;
    private JPanel rootPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField city;

    public Form() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int random = (int) Math.round(10 * Math.random());
                city.setText(Integer.toString(random));
            }
        });
        city.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickMeButton.setBackground(Color.CYAN);
            }
        });
        city.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int length = city.getText().length();
                    textField4.setText(Integer.toString(length));
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
