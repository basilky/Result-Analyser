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
//import java.sql.*;

public class Student_one extends JFrame implements ActionListener {
	JLabel l1, l2;
	JTextField tf1,tf2;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btnB;
	JPasswordField p1;
		Connection connect = null,conn=null;
    Statement statement = null;
        private ResultSet resultSet = null;
            private PreparedStatement pstmt = null;

	Student_one()	{
		setTitle("Student");
		setVisible(true);
		setSize(800, 800);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Name");
		l1.setBounds(200, 30, 400, 30);
		
		l2 = new JLabel("CGPA");
		l2.setBounds(200,200,400,30);
		
		tf1 = new JTextField();
		tf1.setBounds(300,30,200,30);
		
		tf2 = new JTextField();
		tf2.setBounds(300,200,200,30);
		
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
		add(l2);
		add(tf1);
		add(tf2);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btnB);
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btn1)
		{
					try{
				System.out.println("jshdgchjsgchjsgchgcsjgcs");
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            
	conn = DriverManager.getConnection("jdbc:mysql://localhost/asd?autoReconnect=true&useSSL=false","root","basilsvn");
    System.out.println("Database connected!");

            String query = "select * from css1";
            pstmt = conn.prepareStatement(query);
            //pstmt.setString(1,"css1");
            //statement = connect.createStatement();
            // Result set get the result of the SQL query
            System.out.println("enwdcwcteruytyujtuj");
            //resultSet = statement
                    //.executeQuery("select * from student");
            //writeResultSet(resultSet);
            ResultSet result = pstmt.executeQuery();

              
					  System.out.println("work");
					  String first = result.getString("sub1");
					  System.out.println(first);
         //Retrieve by column name
       /*  int id  = resultSet.getInt("id");
         int age = resultSet.getInt("age");
         String first = resultSet.getString("first");
         String last = resultSet.getString("last");*/
	 
}
		catch(Exception e2){
			System.out.println("error");
			System.out.println(e2.getMessage());
			}
		}
		}
}
		
