import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Admin_enterDetails extends JFrame {

	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JButton btn1;
	
	Admin_enterDetails(){
		setTitle("Amin");
		setVisible(true);
		setSize(500, 500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Name:");
		l1.setBounds(200,70,80,50);
		l2 = new JLabel("Reg No:");
		l2.setBounds(200,100,80,50);
		l3 = new JLabel("Dept:");
		l3.setBounds(200,130,80,50);
		l4 = new JLabel("Current Sem:");
		l4.setBounds(200,160,80,50);
		l5 = new JLabel("Join Date:");
		l5.setBounds(200,190,80,50);
		l6 = new JLabel("Passout year:");
		l6.setBounds(200,220,80,50);
		l7 = new JLabel("Mail ID:");
		l7.setBounds(200,250,80,50);
		
		tf1 = new JTextField();
		tf1.setBounds(300,90,100,20);
		tf2 = new JTextField();
		tf2.setBounds(300,120,100,20);
		tf3 = new JTextField();
		tf3.setBounds(300,150,100,20);
		tf4 = new JTextField();
		tf4.setBounds(300,180,100,20);
		tf5 = new JTextField();
		tf5.setBounds(300,210,100,20);
		tf6 = new JTextField();
		tf6.setBounds(300,240,100,20);
		tf7 = new JTextField();
		tf7.setBounds(300,270,110,20);
		btn1 = new JButton("Submit");
		
		btn1.setBounds(100, 50, 100, 30);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);
		add(tf7);
		add(btn1);



		try{
            Class.forName("com.mysql.jdbc.Driver");            
	Connection connect = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12203798?autoReconnect=true&useSSL=false","sql12203798","7TuynYaims");
    System.out.println("Database connected!");
    statement = connect.createStatement();
	btn1.addActionListener(this);
}
		catch(Exception e){
			System.out.print("Error : " +e.getMessage());}
	}		



	//	btn1.addActionListener(this);
	public void actionPerformed(ActionEvent e) {
		try{
			if(e.getSource() == btn1)
			{	
				Connection connect = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12203798?autoReconnect=true&useSSL=false","sql12203798","7TuynYaims");
				String query = "insert into students values(name=?,regno=?,joindate=?,passoutdate=?,mailid=?,branch=?,currsem=?)";
				PreparedStatement preparedStatement =connect.prepareStatement(query);
            Class.forName("com.mysql.jdbc.Driver");            
    System.out.println("Database connected!");
    preparedStatement.setString(1, tf1.getText());
	preparedStatement.setString(2, tf2.getText());
	preparedStatement.setString(3, tf3.getText());
	preparedStatement.setString(4, tf4.getText());
	preparedStatement.setString(5, tf5.getText());
	preparedStatement.setString(6, tf6.getText());
	preparedStatement.setString(7, tf7.getText());
	preparedStatement.executeQuery();
			}
		}
			catch(Exception e2){
			System.out.print("Error : " +e2.getMessage());}
	
}
}
