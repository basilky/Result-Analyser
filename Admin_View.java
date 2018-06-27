import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class Admin_View extends JFrame implements ActionListener {
	JLabel l1, l2;
	JTextField tf1,tf2;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btnB,btnC;
	

	Admin_View()	{
		setTitle("Administrator");
		setVisible(true);
		setSize(800, 800);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Branch");
		l1.setBounds(200, 30, 400, 30);
		
		btnC = new JButton("CGPA");
		btnC.setBounds(200,250,100,30);
		
		tf1 = new JTextField();
		tf1.setBounds(300,30,200,30);
		
		
		btn1 = new JButton("S1");
		btn1.setBounds(50,100,50,30);
		btn2 = new JButton("S2");
		btn2.setBounds(100,100,50,30);
		btn3 = new JButton("S3");
		btn3.setBounds(150,100,50,30);
		btn4 = new JButton("S4");
		btn4.setBounds(200,100,50,30);
		btn5 = new JButton("S5");
		btn5.setBounds(250,100,50,30);
		btn6 = new JButton("S6");
		btn6.setBounds(300,100,50,30);
		btn7 = new JButton("S7");
		btn7.setBounds(350,100,50,30);
		btn8 = new JButton("S8");
		btn8.setBounds(400,100,50,30);
		btnB = new JButton("Back");
		btnB.setBounds(300,250,100,30);
		
		add(l1);
		add(tf1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btnB);
		add(btnC);
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btnC.addActionListener(this);
		btnB.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnC)
			{new CGPA();setVisible(false);}
		else if(e.getSource() == btnB)
		{
			//Admin.frame.setVisible(true);
			setVisible(false);
			new Admin();
		}
		else	new Options();
	}
	
	}
