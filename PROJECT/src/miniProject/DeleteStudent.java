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

public class DeleteStudent extends JFrame {
	
	private static Statement statement;
	private static ResultSet results;
	DeleteStudent()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JLabel head=new JLabel("ADMIN LOGIN");
	     JLabel Lid=new JLabel("STUDENT ID");
	    
	     
	  
	     JTextField tfLid=new JTextField();
	   
	     
	     
	     JButton back = new JButton("<< BACK");
	     JButton submit = new JButton("DELETE >>");
	     
	     background.add(head);
	     background.add(Lid);
	
	     
	     background.add(tfLid);
	  
	     
	     background.add(back);
	     background.add(submit);
	     
	     Lid.setBounds(500,190,400,150);
	     Lid.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	    
	     
	     tfLid.setBounds(700,260,200,30);

	     
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
          Connection conn=DriverManager.getConnection(  
       		   "jdbc:mysql://localhost:3306/library_system","root","");
          statement=conn.createStatement();
         // String database="use library_system";
        //statement.execute(database);
		
		  
		  //Login.main(new String[]{});
          int li=Integer.parseInt(tfLid.getText());
		 
		  String delete="Delete from addstudent where S_id="+li+";";
		
         int res=statement.executeUpdate(delete);
		  
		  if(res==0){
			  JOptionPane.showMessageDialog(DeleteStudent.this, "Sorry, Unable to delete","Error!", JOptionPane.ERROR_MESSAGE);
				
	  }
		  else{
			  LibrarianSuccess.main(new String[]{});
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
				DeleteStudent myFrame = new DeleteStudent();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}

}
