import java.awt.*;
import javax.swing.*;

public class ImageDrawTest06 extends JFrame{
	
	public ImageDrawTest06() {
		this.setTitle("이미지 그리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
		this.setContentPane(new MyPanel());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	private class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/back.jpg");
        private Image img = icon.getImage();
		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new ImageDrawTest06();
	}
}