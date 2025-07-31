package EventHandling;

import javax.swing.*;
import java.awt.event.ItemEvent;

public class ItemExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemListener");
        JCheckBox checkBox = new JCheckBox("Accept Terms");

        checkBox.addItemListener(e -> {
            if (e.getStateChange()== ItemEvent.SELECTED){
                System.out.println("CheckBox Checked");
            }else{
                System.out.println("Checkbox UnChecked");
            }
        });
        frame.add(checkBox);
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
