import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelDemo4_Border {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(new LineBorder(Color.red,5));
        frame.add(panel);
        frame.setVisible(true);

    }
}

