import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseWheel06 extends JFrame{
	public MouseWheel06() {
		this.setTitle("마우스 휠 이벤트 적용");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");
		label.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				Font f = label.getFont();
				int size = f.getSize();
				int n = e.getWheelRotation();
				if(n < 0 && size > 10) {
					label.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
				else {
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
			}
		});
		c.add(label);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		new MouseWheel06();
	}
}