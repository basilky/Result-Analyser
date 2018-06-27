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


public class Admin_Login extends JFrame implements ActionListener  {
	JLabel l1, l2, l3;
	JTextField tf1;
	JButton btn1, btn2;
	JPasswordField p1;
	Connection connect = null;
    Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
	Admin_Login() {
		setTitle("Log in");
		setVisible(true);
		setSize(600, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		l1 = new JLabel("Login as Administrator");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Serif", Font.BOLD, 20));

		l2 = new JLabel("Enter Username:");
		l3 = new JLabel("Enter Password:");
		tf1 = new JTextField();
		p1 = new JPasswordField();
		btn1 = new JButton("Sign in");
		btn2 = new JButton("Exit");

		l1.setBounds(100, 30, 400, 30);
		l2.setBounds(80, 70, 200, 30);
		l3.setBounds(80, 110, 200, 30);
		tf1.setBounds(300, 70, 200, 30);
		p1.setBounds(300, 110, 200, 30);
		btn1.setBounds(150, 160, 100, 30);
		btn2.setBounds(300, 160, 100, 30);

		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(p1);
		add(btn1);
		add(btn2);
		try{
            Class.forName("com.mysql.jdbc.Driver"); 
	           System.out.println("connecting!");
	connect = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12203798?autoReconnect=true&useSSL=false","sql12203798","7TuynYaims");
    System.out.println("Database connected!");
    statement = connect.createStatement();
	btn1.addActionListener(this);
	btn2.addActionListener(this);
}
		catch(Exception e){
			System.out.print("Error : " +e.getMessage());}
}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1)
		{
		try{
            resultSet = statement
					.executeQuery("select * from admin");
                  while(resultSet.next()){
                  String id  = resultSet.getString("username");
         String passwd = resultSet.getString("password");
			if(tf1.getText().equals(id) && p1.getText().equals(passwd))
			{
				JOptionPane.showMessageDialog(null,"Logged In");
				new Admin();
			setVisible(false);
		}
	}
}
		catch(Exception e2){}
			

		}
		else if(e.getSource() == btn2)
			System.exit(0);
		else ;
	}
}
