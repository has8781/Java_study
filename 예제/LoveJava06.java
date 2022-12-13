import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoveJava06 extends JFrame {
    private Font f;
    private int size;
	public LoveJava06() {
		this.setTitle("+, - 키로 폰트 크기 키우기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);			
		Container c = getContentPane();		
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
        c.add(la);

		c.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
                f = la.getFont();
                size = f.getSize();
				if(e.getKeyChar() == '+') {
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				else if(e.getKeyChar() == '-' && size > 10) {
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		});

		
		this.setSize(300, 200);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new LoveJava06();
	}
}