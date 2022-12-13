import javax.swing.*;
import java.awt.*;

public class NullContainerPr06 extends JFrame {
    NullContainerPr06() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        
        JLabel [] label = new JLabel[20];
        for(int i = 0; i < 20; i++) {
            label[i] = new JLabel(Integer.toString(i));

            int x = (int)(Math.random()*220)+30;
		    int y = (int)(Math.random()*220)+30;

            label[i].setLocation(x, y);
            label[i].setSize(20, 20);
            label[i].setForeground(Color.MAGENTA);
            contentPane.add(label[i]);
        }

        setSize(300, 300); 
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerPr06();
    }
}
