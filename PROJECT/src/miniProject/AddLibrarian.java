package miniProject;

import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class AddLibrarian extends JFrame {
	
	private static Statement statement;
	private static ResultSet results;
	AddLibrarian()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JLabel head=new JLabel("ADMIN LOGIN");
	     JLabel Lid=new JLabel("Librarian's ID");
	     JLabel Lname=new JLabel("Name");
	     JLabel Lpass=new JLabel("Password");
	     JLabel Lmail=new JLabel("E-mail Id");
	     JLabel Lphone=new JLabel("Contact No.");
	     
	  
	     JTextField tfLid=new JTextField();
	     JTextField tfLname=new JTextField();
	     JPasswordField tfLpass=new JPasswordField();
	     JTextField tfLmail=new JTextField();
	     JTextField tfLphone=new JTextField();
	     
	     
	     JButton back = new JButton("<< BACK");
	     JButton submit = new JButton("SUBMIT >>");
	     
	     background.add(head);
	     background.add(Lid);
	     background.add(Lname);
	     background.add(Lpass);
	     background.add(Lmail);
	     background.add(Lphone);
	     
	     background.add(tfLid);
	     background.add(tfLname);
	     background.add(tfLpass);
	     background.add(tfLmail);
	     background.add(tfLphone);
	     
	     background.add(back);
	     background.add(submit);
	     
	     Lid.setBounds(500,190,400,150);
	     Lid.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Lname.setBounds(500,250,400,150);
	     Lname.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Lpass.setBounds(500,310,400,150);
	     Lpass.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Lmail.setBounds(500,370,400,150);
	     Lmail.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Lphone.setBounds(500,430,400,150);
	     Lphone.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     
	     tfLid.setBounds(700,260,200,30);
	     tfLname.setBounds(700, 315, 200, 30);
	     tfLpass.setBounds(700, 370, 200, 30);
	     tfLmail.setBounds(700, 425, 200, 30);
	     tfLphone.setBounds(700, 480, 200, 30);
	     
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
		  AdminSuccess.main(new String[]{});
	  }
		  });
	     
	     
	     submit.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  try {
		  Class.forName("com.mysql.jdbc.Driver"); 
          Connection con=DriverManager.getConnection(  
       		   "jdbc:mysql://localhost:3306/library_system","root","");
          statement=con.createStatement();
         // String database="use library_system";
        //statement.execute(database);
		
		  
		  //Login.main(new String[]{});
          int li=Integer.parseInt(tfLid.getText());
		  String ln=tfLname.getText();
		  String lp=String.valueOf(tfLpass.getPassword());
		  String lm=tfLmail.getText();
		  String lph=tfLphone.getText();
		  
		  String insert="Insert into librarian_details values("+li+",'"+ln+"','"+lp+"','"+lm+"','"+lph+"');";
		
          statement.executeUpdate(insert);
		  
		  if(ln.equals("")&&lp.equals("")&&lm.equals("")&&lph.equals("")){
			  JOptionPane.showMessageDialog(AddLibrarian.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				
	  }
		  else{
			  AdminSuccess.main(new String[]{});
				//tfLname.setText("");
				//tfLpass.setText("");
			}
		  con.close();
		  
		  
		  } catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  
		  
	  }  });
	     
	     
	     
	}
	

	
	 public static void main(String args[])
	 {
	 SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				 AddLibrarian myFrame = new AddLibrarian();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}
	

}
