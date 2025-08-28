package EventHandling;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DelegationModelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 70, 140, 40);

        //Attach Listener(Anonymous class here)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"You clicked the button");
            }
        });
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }
}
