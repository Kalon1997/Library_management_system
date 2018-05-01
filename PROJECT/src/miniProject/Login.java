package miniProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Login extends JFrame  {
	Login()
	{
		 JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);
	     
	     JButton admin = new JButton("ADMIN");
	     JButton librarian = new JButton("LIBRARIAN");
	     JButton back = new JButton("<< BACK");
	     
	     admin.setBounds(600, 200, 250, 70);
	     librarian.setBounds(600, 300, 250, 70);
	     back.setBounds(20, 500, 250, 70);
	     
	     admin.setBackground(new Color(254,204,153));
	     librarian.setBackground(new Color(254,204,153));
	     back.setBackground(new Color(254,204,153));
	     
	     admin.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
	     librarian.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
	     back.setFont(new Font("arial", Font.PLAIN, 30));
	     
	     admin.setBorder(bored);
	     librarian.setBorder(bored);
	     back.setBorder(bored);
	     
	     background.add(admin);
	     background.add(librarian);
	     background.add(back);
	     
	     
	     admin.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  AdminLogin.main(new String[]{});
	  }
		  });
	     
	     librarian.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  LibrarianLogin.main(new String[]{});
	  }
		  });
	     
	    
	     
	     
	     back.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  WelcomePage.main(new String[]{});
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
				 Login myFrame = new Login();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}

}
