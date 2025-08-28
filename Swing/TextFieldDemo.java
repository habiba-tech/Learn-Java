import javax.swing.*;
import java.awt.*;
public class TextFieldDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20); // INPUT Field
        frame.add(textField);

        frame.setVisible(true);
    }
}
