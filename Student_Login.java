import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class Student_Login extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JTextField tf1,tf2;
	JButton btn1, btn2;
	JPasswordField p1;

	Student_Login()	{
		setTitle("Student");
		setVisible(true);
		setSize(800, 800);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Login as Student");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Serif", Font.BOLD, 20));
		l1.setBounds(200, 30, 400, 30);
		
		l2 = new JLabel("Enter Roll Number:");
		l2.setBounds(80, 70, 200, 30);
		
		l3 = new JLabel("Enter Branch:");
		l3.setBounds(80, 110, 200, 30);
		
		tf1 = new JTextField();
		tf1.setBounds(300, 70, 200, 30);
		
		tf2 = new JTextField();
		tf2.setBounds(300, 110, 200, 30);
		
		btn1 = new JButton("Sign in");
		btn1.setBounds(150, 160, 100, 30);
		
		btn2 = new JButton("Exit");
		btn2.setBounds(300, 160, 100, 30);
		
		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(tf2);
		add(btn1);
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btn1)
			new Student_one();
		else if(e.getSource() == btn2)
			System.exit(0);
		else ;
	}
	
}