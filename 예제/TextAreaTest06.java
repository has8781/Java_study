import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class TextAreaTest06 extends JFrame{
	private JTextArea jtx = new JTextArea(7, 28);

	public TextAreaTest06() {
		this.setTitle("파일 저장");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		creatMenu();
		jtx.setLineWrap(true);
		c.add(new JScrollPane(jtx), BorderLayout.CENTER);
		
		this.setSize(320, 200);
		this.setVisible(true);
	}
	
	public void creatMenu() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("파일");
		JMenuItem mi = new JMenuItem("저장");
		
		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jtx.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "입력한 텍스트가 없습니다", "에러", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String fileName = JOptionPane.showInputDialog("저장할 파일명을 입력하세요");
					if(fileName == null) {
						return;
					}
					try {
						FileWriter fw = new FileWriter(fileName);
						String s = jtx.getText();
						StringTokenizer st = new StringTokenizer(s, "\n");
						
						while(st.hasMoreTokens()) {
							fw.write(st.nextToken());
							fw.write("\r\n");
						}
					}
					catch (IOException e1) {};
				}
			}
		});
		jm.add(mi);
		jmb.add(jm);
		
		setJMenuBar(jmb);
	}
	
	public static void main(String[] args) {
		new TextAreaTest06();
	}
}