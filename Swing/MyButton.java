import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JButton button = new JButton("Clicked Me");
        frame.add(button);
        button.setBackground(Color.pink);
        button.setForeground(Color.magenta);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setFocusPainted(false);


        frame.setVisible(true);
    }
}
