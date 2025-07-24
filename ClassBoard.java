import javax.swing.*;
import java.awt.*;
public class ClassBoard {
    public static void main(String[] args) {
        // Create main Frame
        JFrame frame = new JFrame("Chess Board - Gridlayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600); // Square Frame

        //Create panel with 8*8 Gridlayout
        JPanel board = new JPanel(new GridLayout(8,8));

        //Loop through row and columns
        for (int row = 0; row<8;row++){
            for (int col = 0; col < 8; col++) {
                JLabel square = new JLabel(); // Empty Square
                square.setOpaque(true); //Necessary for bg color

                //Set alternating colors chessboard logic
                if ((row + col)% 2==0) {
                    square.setBackground(Color.WHITE);
                }else{
                    square.setBackground(Color.DARK_GRAY);
                }
                board.add(square);
            }
        }
        //Add board to frame
        frame.add(board);
        frame.setVisible(true);
    }
}
