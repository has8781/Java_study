import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Choice_member extends JFrame{
	Color back_c = new Color(0x0E1D35);
	Color button_c = new Color(0xDDDEE5);
	Font font = new Font("맑은 고딕", Font.BOLD, 20);
	Font button_font = new Font("맑은 고딕", Font.BOLD, 40);
	
	public Choice_member(){
		setTitle("스터디 카페");
		setSize(1300,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		Dimension frameSize = getSize();
		 
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2, // 화면 중앙에 메인 프레임 띄우기
                (windowSize.height - frameSize.height) / 2 - 10);
        
		c.setBackground(back_c);		
		c.setLayout(null);	
    	
		main_panel mp = new main_panel();	// 회원 비회원 선택 화면 패널
		c.add(mp);

		member_view mv = new member_view();	// 회원 선택시 화면 패널
		mp.member.addActionListener(new ActionListener() {	// 회원 버튼을 눌렀을 때
			public void actionPerformed(ActionEvent e) {
				mp.setVisible(false);
				c.add(mv);	// 회원 화면 부착
			}
		});
		
		join_view jv = new join_view();		// 회원 가입 화면 패널
		notmember_view nmv = new notmember_view();	// 비회원 선택시 화면 패널
		mp.not_member.addActionListener(new ActionListener() {	// 비회원 버튼을 눌렀을 때
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,	// OptionPaneEx.this : 가운데 출력
						"회원가입을 하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION) { // 회원 가입 하는 경우
					mp.setVisible(false);
					c.add(jv);	// 회원 가입 화면 부착
				}
				else if(result == JOptionPane.NO_OPTION) {	// 비회원으로 구매하는 경우
					mp.setVisible(false);
					c.add(nmv);	// 비회원 화면 부착
				}				
			}
		});
		
		}
	
	class main_panel extends JPanel {	// 회원 비회원 선택 화면
		private JButton member = new JButton("회원"); // 회원 버튼
		private JButton not_member = new JButton("비회원"); // 비회원 버튼
		
		public main_panel() {
			this.setSize(1100,600);
			this.setLocation(90,90);
			setBackground(Color.WHITE);
			setLayout(null);

			member.setBounds(225,150,300,300); // 위치, 크기 2
			member.setFont(button_font);
			member.setBackground(button_c);		
			add(member); // 회원 버튼 컨텐트페인에 추가
			
			not_member.setBounds(575,150,300,300); // 위치, 크기 2
			not_member.setFont(button_font);
			not_member.setBackground(button_c);		
			add(not_member);					
		}
	}
	
	class member_view extends JPanel {	// 회원 화면 
		private JLabel name = new JLabel("로그인");
		private JLabel IDl = new JLabel("아이디");
		private JTextField IDtf = new JTextField(40);	// ID 입력 받는 텍스트 필드
		private JLabel PSl = new JLabel("비밀번호");
		private JTextField PStf = new JTextField(40);	// Password 입력 받는 텍스트 필드
		private JButton login = new JButton("로그인");
		
		public member_view() {	// 위치 오류 수정하기
			setLayout(null);
			setSize(1100,600);
			setLocation(90,90);
			setBackground(Color.WHITE);
			
			name.setBounds(400,80,150,40);
			name.setFont(button_font);
			add(name);
			
			IDl.setBounds(400,170,100,40);
			IDl.setFont(font);
			add(IDl);
			
			IDtf.setBounds(400,220,300,40);
			IDtf.setFont(font);
			add(IDtf);
			
			PSl.setBounds(400,270,100,40);
			PSl.setFont(font);
			add(PSl);
			
			PStf.setBounds(400,320,300,40);
			PStf.setFont(font);
			add(PStf);
			
			login.setBounds(600,420,100,50); // 위치, 크기 2
			login.setFont(font);
			login.setBackground(button_c);		
			add(login);
			
			setVisible(true);
		}
	}
	
	class join_view extends JPanel{		// 회원 가입 화면 
		public join_view() {
			this.setSize(1100,600);
			this.setLocation(90,90);
			setBackground(Color.WHITE);
			setVisible(true);

		}
	}	
	
	class notmember_view extends JPanel{	// 비회원 화면 
		public notmember_view() {
			this.setSize(1100,600);
			this.setLocation(90,90);
			setBackground(Color.WHITE);
			setVisible(true);

		}
	}
	
	
	public static void main(String [] args) {
		new Choice_member();
	}
}
