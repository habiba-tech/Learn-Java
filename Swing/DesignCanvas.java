import javax.swing.*;
import java.awt.*;

public class DesignCanvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Design Canvas-Manual Positioning");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel canvas = new JPanel();
        canvas.setLayout(null);

        JLabel title = new JLabel("My Portfolio Title");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setBounds(40, 30, 200, 30);
        canvas.add(title);

        JLabel imgBox = new JLabel("Image here");
        imgBox.setHorizontalAlignment(SwingConstants.CENTER);
        imgBox.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        imgBox.setBounds(300, 30, 200, 150);
        canvas.add(imgBox);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(40, 90, 50, 25);
        canvas.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(100, 90, 150, 25);
        canvas.add(nameField);

        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(100, 130, 100, 30);
        canvas.add(saveBtn);

        JLabel designBox = new JLabel("Drag me");
        designBox.setOpaque(true);
        designBox.setBackground(Color.LIGHT_GRAY);
        designBox.setHorizontalAlignment(SwingConstants.CENTER);
        designBox.setBounds(250, 220, 100, 30);
        canvas.add(designBox);

        frame.add(canvas);
        frame.setVisible(true);


    }

    }

