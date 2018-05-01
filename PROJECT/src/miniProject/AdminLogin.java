package miniProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class AdminLogin extends JFrame{
	AdminLogin()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JLabel head=new JLabel("ADMIN LOGIN");
	     JLabel luname=new JLabel("Username");
	     JLabel lpass=new JLabel("Password");
	     
	     JTextField tfuname=new JTextField();
	     JPasswordField tfpass=new JPasswordField();
	     
	     JButton back = new JButton("<< BACK");
	     JButton submit = new JButton("SUBMIT >>");
	     
	     background.add(head);
	     background.add(luname);
	     background.add(lpass);
	     background.add(tfuname);
	     background.add(tfpass);
	     background.add(back);
	     background.add(submit);
	     
	     
	     
	    head.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
	    head.setBounds(600, 100, 800, 200);
	     
	     luname.setBounds(500,250,400,150);
	     luname.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     lpass.setBounds(500,310,400,150);
	     lpass.setFont(new Font("Bauhaus 93", Font.BOLD, 25));
	     
	     tfuname.setBounds(700, 315, 200, 30);
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
		  //Login.main(new String[]{});
		  String n=tfuname.getText();
		  String p=String.valueOf(tfpass.getPassword());
		  if(n.equals("admin")&&p.equals("admin123")){
				AdminSuccess.main(new String[]{});
	  }
		  else{
				JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				tfuname.setText("");
				tfpass.setText("");
			}
	  }  });
	     
	     setDefaultCloseOperation(3);
	     setSize(400,400);
	     setVisible(true);
	     
	}
	
	 public static void main(String args[])
	 {
	 SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				 AdminLogin myFrame = new AdminLogin();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}

}
