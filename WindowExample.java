package EventHandling;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowListener");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing....");
            }

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }
        });
        
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
