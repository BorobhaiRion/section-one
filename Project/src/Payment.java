import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.text.*;
import java.util.*;

import javax.swing.table.DefaultTableModel;
import java.nio.file.*;

public class Payment extends JFrame implements ActionListener
{
	
	Font myFont;
	JLabel tl,bg;
	ImageIcon img;
	private JToggleButton button;
	private JButton ba,lo;
	private JTable table;
	private JScrollPane jsp;
	DefaultTableModel model;
	
	String pk8 = new String();
	
    Payment(String pk)
	{
        super("Payment");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		
		  
		pk8 = pk;
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		
		myFont = new Font("Arial", Font.PLAIN, 18);
		
		bg = new JLabel();
		bg.setBackground(new Color(51,153,255));
	    bg.setBounds(00,00,800,800);
		this.getContentPane().add(bg);
		bg.setLayout(null);
		
		jsp = new JScrollPane();
		jsp.setBounds(20,150,750,350);
		bg.add(jsp);
		
		table = new JTable();
		table.setBackground(Color.cyan);
		model = new DefaultTableModel();
		Object[] column = {"Purpose","Amount","Status"};
		model.setColumnIdentifiers(column);
		table.setModel(model);
		jsp.setViewportView(table);
	  
	    lo = new JButton();
		lo.setText("Logout");
	    lo.setBounds(510, 20, 93,23); 
		lo.addActionListener(this);
		lo.setFont(myFont);
	    bg.add(lo);
		lo.setBackground(Color.WHITE);
	    lo.setForeground(Color.BLUE);
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
		
	    ba = new JButton();
        ba.setText("Back");		
	    ba.setBounds(10, 650, 93,23);
		ba.addActionListener(this);
        ba.setFont(myFont);
		bg.add(ba);
		ba.setBackground(Color.WHITE);
	    ba.setForeground(Color.BLACK);
		ba.addActionListener(new ActionListener(){
			
			
						public void actionPerformed(ActionEvent e)
						{
							
							 EventQueue.invokeLater(new Runnable()
							{
								public void run()
								{
								 try
									{
									 Customer s = new Customer(pk8);
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
		
		tl = new JLabel("Payment History");
		tl.setBounds(250,80,350,70);
	    tl.setFont(new Font("Arial", Font.PLAIN, 28));
		tl.setForeground(Color.BLUE);
	    bg.add(tl);
		
		img = new ImageIcon("images/car.png");
		this.setIconImage(img.getImage());
	}
	
		
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ba)
		    {
				this.setVisible(false);
			    new Customer(pk8);
		    }
		else if (e.getSource() == lo)
			{
				
			}
	}	  
	
     
}  