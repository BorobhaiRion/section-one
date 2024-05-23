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

public class Employe implements ActionListener, MouseListener
{
	public JFrame frame1;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	
	String path = "user.txt";
	String content;
	String [] line = new String [1000];
	String [][] data = new String [1000][100];
	String [] temp = new String [1000];

	String pk1 = new String();
	String detail = new String();
	int  a;
	
	
	
	public Employe (String pk)
	{
		pk1 = pk;
		frame1 = new JFrame("Employee");
		frame1.setLayout(null);
		
		try 
		{
			content = new String(Files.readString(Paths.get(path)));
			line = content.split(",");  
			int n = line.length;
		
			for(int i = 0; i < n; i++)
			{	
				temp = line[i].split("  "); 
				int t = temp.length;
				
				for(int j = 0; j < t; j++)
				{
					data[i][j] = temp[j];
					if (data[i][0].equals(pk1))
					{
						a = i;
					}
				}	
			}	
        } 
		catch (Exception ex) 
		{
            ex.printStackTrace();
        }
		
			SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			
			String time = new String();
			String date = new String();
			
			JLabel timeLabel = new JLabel();
			JLabel dateLabel = new JLabel();
			
			timeLabel.setBounds(660,695,105,30);
			timeLabel.setFont(new Font("Viking Squad", Font.PLAIN, 15));
			timeLabel.setForeground(Color.BLACK);
			
			dateLabel.setBounds(667,715,105,30);
			dateLabel.setFont(new Font("Viking Squad", Font.PLAIN, 15));
			dateLabel.setForeground(Color.BLACK);
	
				JLabel label = new JLabel(data[a][3]);
					label.setBounds(180,130,300,20);
					label.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
				JLabel label1 = new JLabel(data[a][1]);
					label1.setBounds(180,150,300,20);
					label1.setFont(new Font("Viking Squad", Font.PLAIN, 15));
					
				JLabel label2 = new JLabel();
					label2.setIcon(new ImageIcon(new ImageIcon(data[a][12]).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
					label2.setBounds(20,20,150,150);
					
				JLabel label3 = new JLabel();
					label3.setBounds(0,0,800,800);
					label3.setOpaque(true);
					label3.setBackground(Color.BLACK);
					
				JLabel label4 = new JLabel(new ImageIcon("gg.jpg"));
					label4.setBounds(0,0,1400,800);
			
		
				
					button1 = new JButton();
						button1.setText("View Profile");
						button1.setBounds(292,290,200,40);
						button1.setFont(new Font("Viking Squad", Font.PLAIN, 15));
						button1.setForeground(new Color(132, 210, 252));
						button1.setBackground(Color.WHITE);
							this.button1.addActionListener(this);
							this.button1.addMouseListener(this);
					
					button2 = new JButton();
						button2.setText("Customer List");
						button2.setBounds(292,340,200,40);
						button2.setFont(new Font("Viking Squad", Font.PLAIN, 15));
						button2.setForeground(new Color(132, 210, 252));
						button2.setBackground(Color.WHITE);
							this.button2.addActionListener(this);
							this.button2.addMouseListener(this);
					
					button3 = new JButton();
						button3.setText("Upload Sale Files");
						button3.setBounds(292,390,200,40);
						button3.setFont(new Font("Viking Squad", Font.PLAIN, 15));
						button3.setForeground(new Color(132, 210, 252));
						button3.setBackground(Color.WHITE);
							this.button3.addActionListener(this);
							this.button3.addMouseListener(this);
					
					button4 = new JButton();
						button4.setText("Work Hour Schedule");
						button4.setBounds(292,440,200,40);
						button4.setFont(new Font("Viking Squad", Font.PLAIN, 15));
						button4.setForeground(new Color(132, 210, 252));
						button4.setBackground(Color.WHITE);
							this.button4.addActionListener(this);
							this.button4.addMouseListener(this);
					
					button5 = new JButton();
						button5.setText("Back");
						button5.setBounds(20,650,80,30);
						button5.setFont(new Font("Viking Squad", Font.PLAIN, 15));
						button5.setForeground(new Color(132, 210, 252));
						button5.setBackground(Color.WHITE);
						button5.setForeground(Color.BLACK);
							this.button5.addActionListener(this);
							this.button5.addMouseListener(this);
					
					button6 = new JButton();
						button6.setText("LogOut");
						button6.setBounds(664,20,100,30);
						button6.setFont(new Font("Viking Squad", Font.PLAIN, 16));
						button6.setForeground(new Color(132, 210, 252));
						button6.setBackground(Color.WHITE);
							this.button6.addActionListener(this);
							this.button6.addMouseListener(this);
			
						ImageIcon icon = new ImageIcon("car.png");
						frame1.setIconImage(icon.getImage());
			
		frame1.add(label);
		frame1.add(label1);
		frame1.add(label2);
		frame1.add(button1);
		frame1.add(button2);
		frame1.add(button3);
		frame1.add(button4);
		frame1.add(button5);
		frame1.add(button6);
		frame1.add(label4);
		
		
		frame1.setSize(1400, 800);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.WHITE);
		frame1.setVisible(true);
		frame1.setResizable(false);
		
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
			frame1.setVisible(false);
			new UploadNotes(pk1);	
		}
		
		else if (e.getSource()== button1)
		{
			frame1.setVisible(false);
			new ViewProfile (pk1);
			
		}
		
			else if (e.getSource() == button2)
		       {
			     frame1.setVisible(false);
			     new Customers(pk1);
		       }
		
		else if (e.getSource()== button4)
		{
			frame1.setVisible(false);
			new Schedule (pk1);
			
		}
		
		else if (e.getSource()== button5)
		{
			ImageIcon a = new ImageIcon("Untitled-1.png");
			int x = JOptionPane.showOptionDialog(null,"Do you want to Logout?","Confirm Logout",JOptionPane.YES_NO_OPTION,
																			JOptionPane.QUESTION_MESSAGE, a, null,0);
			if (x == 0)
			{
				frame1.setVisible(false);
				new LogOut();
			}
		}
		
		else if (e.getSource()== button6)
		{
			ImageIcon a = new ImageIcon("Untitled-1.png");
			int x = JOptionPane.showOptionDialog(null,"Are you sure you want to Logout?","Confirm Logout",JOptionPane.YES_NO_OPTION,
																			JOptionPane.QUESTION_MESSAGE, a, null,0);
			if (x == 0)
			{
				frame1.setVisible(false);
				new LogOut();
			}
		}
	} 
	
}



