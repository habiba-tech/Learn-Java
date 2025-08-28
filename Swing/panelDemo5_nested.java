import javax.swing.*;
import java.awt.*;

public class panelDemo5_nested {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        //MAIN BORDER
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new BorderLayout());
        outerPanel.setBackground(Color.GRAY);

        JPanel  topPanel = new JPanel();
        topPanel.setBackground(Color.RED);
        topPanel.setPreferredSize(new Dimension(0,50));

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.blue);
        bottomPanel.setPreferredSize(new Dimension(0,50));

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.green);
        rightPanel.setPreferredSize(new Dimension(80,0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.orange);
        leftPanel.setPreferredSize(new Dimension(80,0));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.setBackground(Color.YELLOW);

        JPanel nestedPanel = new JPanel();
        nestedPanel.setBackground(Color.magenta);
        nestedPanel.setPreferredSize(new Dimension(100,50));
        centerPanel.add(nestedPanel);

        outerPanel.add(topPanel,BorderLayout.NORTH);
        outerPanel.add(bottomPanel,BorderLayout.SOUTH);
        outerPanel.add(leftPanel,BorderLayout.WEST);
        outerPanel.add(rightPanel,BorderLayout.EAST);
        outerPanel.add(centerPanel,BorderLayout.CENTER);

        frame.add(outerPanel);
        frame.setVisible(true);

    }

}
