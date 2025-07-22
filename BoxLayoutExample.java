import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        //Create JFrame
        JFrame frame = new JFrame("BoderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);

        //Create Jpanel with boxlayout
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar,BoxLayout.Y_AXIS));

        sidebar.add(new JButton("Home"));
        sidebar.add(new JButton("Profile"));
        sidebar.add(new JButton("Layout"));

        //CREATE  JPanel with  BorderLAYOUT
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10,10));
        panel.add(sidebar,BorderLayout.WEST);

        //Add  Components to all regions
        panel.add(new JButton ("North(Top)"), BorderLayout.NORTH);
        panel.add(new JButton ("South(Bottom)"), BorderLayout.SOUTH);
        //panel.add(new JButton ("West(Left)"), BorderLayout.WEST);
        panel.add(new JButton ("East(Right)"), BorderLayout.EAST);
        panel.add(new JButton ("Center(Min Area)"), BorderLayout.CENTER);

        //Add Panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
