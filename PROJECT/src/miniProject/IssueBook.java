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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class IssueBook extends JFrame {
	
	private static Statement statement;
	private static ResultSet results;
	IssueBook()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JLabel head=new JLabel("ADMIN LOGIN");
	     JLabel bid=new JLabel("BOOK ID");
	     JLabel sid=new JLabel("STUDENT ID");
	    
	     
	  
	     JTextField tfbid=new JTextField();
	     JTextField tfsid=new JTextField();
	   
	     
	     
	     JButton back = new JButton("<< BACK");
	     JButton submit = new JButton("ISSUE >>");
	     
	     background.add(head);
	     background.add(bid);
	     background.add(sid);
	     background.add(tfbid);
	     background.add(tfsid);
	
	  
	     
	     background.add(back);
	     background.add(submit);
	     
	     bid.setBounds(500,250,400,150);
	     bid.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	    
	     sid.setBounds(500,310,400,150);
	     sid.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     
	     tfbid.setBounds(700, 315, 200, 30);
	     tfsid.setBounds(700, 370, 200, 30);

	     
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
          Connection conn=DriverManager.getConnection(  
       		   "jdbc:mysql://localhost:3306/library_system","root","");
          statement=conn.createStatement();
         // String database="use library_system";
        //statement.execute(database);
		
		  
		  //Login.main(new String[]{});
          int b=Integer.parseInt(tfbid.getText());
          int s=Integer.parseInt(tfsid.getText());
		 
		  String issue1="update addbook SET B_qty = B_qty + -1 where B_id="+b+";";
		  String issue2="update addstudent SET Books_taken = Books_taken + 1 where S_id="+s+";";
		
         int res1=statement.executeUpdate(issue1);
         int res2=statement.executeUpdate(issue2);
		  if(res1==0 && res2==0){
			  JOptionPane.showMessageDialog(IssueBook.this, "Sorry, Unable to delete","Error!", JOptionPane.ERROR_MESSAGE);
				
	  }
		  else{
			  AdminSuccess.main(new String[]{});
				//tfLname.setText("");
				//tfLpass.setText("");
			}
		  conn.close();
		  
		  
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
				IssueBook myFrame = new IssueBook();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}

}
