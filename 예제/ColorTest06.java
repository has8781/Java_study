import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorTest06 extends JFrame {
	private JLabel label[] = new JLabel[12];
	public ColorTest06() {
		this.setTitle("3x4 Color Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4, 3));
		c.setBackground(Color.WHITE);
		for(int i = 0; i < 12; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					int r = (int) (Math.random() * 256);
					int g = (int) (Math.random() * 256);
					int b = (int) (Math.random() * 256);
					
					la.setOpaque(true);
					la.setBackground(new Color(r, g, b));
				}
                public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
			});	
			c.add(label[i]);
		}	
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ColorTest06();
	}
}