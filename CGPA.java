import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class CGPA extends JFrame implements ActionListener {
	JButton btn1,btn2;
	
	CGPA(){
		setTitle("Administrator");
		setVisible(true);
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 =  new JButton("Sortby Roll No");
		btn1.setBounds(100,50,120,30);
		btn2 = new JButton("Sortby CGPA");
		btn2.setBounds(100,100,120,30);
		
		add(btn1);
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){;}
}