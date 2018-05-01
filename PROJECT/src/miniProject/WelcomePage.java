package miniProject;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.Border;

public class WelcomePage extends JFrame{
	WelcomePage() throws IOException
	{
		 JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     
	    
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);
	     
	     
	     JLabel l2=new JLabel("WELCOME TO OUR LIBRARY");
	     l2.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
	      JButton exit_button = new JButton("<< EXIT");
	      JButton next_button = new JButton("NEXT >>");
	     
	      //p.setLayout(null);
	      l2.setBounds(350, 200, 800, 200);
	      exit_button.setBounds(300,400,200,70);
	      next_button.setBounds(900,400,200,70);
	      
	      exit_button.setBackground(new Color(254,204,153));
	      next_button.setBackground(new Color(254,204,153));
	      exit_button.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
	      next_button.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
	      exit_button.setBorder(bored);
	      next_button.setBorder(bored);
	    
	      
	      background.add(exit_button);
	      background.add(next_button);
	      background.add(l2);
	      
	      next_button.addActionListener(new ActionListener()
	    		  {
	    	  public void actionPerformed(ActionEvent ae) {
	    		  Login.main(new String[]{});
	    	  }
	    		  });
	      
	      exit_button.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  System.exit(0);
	  }
		  });
	      
	      
	      //p.add(button);
	      //p.add(button2);
	     // getContentPane().add(p);
	      //setLayout(null);
	      setDefaultCloseOperation(3);
	      setSize(400,400);
	      setVisible(true);
			
	}
public static void main(String args[])
{
	SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
			WelcomePage myFrame;
			try {
				myFrame = new WelcomePage();
				myFrame.setVisible(true);
			    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    
			}});
	
}
}