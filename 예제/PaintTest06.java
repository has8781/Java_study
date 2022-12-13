import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class PaintTest06 extends JFrame {
    public PaintTest06() {
		setTitle("4가지 패널");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(getOwner());
		setSize(900, 500);
		setVisible(true);

        Container c = getContentPane();
        MyPanel p1 = new MyPanel();
        MyPanel2 p2 = new MyPanel2();
        MyPanel3 p3 = new MyPanel3();
        MyPanel4 p4 = new MyPanel4();
		c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
		c.setLayout(new GridLayout(2,2,10,10));
	}
	private class MyPanel extends JPanel {
        public MyPanel() {
			setBorder(new LineBorder(Color.RED));
        }
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillArc(105,0,225,225, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(105,0, 225,225,210, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(105,0,225,225, 330, 120);
		}
	}

    private class MyPanel2 extends JPanel {
        public MyPanel2() {
			setBorder(new LineBorder(Color.RED));
        }
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawOval(190, 70, 60, 60);
			g.setColor(Color.BLACK);
			g.drawOval(140, 70, 60, 60);
			g.setColor(Color.RED);
			g.drawOval(240, 70, 60, 60);
			g.setColor(Color.YELLOW);
			g.drawOval(215, 110, 60, 60);
			g.setColor(Color.GREEN);
			g.drawOval(165, 110, 60, 60);
		}
	}

    private class MyPanel3 extends JPanel {
        public MyPanel3() {
			setBorder(new LineBorder(Color.RED));
        }
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int [] x = { getWidth()/2, 0, getWidth()/2, (getWidth()) };
			int [] y = { 0, getHeight()/2, (getHeight()), getHeight()/2 };
			
			g.setColor(Color.BLUE);
			g.drawPolygon(x, y, 4);
		}
	}
    private class MyPanel4 extends JPanel {
        public MyPanel4() {
			setBorder(new LineBorder(Color.RED));
        }
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
            g.setColor(Color.BLACK);
			int x = 0;
			int y = 0;
			for(int i = 0; i < 9; i++) {
				g.drawLine(getWidth()/10 + x, 0, getWidth()/10 + x, getHeight());
				g.drawLine(0, getHeight()/10 + y, getWidth(), getHeight()/10 + y);
				x += getWidth()/10;
				y += getHeight()/10;
			}
		}
	}	
	public static void main(String[] args) {
		new PaintTest06();
	}
}