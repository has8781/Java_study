import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxTest06 extends JFrame {
    private JCheckBox []jcb = new JCheckBox[2];
	private String [] cb_text = { "버튼 비활성화", "버튼 감추기" };
	private JButton bt = new JButton("test button");

	public CheckBoxTest06() {
		this.setTitle("CheckBox");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i <jcb.length; i++) {
		jcb[i] = new JCheckBox(cb_text[i]);
			c.add(jcb[i]);
		jcb[i].addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() ==jcb[0]) {
							bt.setEnabled(false);
						}
						else {
							bt.setVisible(false);
						}
					}
					else {
						if(e.getItem() ==jcb[0]) {
							bt.setEnabled(true);
						}
						else {
							bt.setVisible(true);
						}
					}
				}
			});
		}	
		c.add(bt);
        this.setVisible(true);
        this.setSize(250, 150);
	}
    public static void main(String[] args) {
		new CheckBoxTest06();
	}
}
