import javax.swing.*;
import java.awt.*;

public class TextImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text + Image Example");

        //Load image
        Icon icon = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Swing\\src\\images\\logo.png");

        // Text + IMAGE IN ONE LABEL
        JLabel label = new JLabel("Java", icon, JLabel.CENTER); // right = icon on right side

        //Optional Styling
        label.setHorizontalTextPosition(JLabel.LEFT); //TEXT left of Image
        label.setVerticalTextPosition(JLabel.CENTER); // Vertical alignment

        frame.add(label);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
