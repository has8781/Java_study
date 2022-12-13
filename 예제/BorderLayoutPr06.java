import javax.swing.*;
import java.awt.*;

public class BorderLayoutPr06 extends JFrame {
    BorderLayoutPr06() {
        setTitle("FlowLayout Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout(50, 5));
        contentPane.add(new JButton("버튼1"), BorderLayout.WEST);
        contentPane.add(new JButton("버튼2"), BorderLayout.NORTH);
        contentPane.add(new JButton("버튼3"), BorderLayout.CENTER);
        contentPane.add(new JButton("버튼4"), BorderLayout.EAST);
        contentPane.add(new JButton("버튼5"), BorderLayout.SOUTH);

        setSize(410, 300); 
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutPr06();
    }
}
