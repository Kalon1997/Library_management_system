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

public class AddBook extends JFrame {
	
	private static Statement statement;
	private static ResultSet results;
	AddBook()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JLabel head=new JLabel("ADMIN LOGIN");
	     JLabel Bid=new JLabel("Book's ID");
	     JLabel Bname=new JLabel("Book Name");
	     JLabel Bauth=new JLabel("Author");
	     JLabel Bpub=new JLabel("Publisher");
	     JLabel Bqty=new JLabel("Q_ty");
	     
	  
	     JTextField tfbid=new JTextField();
	     JTextField tfbname=new JTextField();
	     JTextField tfbuth=new JTextField();
	     JTextField tfbpub=new JTextField();
	     JTextField tfbqty=new JTextField();
	     
	     
	     JButton back = new JButton("<< BACK");
	     JButton submit = new JButton("ADD >>");
	     
	     background.add(head);
	     background.add(Bid);
	     background.add(Bname);
	     background.add(Bauth);
	     background.add(Bpub);
	     background.add(Bqty);
	     
	     background.add(tfbid);
	     background.add(tfbname);
	     background.add(tfbuth);
	     background.add(tfbpub);
	     background.add(tfbqty);
	     
	     background.add(back);
	     background.add(submit);
	     
	     Bid.setBounds(500,190,400,150);
	     Bid.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Bname.setBounds(500,250,400,150);
	     Bname.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Bauth.setBounds(500,310,400,150);
	     Bauth.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Bpub.setBounds(500,370,400,150);
	     Bpub.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     Bqty.setBounds(500,430,400,150);
	     Bqty.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     
	     tfbid.setBounds(700,260,200,30);
	     tfbname.setBounds(700, 315, 200, 30);
	     tfbuth.setBounds(700, 370, 200, 30);
	     tfbpub.setBounds(700, 425, 200, 30);
	     tfbqty.setBounds(700, 480, 200, 30);
	     
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
		  LibrarianSuccess.main(new String[]{});
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
          int bi=Integer.parseInt(tfbid.getText());
		  String bn=tfbname.getText();
		  String bu=tfbuth.getText();
		  String bp=tfbpub.getText();
		  int bq=Integer.parseInt(tfbqty.getText());
		  
		  String insert="Insert into addbook values("+bi+",'"+bn+"','"+bu+"','"+bp+"',"+bq+");";
		
          statement.executeUpdate(insert);
		  
		  if(bn.equals("")&&bu.equals("")){
			  JOptionPane.showMessageDialog(AddBook.this, "Sorry, Enter all the values","Login Error!", JOptionPane.ERROR_MESSAGE);
				
	  }
		  else{
			  BookOperation.main(new String[]{});
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
				 AddBook myFrame = new AddBook();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}
	

}
