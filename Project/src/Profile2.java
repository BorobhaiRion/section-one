import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;

public class Profile2 extends JFrame implements ActionListener  {
	
	Font myFont;
	JButton up;
	JButton ba;
	JButton lo;
	JLabel un;
	JLabel bg;
	JLabel pp;
	ImageIcon img;
	
	JTextField text;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JTextField text6;
	JTextField text7;
	JTextField text8;
	
	String pk= new String();

    	public Profile2 (String pk800)
	{  
        super("Profile");
		pk800=pk;
		this.setLayout(null);
		this.setResizable(false);
		
		myFont = new Font("Arial", Font.PLAIN, 18);
		
		bg =  new JLabel(new ImageIcon("images/gg.jpg"));
	    bg.setBounds(00,00,1400,800);
	    this.add(bg);
		
					up = new JButton();
						up.setText("Update");
						up.setBounds(300,390,120, 30);
						up.setFont(new Font("Viking Squad", Font.PLAIN, 18));
						up.setForeground(Color.BLUE);
						up.setBackground(Color.WHITE);
					
					ba = new JButton();
						ba.setText("Back");
						ba.setBounds(10, 650, 93,23);
						ba.addActionListener(this);
						ba.setFont(new Font("Viking Squad", Font.PLAIN, 18));
						ba.setForeground(Color.BLUE);
						ba.setBackground(Color.WHITE);
					    
					
					lo = new JButton();
						lo.setText("LogOut");
						lo.setBounds(660, 20, 120, 30);
						lo.setFont(new Font("Viking Squad", Font.PLAIN, 18));
						lo.addActionListener(this);
						lo.setForeground(Color.BLACK);
						lo.setBackground(Color.WHITE);
						
					un = new JLabel();
					un.setBounds(40,200,704,450);
					un.setOpaque(true);
					un.setBackground(new Color(160,140,180));
					
					pp = new JLabel(new ImageIcon("images/z.png"));
	                pp.setBounds(325,20,150,170);
              	    bg.add(pp);
					
					img = new ImageIcon("images/car.png");
		            this.setIconImage(img.getImage());
					
		
		bg.add(ba);
		bg.add(lo);
		bg.add(un);
		un.add(up);
		
		                text = new JTextField ();
							text.setBounds(269,20,200,30);
							text.setText("Zarin Anjum");
							text.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text.setEditable(false);
							
						text1 = new JTextField ();
							text1.setBounds(269,60,200,30);
							text1.setText("0179085****");
							text1.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text1.setEditable(false);
							
						text2 = new JTextField ();
							text2.setBounds(269,100,200,30);
							text2.setText("zarin123@gmail.com");
							text2.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text2.setEditable(false);
							
						text3 = new JTextField ();
							text3.setBounds(269,140,200,30);
							text3.setText("Bashundhara, Dhaka");
							text3.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text3.setEditable(false);
							
						text4 = new JTextField ();
							text4.setBounds(269,180,200,30);
							text4.setText("08-10-1999");
							text4.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text4.setEditable(false);
							
						text5 = new JTextField ();
							text5.setBounds(269,220,200,30);
							text5.setText("Female");
							text5.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text5.setEditable(false);
							
						text6 = new JTextField ();
							text6.setBounds(269,260,200,30);
							text6.setText("B+");
							text6.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text6.setEditable(false);
							
						text7 = new JTextField ();
							text7.setBounds(269,300,200,30);
							text7.setText("Islam");
							text7.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text7.setEditable(false);
							
						text8 = new JTextField ();
							text8.setBounds(269,340,200,30);
							text8.setText("Bangladeshi");
							text8.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text8.setEditable(false);
							
		un.add(text);
		un.add(text1);
		un.add(text2);
		un.add(text3);
		un.add(text4);
		un.add(text5);
		un.add(text6);
		un.add(text7);
		un.add(text8);
		
		
		    JLabel label = new JLabel("Name :");
				label.setBounds(200,20,59,30);
				label.setFont(new Font("Viking Squad", Font.PLAIN, 18));
			
			JLabel label1 = new JLabel("Phone :");
				label1.setBounds(191,60,70,30);
				label1.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label2 = new JLabel("Email :");
				label2.setBounds(199,100,60,30);
				label2.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label3 = new JLabel("Address :");
				label3.setBounds(168,140,91,30);
				label3.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label4 = new JLabel("Date of Birth :");
				label4.setBounds(117,180,160,30);
				label4.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label5 = new JLabel("Gender :");
				label5.setBounds(180,220,79,30);
				label5.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label6 = new JLabel("Blood Group :");
				label6.setBounds(125,260,150,30);
				label6.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label7 = new JLabel("Religion :");
				label7.setBounds(173,300,100,30);
				label7.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label8 = new JLabel("Nationality :");
				label8.setBounds(140,340,130,30);
				label8.setFont(new Font("Viking Squad", Font.PLAIN, 18));

  
        un.add(label);
		un.add(label1);
		un.add(label2);
		un.add(label3);
		un.add(label4);
		un.add(label5);
		un.add(label6);
		un.add(label7);
		un.add(label8);
  
				
		
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
    
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ba)
		{
			new Manager(pk);
			this.setVisible(false);
		}
		else if (e.getSource() == lo)
			   {
				this.setVisible(false);
				new LogOut();
			   }
	}
	
}