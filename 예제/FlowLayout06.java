import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowLayout06 extends JFrame {
    FlowLayout06() {
        setTitle("FlowLayout Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        
        contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
        JButton btn1 = new JButton("버튼1");
        JButton btn2 = new JButton("버튼2");
        JButton btn3 = new JButton("버튼3");
        JButton btn4 = new JButton("버튼4");
        JButton btn5 = new JButton("버튼5");
        JButton btn6 = new JButton("버튼6");
        JButton btn7 = new JButton("버튼7");
        JButton btn8 = new JButton("버튼8");
        JButton btn9 = new JButton("버튼9");
        JButton btn10 = new JButton("버튼10");
        JButton btn11 = new JButton("버튼11");
        JButton btn12 = new JButton("버튼12");
        JButton btn13 = new JButton("버튼13");
        JButton btn14 = new JButton("버튼14");
        JButton btn15 = new JButton("버튼15");

        contentPane.add(btn1);
        contentPane.add(btn2);
        contentPane.add(btn3);
        contentPane.add(btn4);
        contentPane.add(btn5);
        contentPane.add(btn6);
        contentPane.add(btn7);
        contentPane.add(btn8);
        contentPane.add(btn9);
        contentPane.add(btn10);
        contentPane.add(btn11);
        contentPane.add(btn12);
        contentPane.add(btn13);
        contentPane.add(btn14);
        contentPane.add(btn15);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼1")){
                    System.out.println("버튼1");
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼2")){
                    System.out.println("버튼2");
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼3")){
                    System.out.println("버튼3");
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼4")){
                    System.out.println("버튼4");
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼5")){
                    System.out.println("버튼5");
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼6")){
                    System.out.println("버튼6");
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼7")){
                    System.out.println("버튼7");
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼8")){
                    System.out.println("버튼8");
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼9")){
                    System.out.println("버튼9");
                }
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼10")){
                    System.out.println("버튼10");
                }
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼11")){
                    System.out.println("버튼11");
                }
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼12")){
                    System.out.println("버튼12");
                }
            }
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼13")){
                    System.out.println("버튼13");
                }
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼14")){
                    System.out.println("버튼14");
                }
            }
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("버튼15")){
                    System.out.println("버튼15");
                }
            }
        });
        setSize(410, 300); 
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayout06();
    }
}