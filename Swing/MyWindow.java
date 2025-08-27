import javax.swing.*;
import java.awt.*;
public class MyWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame();
            frame.setTitle("🚀 My Awesome JFrame Window");
            ImageIcon icon = new ImageIcon("images/img.png");
            frame.setIconImage(icon.getImage());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600 ,400);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}
