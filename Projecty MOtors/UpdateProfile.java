import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;
import java.beans.*;
import java.io.*;
import java.nio.file.*;

public class UpdateProfile implements ActionListener, MouseListener
{
	public JFrame frame1;
	
	JRadioButton button1;
	JRadioButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	
	JTextField text;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JTextField text6;
	
	
	JComboBox button7;
	
	File f_path;
	String icon_path = new String();
	
	String MF =  new String();
	String combo =  new String();
	
	String path = "user.txt";
	String content;
	String [] line = new String [1000];
	String [][] data = new String [1000][100];
	String [] temp = new String [1000];
	
	String [] nLine = new String [100];

	String pk3 = new String();
	int  a;
	
	public void ComboBox1()
	{    
		String Bloodgrp[]= new String[] {"Select One","A+","A-","B+","B-","O+","O-","AB+","AB-"};
		button7 = new JComboBox(Bloodgrp);
		button7.setBounds(332,405,200,30);
		button7.setSelectedItem(data[a][9]);
		button7.setFont(new Font("Viking Squad", Font.PLAIN, 25));
		button7.setForeground(new Color(132, 210, 252));
		button7.setBackground(Color.WHITE);
			this.button7.addActionListener(this);
			this.button7.addMouseListener(this);
	}
	
