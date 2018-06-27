import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class Welcome extends JFrame implements ActionListener {
	
		JLabel l1;
		JButton btn1, btn2;
	
	Welcome() {
		setTitle("Welcome");
		setVisible(true);
		setSize(500, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Who are you ?");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Serif", Font.BOLD, 20));
		l1.setBounds(200, 30, 400, 30);
		
		btn1 = new JButton("Student");
		btn1.setBounds(150, 160, 100, 30);
		
		btn2 = new JButton("Admin");
		btn2.setBounds(300, 160, 100, 30);
		
		add(l1);
		add(btn1);
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btn2) {	
				new Admin_Login();
				setVisible(false);
			}
			if(e.getSource() == btn1) {
				new Student_Login();
				setVisible(false);
			}
		}
		
		public static void main(String arr[]) {
		new Welcome();
		}
}