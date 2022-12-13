import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ImageGraphicTest06 extends JFrame {
	public ImageGraphicTest06() {
		this.setTitle("그래픽 이미지 10% 확대 축소");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
		this.setContentPane(new MyPanel());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private Image img = new ImageIcon("images/apple.jpg").getImage();
		private int width = img.getWidth(this);
        private int height = img.getHeight(this);
		public MyPanel() {
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') { // 확대
						width = width + width/10;
						height = height + height/10;
					}
					else if(e.getKeyChar() == '-') { // 축소
						width = width - width/10;
						height = height - height/10;
					}
					repaint();
				}
			});
			this.setFocusable(true);
			this.requestFocus();
		}		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
	}
	public static void main(String[] args) {
		new ImageGraphicTest06();
	}
}
