
// THIS CLASS IS ONLY FOR REFERENCE :)
//NOT NEEDED FOR THE MINI-PROJECT

package miniProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class LO extends JFrame {
	 LO()
	{
		 {
		      //JPanel p = new JPanel();
		      JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
		     add(background);
		     
		     
		    
		     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
		     Border bored = BorderFactory.createMatteBorder(10, 5, 10, 5, icon);  //button border image
		     
		     
		     JLabel l2=new JLabel("WELCOME TO OUR LIBRARY");
		     l2.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
		      JButton button = new JButton("EXIT");
		      JButton button2 = new JButton("NEXT");
		     
		      //p.setLayout(null);
		      l2.setBounds(350, 200, 800, 200);
		      button.setBounds(300,400,200,70);
		      button2.setBounds(900,400,200,70);
		      
		      button.setBackground(new Color(254,204,153));
		      button2.setBackground(new Color(254,204,153));
		      button.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
		      button2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
		      button.setBorder(bored);
		      button2.setBorder(bored);
		    
		      
		      background.add(button);
		      background.add(button2);
		      background.add(l2);
		      
		      button2.addActionListener(new ActionListener()
		    		  {
		    	  public void actionPerformed(ActionEvent ae) {
		    		  WelcomePage.main(new String[]{});
		    	  }
		    		  });
		      
		      button.addActionListener(new ActionListener()
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
		
		
	}
	 
	 public static void main(String args[])
	 {
	 SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				 LO myFrame = new LO();
				    myFrame.setVisible(true);
				    myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}
}


