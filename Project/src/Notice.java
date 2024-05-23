import javax.swing.*;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Notice extends JFrame //implements ActionListener //ItemListener,   
{
	//public JFrame frame1;
	Font myFont;
	JButton up;
	JButton del;
	JButton ba;
	JButton lo;
	JLabel un;
	JLabel bg;
	JLabel tit;
	JButton n1;
	JButton n2;
	JButton n3;
	JButton n4;
	ImageIcon img;
	//JToggleButton button4;
	
	String pk7 = new String();
	
	public Notice (String pk)
	{
		super("Notice");
		this.setLayout(null);
		this.setResizable(false);
		
		pk7 = pk;
		
		myFont = new Font("Arial", Font.PLAIN, 28);
		
		bg = new JLabel();
		bg.setBackground(new Color(51,153,255));
	    bg.setBounds(00,00,800,800);
	    this.add(bg);
		
					up = new JButton();
						up.setText("Update");
						up.setBounds(200,600,130,30);
						up.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						up.setForeground(Color.BLACK);
						up.setBackground(Color.WHITE);
						
						del = new JButton();
						del.setText("Delete");
						del.setBounds(500,600,130,30);
						del.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						del.setForeground(Color.BLACK);
						del.setBackground(Color.WHITE);
					
					ba = new JButton();
						ba.setText("Back");
						ba.setBounds(20,650,100,35);
						//ba.addActionListener(this);
						ba.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						ba.setForeground(Color.BLACK);
						ba.setBackground(Color.WHITE);
						ba.addActionListener(new ActionListener(){
			
			
						public void actionPerformed(ActionEvent e)
						{
							
							 EventQueue.invokeLater(new Runnable()
							{
								public void run()
								{
								 try
									{
									 Customer s = new Customer(pk7);
									 
									 s.setVisible(true);
									} 
								 catch (Exception e)
									{
									  e.printStackTrace();
									}
								}
							});   
							
							}
					});
					    
					
					lo = new JButton();
						lo.setText("LogOut");
						lo.setBounds(544,20,100,30);
						lo.setFont(new Font("Viking Squad", Font.PLAIN, 20));
						lo.setForeground(Color.RED);
						lo.setBackground(Color.WHITE);
						lo.addActionListener(new ActionListener(){
			
			
						public void actionPerformed(ActionEvent e)
						{
							
							 EventQueue.invokeLater(new Runnable()
							{
								public void run()
								{
								 try
									{
									 new LogOut();
									} 
								 catch (Exception e)
									{
									  e.printStackTrace();
									}
								}
							});   
							
							}
					});
						
					JLabel un = new JLabel();
					un.setBounds(40,150,704,430);
					un.setOpaque(true);
					un.setBackground(Color.cyan);
					
					tit = new JLabel();
					tit.setText("Latest Notices");
					tit.setBounds(300,70,704,110);
					tit.setFont(new Font("Viking Squad", Font.PLAIN, 30));
					tit.setForeground(Color.BLUE);
					
					tit.setOpaque(true);
					
					
					n1 = new JButton();
					n1.setBounds(20,20,600,40);
					n1.setText("Holiday due to National Mourning Day, 2022");
				    n1.setOpaque(true);
					n1.setBackground(Color.GRAY);
					n1.setForeground(Color.BLACK);
					
					n2 = new JButton();
					n2.setBounds(20,70,600,40);
					n2.setText("Black friday sales plan.");
				    n2.setOpaque(true);
					n2.setBackground(Color.GRAY);
					n2.setForeground(Color.BLACK);
					
					n3 = new JButton();
					n3.setBounds(20,120,600,40);
					n3.setText("EID-Bonus Distribution");
				    n3.setOpaque(true);
					n3.setBackground(Color.GRAY);
					n3.setForeground(Color.BLACK);
					
					n4 = new JButton();
					n4.setBounds(20,170,600,40);
					n4.setText("New Work Hour List");
				    n4.setOpaque(true);
					n4.setBackground(Color.GRAY);
					n4.setForeground(Color.BLACK);
					
					img = new ImageIcon("images/car.png");
		            this.setIconImage(img.getImage());
				
		bg.add(up);
		bg.add(ba);
		bg.add(lo);
		bg.add(un);
		bg.add(del);
        bg.add(tit);
		un.add(n1);
		un.add(n2);
		un.add(n3);
		un.add(n4);
		
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}