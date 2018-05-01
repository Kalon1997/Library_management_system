package miniProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class BookOperation extends JFrame {
	BookOperation()
	{
		JLabel background=new JLabel(new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bo.jpg"));
	     add(background);
	     
	     Icon icon = new ImageIcon("F:\\DOC\\SEM-5\\eclipse-workspace\\PROJECT\\src\\miniProject\\bla.jpg");
	     Border bored = BorderFactory.createMatteBorder(10, 10, 10, 10, icon);  //button border image
	     
	     JButton addl = new JButton("ADD BOOKS");
	     JButton dell = new JButton("DELETE BOOKS");  
	     JButton view = new JButton("VIEW BOOKS"); 
	     JButton iss = new JButton("ISSUE BOOKS"); 
	     JButton ret = new JButton("RETURN BOOKS"); 
	     JButton back = new JButton("<< BACK");
	     
	     addl.setBounds(600, 100, 250, 70);
	     dell.setBounds(600, 200, 250, 70);
	     view.setBounds(600, 300, 250, 70);
	     iss.setBounds(600, 400, 250, 70);
	     ret.setBounds(600, 500, 250, 70);
	     back.setBounds(20, 500, 250, 70);
	     
	     addl.setBackground(new Color(254,204,153));
	     dell.setBackground(new Color(254,204,153));
	     view.setBackground(new Color(254,204,153));
	     iss.setBackground(new Color(254,204,153));
	     ret.setBackground(new Color(254,204,153));
	     back.setBackground(new Color(254,204,153));
	     
	     addl.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     dell.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     view.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     iss.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     ret.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
	     back.setFont(new Font("arial", Font.PLAIN, 30));
	     
	     addl.setBorder(bored);
	     dell.setBorder(bored);
	     view.setBorder(bored);
	     iss.setBorder(bored);
	     ret.setBorder(bored);
	     back.setBorder(bored);
	     
	     background.add(addl);
	     background.add(dell);
	     background.add(view);
	     background.add(iss);
	     background.add(ret);
	     background.add(back);
	     
	     
	     addl.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  AddBook.main(new String[]{});
	  }
		  });
	     
	     dell.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		DeleteBook.main(new String[]{});
	  }
		  });
	     
	     view.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 ViewBook.main(new String[]{});
	  }
		  });
	     
	     iss.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 IssueBook.main(new String[]{});
	  }
		  });
	     
	     ret.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 ReturnBook.main(new String[]{});
	  }
		  });
	     
	     
	     back.addActionListener(new ActionListener()
		  {
	  public void actionPerformed(ActionEvent ae) {
		  //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  LibrarianSuccess.main(new String[]{});
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
				BookOperation bo = new BookOperation();
				    bo.setVisible(true);
				    bo.setExtendedState(bo.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			//new LO();
			}});
	
}
	
}


