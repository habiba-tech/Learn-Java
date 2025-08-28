package EventHandling;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener");
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                System.out.println("Key Pressed:" + e.getKeyChar());
            }
        });
        frame.add(textField);
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
