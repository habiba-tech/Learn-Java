package EventHandling;

import javax.swing.*;

public class ActionMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener with Menu");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create Menu Bar
        JMenuBar menuBar = new JMenuBar();

        //Create Menu
        JMenu menu = new JMenu("File");

        //Create Menu Item
        JMenuItem item = new JMenuItem("Click Me");

        //Add ActionLISTENER TO THE menu item
        item.addActionListener(e->JOptionPane.showMessageDialog(frame, "Menu Item Clicked!"));

        //Add item to menu, menu to menu bar
        menu.add(item);
        menuBar.add(menu);

        //Set menu bar to frame
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }
}
