import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextRadioTest06 extends JFrame {
	private JTextField jtf1;
	private JTextField jtf2;
	private JRadioButton [] rbt = new JRadioButton[4];
	private String [] rbt_text = {"decimal", "binary", "octal", "hex"};

	public TextRadioTest06() {
		this.setTitle("Digit Changer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		ButtonGroup btg = new ButtonGroup();
		
		jtf1 = new JTextField(9);
		jtf2 = new JTextField(9);
		
		c.add(jtf1);
		c.add(new JLabel("->"));
		c.add(jtf2);
		
		for(int i = 0; i < rbt.length; i++) {
			rbt[i] = new JRadioButton(rbt_text[i]);
			c.add(rbt[i]);
			rbt[i].addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED && !jtf1.getText().equals("")) {
						if(e.getItem() == rbt[0]) {
							jtf2.setText(Integer.toString(Integer.parseInt(jtf1.getText())));
						}
						else if(e.getItem() == rbt[1]) {
							jtf2.setText(Integer.toBinaryString(Integer.parseInt(jtf1.getText())));
						}
						else if(e.getItem() == rbt[2]) {
							jtf2.setText(Integer.toOctalString(Integer.parseInt(jtf1.getText())));
						}
						else {
							jtf2.setText(Integer.toHexString(Integer.parseInt(jtf1.getText())));
						}
					}
				}
			});
			btg.add(rbt[i]);

		}
		this.setSize(300, 125);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new TextRadioTest06();
	}
}