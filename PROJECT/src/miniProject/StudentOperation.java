package miniProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class StudentOperation extends JFrame {
	StudentOperation()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JButton addl = new JButton("ADD STUDENTS");
	     JButton dell = new JButton("DELETE STUDENTS");  
	     JButton view = new JButton("VIEW STUDENTS"); 
	     JButton back = new JButton("<< BACK");
	     
	     addl.setBounds(600, 100, 250, 70);
	     dell.setBounds(600, 200, 250, 70);
	     view.setBounds(600, 300, 250, 70);
	     back.setBounds(20, 500, 250, 70);
	     
	     addl.setBackground(new Color(254,204,153));
	     dell.setBackground(new Color(254,204,153));
	     view.setBackground(new Color(254,204,153));
	     back.setBackground(new Color(254,204,153));
	     
	     addl.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     dell.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     view.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     back.setFont(new Font("arial", Font.PLAIN, 30));
	     
	     addl.setBorder(bored);
	     dell.setBorder(bored);
	     view.setBorder(bored);
	     back.setBorder(bored);
	     
	     background.add(addl);
	     background.add(dell);
	     background.add(view);
	     background.add(back);
	     
	     
	     addl.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  AddStudent.main(new String[]{});
	  }
		  });
	     
	     dell.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		DeleteStudent.main(new String[]{});
	  }
		  });
	     
	     view.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 ViewStudent.main(new String[]{});
	  }
		  });
	     
	    
	     
	     
	     back.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  Login.main(new String[]{});
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
				StudentOperation bo = new StudentOperation();
				    bo.setVisible(true);
				    bo.setExtendedState(bo.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}
	
}


