import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class Options extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7;
	
	Options(){
		setTitle("Administrator");
		setVisible(true);
		setSize(800, 800);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("1.View All");
		l1.setBounds(100,50,100,30);
		l2 = new JLabel("2.Failed Students");
		l2.setBounds(100,100,100,30);
		l3 = new JLabel("3.SGPA");
		l3.setBounds(100,150,100,30);
		l4 = new JLabel("4.Top 10");
		l4.setBounds(100,200,100,30);
		l5 = new JLabel("5.SGPA Filter");
		l5.setBounds(100,250,100,30);
		l6 = new JLabel("6.No. of failures for each subject");
		l6.setBounds(100,300,200,30);
		l7 = new JLabel("Enter your option");
		l7.setBounds(100,400,200,30);
		
		add(l1); 
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		
	}
	public void actionPerformed(ActionEvent e){;}
}
		