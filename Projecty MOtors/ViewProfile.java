import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class ViewProfile implements ActionListener, MouseListener  
{
	public JFrame frame1;
	JButton button10;
	JButton button2;
	JButton button3;
	
	JTextField text;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JTextField text6;
	JTextField text7;
	JTextField text8;
	
	String path = "user.txt";
	String content;
	String [] line = new String [1000];
	String [][] data = new String [1000][100];
	String [] temp = new String [1000];

	String pk2 = new String();
	int  a;
	
	public ViewProfile (String pk)
	{
		pk2 = pk;
		frame1 = new JFrame("View Profile");
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
					if (data[i][0].equals(pk2))
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
	
			JLabel labelImage = new JLabel();
				labelImage.setIcon(new ImageIcon(new ImageIcon(data[a][12]).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
				labelImage.setBounds(317,40,150,150);
				
			JLabel labelBg = new JLabel();
				labelBg.setBounds(40,210,704,430);
				labelBg.setOpaque(true);
				labelBg.setBackground(new Color(132, 210, 252));
				
			JLabel label = new JLabel("Name :");
				label.setBounds(263,236,59,30);
				label.setFont(new Font("Viking Squad", Font.PLAIN, 18));
			
			JLabel label1 = new JLabel("Phone :");
				label1.setBounds(254,278,68,30);
				label1.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label2 = new JLabel("Email :");
				label2.setBounds(262,320,60,30);
				label2.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label3 = new JLabel("Address :");
				label3.setBounds(231,362,91,30);
				label3.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label4 = new JLabel("Date of Birth :");
				label4.setBounds(180,404,142,30);
				label4.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label5 = new JLabel("Gender :");
				label5.setBounds(243,446,79,30);
				label5.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label6 = new JLabel("Blood Group :");
				label6.setBounds(188,488,134,30);
				label6.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label7 = new JLabel("Religion :");
				label7.setBounds(236,530,86,30);
				label7.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label8 = new JLabel("Nationality :");
				label8.setBounds(203,572,119,30);
				label8.setFont(new Font("Viking Squad", Font.PLAIN, 18));
				
			JLabel label9 = new JLabel();
				label9.setBounds(0,0,786,763);
				label9.setOpaque(true);
				label9.setBackground(new Color(254, 228, 225));
		/***********************************/
	
			/*********** setting buttons *************/
				button10 = new JButton();
					button10.setText("Update");
					button10.setBounds(327,645,130,40);
					button10.setFont(new Font("Viking Squad", Font.PLAIN, 25));
					button10.setForeground(new Color(132, 210, 252));
					button10.setBackground(Color.WHITE);
						this.button10.addActionListener(this);
						this.button10.addMouseListener(this);
				
				button2 = new JButton();
					button2.setText("Back");
					button2.setBounds(20,650,80,30);
					button2.setFont(new Font("Viking Squad", Font.PLAIN, 18));
					button2.setForeground(Color.BLACK);
					button2.setBackground(Color.WHITE);
						this.button2.addActionListener(this);
						this.button2.addMouseListener(this);
				
				button3 = new JButton();
					button3.setText("LogOut");
					button3.setBounds(664,20,100,30);
					button3.setFont(new Font("Viking Squad", Font.PLAIN, 20));
					button3.setForeground(new Color(132, 210, 252));
					button3.setBackground(Color.WHITE);
						this.button3.addActionListener(this);
						this.button3.addMouseListener(this);
			/*************************************/
			
				/****************** setting icon *****************/
					ImageIcon icon = new ImageIcon("car.png");
					frame1.setIconImage(icon.getImage());
				/******************************************/
				
					/*********** setting Textfield *************/
						text = new JTextField ();
							text.setBounds(332,236,200,30);
							text.setText(data[a][3]);
							text.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text.setEditable(false);
							
						text1 = new JTextField ();
							text1.setBounds(332,278,200,30);
							text1.setText(data[a][4]);
							text1.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text1.setEditable(false);
							
						text2 = new JTextField ();
							text2.setBounds(332,320,200,30);
							text2.setText(data[a][5]);
							text2.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text2.setEditable(false);
							
						text3 = new JTextField ();
							text3.setBounds(332,362,200,30);
							text3.setText(data[a][6]);
							text3.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text3.setEditable(false);
							
						text4 = new JTextField ();
							text4.setBounds(332,404,200,30);
							text4.setText(data[a][7]);
							text4.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text4.setEditable(false);
							
						text5 = new JTextField ();
							text5.setBounds(332,446,200,30);
							text5.setText(data[a][8]);
							text5.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text5.setEditable(false);
							
						text6 = new JTextField ();
							text6.setBounds(332,488,200,30);
							text6.setText(data[a][9]);
							text6.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text6.setEditable(false);
							
						text7 = new JTextField ();
							text7.setBounds(332,530,200,30);
							text7.setText(data[a][10]);
							text7.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text7.setEditable(false);
							
						text8 = new JTextField ();
							text8.setBounds(332,572,200,30);
							text8.setText(data[a][11]);
							text8.setFont(new Font("Gotham Book", Font.PLAIN, 15));
							text8.setEditable(false);
					/******************************************/
						
		/********* adding to frame1 ********/
		
		frame1.add(text);
		frame1.add(text1);
		frame1.add(text2);
		frame1.add(text3);
		frame1.add(text4);
		frame1.add(text5);
		frame1.add(text6);
		frame1.add(text7);
		frame1.add(text8);
		
		frame1.add(labelImage);
		frame1.add(label);
		frame1.add(label1);
		frame1.add(label2);
		frame1.add(label3);
		frame1.add(label4);
		frame1.add(label5);
		frame1.add(label6);
		frame1.add(label7);
		frame1.add(label8);
		frame1.add(labelBg);
		
		frame1.add(button10);
		frame1.add(button2);
		frame1.add(button3);
		frame1.add(label9);
		/******************************/
		
		frame1.setSize(800, 800);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setResizable(false);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == button10)
		{
			button10.setBackground(Color.WHITE);
			button10.setForeground(new Color(132, 210, 252));
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
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == button10)
		{
			button10.setBackground(new Color(173, 214, 204));
			button10.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button2)
		{
			button2.setBackground(Color.RED);
			button2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button3)
		{
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button2)
		{
			frame1.setVisible(false);
			new Employe(pk2);
			
		}
		
		else if (e.getSource()== button10)
		{
			new UpdateProfile(pk2);
			frame1.setVisible(false);
		}
		
		else if (e.getSource()== button3)
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