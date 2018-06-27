import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class Admin extends JFrame implements ActionListener {
	
	JButton btn1, btn2;
	
	Admin(){
		setTitle("Welcome ADMIN");
		setVisible(true);
		setSize(500, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("View");
		btn2 = new JButton("Enter Marks");
		
		btn1.setBounds(100, 50, 100, 30);
		btn2.setBounds(250, 50, 110, 30);
		
		add(btn1);
		add(btn2);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn1)
			{	new Admin_View();
				setVisible(false);
				dispose();
			}
			if(e.getSource() == btn2)
			{	new Admin_View();
				setVisible(false);
				dispose();
			}
		}
	
}
