package miniProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.Border;

public class LibrarianLogin extends JFrame{

	private static Statement statement;
	String p;
	
	
	LibrarianLogin()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JLabel head=new JLabel("LIBRARIAN LOGIN");
	     JLabel lid=new JLabel("Librarian ID");
	     JLabel lpass=new JLabel("Password");
	     
	     JTextField tfid=new JTextField();
	     JPasswordField tfpass=new JPasswordField();
	     
	     JButton back = new JButton("<< BACK");
	     JButton submit = new JButton("SUBMIT >>");
	     
	     background.add(head);
	     background.add(lid);
	     background.add(lpass);
	     background.add(tfid);
	     background.add(tfpass);
	     background.add(back);
	     background.add(submit);
	     
	     head.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
		    head.setBounds(600, 100, 800, 200);
	     
	     lid.setBounds(500,250,400,150);
	     lid.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     lpass.setBounds(500,310,400,150);
	     lpass.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     
	     tfid.setBounds(700, 315, 200, 30);
	     tfpass.setBounds(700, 370, 200, 30);
	     
	     back.setBounds(20, 500, 250, 70);
	     back.setBackground(new Color(254,204,153));
	     submit.setBounds(1100, 500, 250, 70);
	     submit.setBackground(new Color(254,204,153));
	     back.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
	     submit.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
	     back.setBorder(bored);
	     submit.setBorder(bored);
	     
	     back.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  Login.main(new String[]{});
	  }
		  });
	     
	   
	     
	     
	     submit.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  
		  
		 try {
			 
			 Class.forName("com.mysql.jdbc.Driver"); 
	          Connection conn;
			conn = DriverManager.getConnection(  
				   "jdbc:mysql://localhost:3306/library_system","root","");
		 
         statement=conn.createStatement();
         String st="use library_system;";
         statement.executeUpdate(st);
         int id=Integer.parseInt(tfid.getText());
		 String pa=String.valueOf(tfpass.getPassword());
		 
		 String s = "select * from librarian_details where L_id="+id+";";
		 ResultSet results=statement.executeQuery(s);
		 if(results.next())
		 {  p=results.getString(3); }
		  
		  if(pa.equals(p))
		  {
			  LibrarianSuccess.main(new String[]{}); 
		  }
		  else
		  {
			  JOptionPane.showMessageDialog(LibrarianLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				
			  Login.main(new String[]{});
		  }
		  conn.close();	 
		 }
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
			
		  
	  }
		  });
		  
	     
	     
	     
	     
	     
	     
	     setDefaultCloseOperation(3);
	     setSize(400,400);
	     setVisible(true);
	  
	     
	}
	  
	
	
	
	 public static void main(String args[])
	 {
	 SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				 LibrarianLogin myFrame = new LibrarianLogin();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}

}
