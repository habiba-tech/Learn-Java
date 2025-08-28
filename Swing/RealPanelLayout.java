import javax.print.attribute.standard.Sides;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class RealPanelLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Real Layout with JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setLayout(new BorderLayout());

        //Header Panel
        JPanel header = new JPanel();
        header.setBackground(Color.DARK_GRAY);
        header.setPreferredSize(new Dimension(0,60));
        addMouseEffects(header,Color.darkGray,Color.black);

        //Sidebar Panel
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(52,72,94));
        sidebar.setPreferredSize(new Dimension(150,0));
        addMouseEffects(sidebar,new Color(52,72,94),new Color(41,128,185));


        JPanel main = new JPanel();
        main.setBackground(Color.lightGray);
        //ADD Panel
        frame.add(header,BorderLayout.NORTH);
        frame.add(sidebar,BorderLayout.WEST);
        frame.add(main,BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void addMouseEffects(JPanel panel, Color normal, Color hover) {
        panel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                panel.setBackground(hover);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(normal);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.setBackground(Color.green);
                System.out.println("Panel Clicked:" + panel.getName());
            }
        });
    }
}

