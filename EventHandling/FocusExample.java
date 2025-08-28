package EventHandling;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FocusListener");
        JTextField textField = new JTextField();

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("Focus Lost");
            }
        });
        frame.add(textField);
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
