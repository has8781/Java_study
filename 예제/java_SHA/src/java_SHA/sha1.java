package java_SHA;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class sha1 extends JFrame {
	public sha1() {
		setTitle("그리기 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(getOwner());
		setSize(600, 500);
		setVisible(true);
		
		Container c = getContentPane();
		
		Imag Im = new Imag();
		c.add(Im);
		//Square sq = new Square();
		//sq.setLocation(200, 200);
		//c.add(sq);
		
		
	}
	private class Imag extends JPanel {
		ImageIcon icon = new ImageIcon("C:\\SHA\\fruits\\banana.jpg");
		Image img = icon.getImage();
		JLabel la1 = new JLabel();
		public Imag() {
			la1.setForeground(Color.RED);
			la1.setLocation(20, 20);
			add(la1);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 50, 100, 100, this);
		}
	}
	//private class Square extends JPanel {
		//public Square() {
			//setSize(100, 100);
			//setBorder(new LineBorder(Color.RED));
		//}
	//}
	
	public static void main(String[] args) {
		new sha1();
	}
}
