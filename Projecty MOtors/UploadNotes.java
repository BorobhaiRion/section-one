import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class UploadNotes implements ActionListener, MouseListener
{
	public JFrame frame;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JComboBox button1;
	JComboBox button2;
	
	File f_path;

	String pk4 = new String();
	
	public void ComboBox1()
	{    
		String Class[]= new String[] {"Select Class","S","E","D","A","R"};
		button1 = new JComboBox(Class);
		button1.setBounds(292,290,200,40);
		button1.setFont(new Font("Viking Squad", Font.PLAIN, 25));
		button1.setForeground(new Color(132, 210, 252));
		button1.setBackground(Color.WHITE);
			this.button1.addMouseListener(this);
	}
	
	public void ComboBox2()
	{    
		String Section[]= new String[] {"Select type","suv","semi-suv","cruise","hybrid"};
		button2 = new JComboBox(Section);
		button2.setBounds(292,340,200,40);
		button2.setFont(new Font("Viking Squad", Font.PLAIN, 25));
		button2.setForeground(new Color(132, 210, 252));
		button2.setBackground(Color.WHITE);
			this.button2.addMouseListener(this);
	}
	
	public UploadNotes (String pk)
	{
		pk4 = pk;		
		frame = new JFrame("Upload type");
		frame.setLayout(null);
		
		/*********** setting labels ***********/
			JLabel label = new JLabel(new ImageIcon("uploadn.png"));
				label.setBounds(0,0,786,763);
		/***********************************/
	
			/*********** setting buttons *************/
				ComboBox1 ();
				ComboBox2 ();
				
				button3 = new JButton();
					button3.setText("Upload Notes");
					button3.setBounds(292,390,200,40);
					button3.setFont(new Font("Viking Squad", Font.PLAIN, 25));
					button3.setForeground(new Color(132, 210, 252));
					button3.setBackground(Color.WHITE);
					button3.setFocusable(false);
						this.button3.addActionListener(this);
						this.button3.addMouseListener(this);
				
				button4 = new JButton();
					button4.setText("Upload");
					button4.setBounds(292,440,200,40);
					button4.setFont(new Font("Viking Squad", Font.PLAIN, 25));
					button4.setForeground(new Color(132, 210, 252));
					button4.setBackground(Color.WHITE);
						this.button4.addActionListener(this);
						this.button4.addMouseListener(this);
				
				button5 = new JButton();
					button5.setText("Back");
					button5.setBounds(20,650,80,30);
					button5.setFont(new Font("Viking Squad", Font.PLAIN, 25));
					button5.setForeground(Color.BLACK);
					button5.setBackground(Color.WHITE);
						this.button5.addActionListener(this);
						this.button5.addMouseListener(this);
				
				button6 = new JButton();
					button6.setText("LogOut");
					button6.setBounds(664,20,100,30);
					button6.setFont(new Font("Viking Squad", Font.PLAIN, 20));
					button6.setForeground(new Color(132, 210, 252));
					button6.setBackground(Color.WHITE);
						this.button6.addActionListener(this);
						this.button6.addMouseListener(this);
			/*************************************/
			
				/****************** setting icon *****************/
					ImageIcon icon = new ImageIcon("car.png");
					frame.setIconImage(icon.getImage());
				/******************************************/
		
		/********* adding to frame ********/
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(label);
		/******************************/
		
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == button1)
		{
			button1.setBackground(Color.WHITE);
			button1.setForeground(new Color(132, 210, 252));
		}
		else if(me.getSource() == button2)
		{
			button2.setBackground(Color.WHITE);
			button2.setForeground(new Color(132, 210, 252));
		}
		else if(me.getSource() == button3)
		{
			button3.setBackground(Color.WHITE);
			button3.setForeground(new Color(132, 210, 252));
		}
		else if(me.getSource() == button4)
		{
			button4.setBackground(Color.WHITE);
			button4.setForeground(new Color(132, 210, 252));
		}
		else if(me.getSource() == button5)
		{
			button5.setBackground(Color.WHITE);
			button5.setForeground(new Color(132, 210, 252));
		}
		else if(me.getSource() == button6)
		{
			button6.setBackground(Color.WHITE);
			button6.setForeground(new Color(132, 210, 252));
		}
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == button1)
		{
			button1.setBackground(new Color(53, 213, 156));
			button1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button2)
		{
			button2.setBackground(new Color(53, 213, 156));
			button2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button3)
		{
			button3.setBackground(new Color(53, 213, 156));
			button3.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button4)
		{
			button4.setBackground(new Color(53, 213, 156));
			button4.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button5)
		{
			button5.setBackground(Color.RED);
			button5.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button6)
		{
			button6.setBackground(Color.RED);
			button6.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button3)
		{
			JFileChooser f_upload = new JFileChooser();
			int i = f_upload.showOpenDialog(null);
			
			if (i == JFileChooser.APPROVE_OPTION)
			{
				f_path = new File(f_upload.getSelectedFile().getAbsolutePath());
			}	
		}
		else if (e.getSource() == button5)
		{
			new Employe(pk4);
			frame.setVisible(false);	
		}
		
		else if (e.getSource() == button4)
		{
			if(button1.getSelectedIndex() >= 1 && button2.getSelectedIndex() >= 1)
			{
				JOptionPane.showMessageDialog(null,"Successfully Uploaded.");
				System.out.println(f_path);
			}
			
			else
			{
				JOptionPane.showMessageDialog(null,"Please select Class and Section properly!");
			}
		}
		
		else if (e.getSource()== button6)
		{
			ImageIcon a = new ImageIcon("Untitled-1.png");
			int x = JOptionPane.showOptionDialog(null,"Are you sure you want to Logout?","Confirm Logout",JOptionPane.YES_NO_OPTION,
																			JOptionPane.QUESTION_MESSAGE, a, null,0);
			if (x == 0)
			{
				frame.setVisible(false);
				new LogOut();
			}
		}
		
	}	
}