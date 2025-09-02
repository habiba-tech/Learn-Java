package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseMotionListener");
        JPanel panel = new JPanel();

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                frame.setTitle("Mouse at: "+ e.getX()+","+e.getY());
            }
        });
        frame.add(panel);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
