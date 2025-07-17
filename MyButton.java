import javax.swing.*;
public class MyButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JButton button = new JButton("Clicked Me");
        frame.add(button);

        frame.setVisible(true);
    }
}