	public UpdateProfile (String pk)
	{
		pk3 = pk;
		frame1 = new JFrame("Update Profile");
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
					if (data[i][0].equals(pk3))
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
		
			JLabel label = new JLabel("Name :");
				label.setBounds(263,100,59,40);
				label.setFont(new Font("Viking Squad", Font.PLAIN, 25));
			
			JLabel label1 = new JLabel("Phone :");
				label1.setBounds(254,150,68,40);
				label1.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label2 = new JLabel("Email :");
				label2.setBounds(262,200,60,40);
				label2.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label3 = new JLabel("Address :");
				label3.setBounds(231,250,91,40);
				label3.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label4 = new JLabel("Date of Birth :");
				label4.setBounds(180,300,142,40);
				label4.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label5 = new JLabel("Gender :");
				label5.setBounds(243,350,79,40);
				label5.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label6 = new JLabel("Blood Group :");
				label6.setBounds(188,400,134,40);
				label6.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label7 = new JLabel("Religion :");
				label7.setBounds(236,450,86,40);
				label7.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label8 = new JLabel("Nationality :");
				label8.setBounds(203,500,119,40);
				label8.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label9 = new JLabel("Upload Photo :");
				label9.setBounds(176,550,146,40);
				label9.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label10 = new JLabel();
				label10.setBounds(0,0,786,763);
				label10.setOpaque(true);
				label10.setBackground(new Color(132, 210, 252));
	
				text = new JTextField (data[a][3]);
					text.setBounds(332,105,200,30);
					
				text1 = new JTextField (data[a][4]);
					text1.setBounds(332,155,200,30);
					
				text2 = new JTextField (data[a][5]);
					text2.setBounds(332,205,200,30);
					
				text3 = new JTextField (data[a][6]);
					text3.setBounds(332,255,200,30);
					
				text4 = new JTextField (data[a][7]);
					text4.setBounds(332,305,200,30);
					
				text5 = new JTextField (data[a][10]);
					text5.setBounds(332,455,200,30);
					
				text6 = new JTextField (data[a][11]);
					text6.setBounds(332,505,200,30);
					
			
					ComboBox1();
					
				
					button1 = new JRadioButton("Male");
						button1.setBounds(332,355,80,30);
						button1.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button1.setForeground(new Color(132, 210, 252));
						button1.setBackground(Color.WHITE);
							this.button1.addActionListener(this);
							this.button1.addMouseListener(this);
							
					button2 = new JRadioButton("Female");
						button2.setBounds(422,355,100,30);
						button2.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button2.setForeground(new Color(132, 210, 252));
						button2.setBackground(Color.WHITE);
							this.button2.addActionListener(this);
							this.button2.addMouseListener(this);
							
					button3 = new JButton();
						button3.setText("Upload Photo");
						button3.setBounds(332,555,200,30);
						button3.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button3.setForeground(new Color(132, 210, 252));
						button3.setBackground(Color.WHITE);
						button3.setFocusable(false);
							this.button3.addActionListener(this);
							this.button3.addMouseListener(this);
					
					button4 = new JButton();
						button4.setText("Back");
						button4.setBounds(20,650,80,30);
						button4.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button4.setForeground(Color.BLACK);
						button4.setBackground(Color.WHITE);
						
							this.button4.addActionListener(this);
							this.button4.addMouseListener(this);
					
					button5 = new JButton();
						button5.setText("LogOut");
						button5.setBounds(664,20,100,30);
						button5.setFont(new Font("Viking Squad", Font.PLAIN, 20));
						button5.setForeground(new Color(132, 210, 252));
						button5.setBackground(Color.WHITE);
							this.button5.addActionListener(this);
							this.button5.addMouseListener(this);
							
					button6 = new JButton("Update");
						button6.setBounds(338,605,104,30);
						button6.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button6.setForeground(new Color(132, 210, 252));
						button6.setBackground(Color.WHITE);
							this.button6.addActionListener(this);
							this.button6.addMouseListener(this);
							
								if(data[a][8].equals("Male"))
								{
									button1.setSelected(true);
								}
								else if(data[a][8].equals("Female"))
								{
									button2.setSelected(true);
								}
				/*************************************/
				
					/****************** setting icon *****************/
						ImageIcon icon = new ImageIcon("icon.png");
						frame1.setIconImage(icon.getImage());
					/******************************************/
						
		
		/********* adding to frame1 ********/
		frame1.add(label);
		frame1.add(label1);
		frame1.add(label2);
		frame1.add(label3);
		frame1.add(label4);
		frame1.add(label5);
		frame1.add(label6);
		frame1.add(label7);
		frame1.add(label8);
		frame1.add(label9);
		
		frame1.add(button1);
		frame1.add(button2);
		frame1.add(button3);
		frame1.add(button4);
		frame1.add(button5);
		frame1.add(button7);
		frame1.add(button6);
		
		frame1.add(text);
		frame1.add(text1);
		frame1.add(text2);
		frame1.add(text3);
		frame1.add(text4);
		frame1.add(text5);
		frame1.add(text6);
		//frame1.add(text7);
		frame1.add(label10);
		

		//frame1.add(dc);
		/*********************************/
		
		frame1.setSize(800, 800);
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
		else if(me.getSource() == button7)
		{
			button7.setBackground(Color.WHITE);
			button7.setForeground(new Color(132, 210, 252));
		}
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == button1)
		{
			button1.setBackground(new Color(213, 53, 110));
			button1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button2)
		{
			button2.setBackground(new Color(213, 53, 110));
			button2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button3)
		{
			button3.setBackground(new Color(213, 53, 110));
			button3.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button4)
		{
			button4.setBackground(Color.RED);
			button4.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button5)
		{
			button5.setBackground(Color.RED);
			button5.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button6)
		{
			button6.setBackground(new Color(213, 53, 110));
			button6.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button7)
		{
			button7.setBackground(new Color(213, 53, 110));
			button7.setForeground(Color.WHITE);
		}
	}
	
	public  void write()
	{
		try 
		{
			File file = new File("user.txt");
			if (!file.exists()) 
			{
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file);
			PrintWriter pw = new PrintWriter(writer);
			for (int i = 0; i < 100; i++) 
			{
				if(nLine [i] == null)
				{
					break;
				}
				else
				{
					pw.print(nLine [i] + ",");
				}
			}
			pw.close();
			writer.close();
		}  
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button6)
		{
			if (text.getText().equals("")||text1.getText().equals("")||text2.getText().equals("")||text3.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please Fill Complete Information");
			}
			else
			{
				data[a][0] = data[a][0];
				data[a][1] = data[a][1];
				data[a][2] = data[a][2];
		    	data[a][3] = text.getText();
				data[a][4] = text1.getText();
				data[a][5] = text2.getText();
				data[a][6] = text3.getText();
				data[a][7] = text4.getText();
				data[a][8] = MF;
				data[a][9] = combo;
				data[a][10] = text5.getText();
				data[a][11] = text6.getText(); 
				data[a][12] = icon_path;
				data[a][13] = data[a][13];
				data[a][14] = data[a][14];
				
				
				for(int i = 0; i < 100; i++)
				{
					for(int j = 0; j < 100; j++)
					{
						if(data[i][j] == null)
						{
							break;
						}
						else if(j == 0)
						{
							nLine [i] = data[i][j];
						}
						else if(0<j)
						{
							nLine [i] = nLine [i] + "  " + data[i][j];
						}
					}
				}
				this.write();
				JOptionPane.showMessageDialog(null,"Saved Successfully");
		    }
		}
		
		else if (e.getSource() == button3)
		{
			JFileChooser f_upload = new JFileChooser();
			int i = f_upload.showOpenDialog(null);
			
			if (i == JFileChooser.APPROVE_OPTION)
			{
				f_path = new File(f_upload.getSelectedFile().getAbsolutePath());
				icon_path = f_path.toString();
			}	
		}
		
		else if (e.getSource()== button4)
		{
			frame1.setVisible(false);
			new ViewProfile(pk3);
		}
		
		else if (e.getSource()== button5)
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
		
		else if (e.getSource()== button1)
		{
			button2.setSelected(false);
			MF = "Male";
			
		}
		
		else if (e.getSource()== button2)
		{
			button1.setSelected(false);
			MF = "Female";
		}
		
		combo = button7.getSelectedItem().toString();
		
	}
}