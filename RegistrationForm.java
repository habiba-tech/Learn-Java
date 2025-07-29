import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBackground(new Color(230, 240, 255));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        formPanel.add(new JLabel("Name:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Address:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Mobile No:"));
        formPanel.add(new JTextField());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(210, 230, 255));
        buttonPanel.add(new JButton("Submit"));
        buttonPanel.add(new JButton("Reset"));

        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
