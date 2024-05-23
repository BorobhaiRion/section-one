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
 

public class Customer extends JFrame
{
    ImageIcon img;
	JLabel labell,sLabel,nLabel,iLabel;
	JPanel panel;
	JButton viewBtn,resultBtn,noticeBtn,sBtn,paymentBtn,s2Btn,lBtn,bBtn,hBton,tBton,bBton,aBton,nBton,sBton;
	JLabel background,bg;
		Font myFont;
		
	String path = "user.txt";
	String content;
	String [] line = new String [1000];
	String [][] data = new String [1000][100];
	String [] temp = new String [1000];

	String pk6 = new String();
	int  a;
	
	public Customer(String pk)
	{
		super("Customer");
		this.setSize(1400, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		
		pk6 = pk;
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
					if (data[i][0].equals(pk6))
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
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		
		img = new ImageIcon("car.png");
		this.setIconImage(img.getImage());
		
		nLabel = new JLabel(data[a][3]);
		nLabel.setBounds(230, 60, 160, 80);
		nLabel.setOpaque(true);
		myFont = new Font("Arial",Font.PLAIN,16);
		nLabel.setFont(myFont);
		panel.add(nLabel);
		iLabel = new JLabel(data[a][1]);
		iLabel.setBounds(230, 110, 160, 80);
		iLabel.setOpaque(true);
		myFont = new Font("Arial",Font.PLAIN,16);
		iLabel.setFont(myFont);
		panel.add(iLabel);
		


		bBton = new JButton("BMW", new ImageIcon("bmwlogo.jpg"));
		bBton.setBounds(220, 250, 150, 150);
		bBton.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		bBton.setForeground(Color.BLUE);
		panel.add(bBton);
		bBton.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				BMW b = new BMW(pk6);
				b.setVisible(true);
				}
		});

		hBton = new JButton("HONDA", new ImageIcon("hondalogo.png"));
		hBton.setBounds(380, 250, 150, 150);
		hBton.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		hBton.setForeground(Color.BLUE);
		panel.add(hBton);
		hBton.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				FerrariRoma f = new FerrariRoma(pk6);
				f.setVisible(true);
				}
		});

		tBton = new JButton("TOYOTA", new ImageIcon("toyotalogo.png"));
		tBton.setBounds(220, 420, 150, 150);
		tBton.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		tBton.setForeground(Color.BLUE);
		panel.add(tBton);
		tBton.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				JeepCompass j = new JeepCompass(pk6);
				j.setVisible(true);
				}
		});

		aBton = new JButton("AUDI", new ImageIcon("audilogo.png"));
		aBton.setBounds(380, 420, 150, 150);
		aBton.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		aBton.setForeground(Color.BLUE);
		panel.add(aBton);
		aBton.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				LandRoverRangeRover l = new LandRoverRangeRover(pk6);
				l.setVisible(true);
				}
		});

		nBton = new JButton("TESLA", new ImageIcon("teslalogo.png"));
		nBton.setBounds(560, 250, 150, 150);
		nBton.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		nBton.setForeground(Color.BLUE);
		panel.add(nBton);
		nBton.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				TOYOTAPRIUS t = new TOYOTAPRIUS(pk6);
				t.setVisible(true);
				}
		});

		sBton = new JButton("NISSAN", new ImageIcon("nissanlogo.png"));
		sBton.setBounds(560, 420, 150, 150);
		sBton.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		sBton.setForeground(Color.BLUE);
		panel.add(sBton);
		sBton.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				NissanAltima n = new NissanAltima(pk6);
				n.setVisible(true);
				}
		});
		


		viewBtn = new JButton("View Profile");
		viewBtn.setBounds(10, 250, 100, 30);
		viewBtn.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		viewBtn.setForeground(Color.BLUE);
		panel.add(viewBtn);
		
		
		viewBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				ViewProfile1 v = new ViewProfile1(pk6);
				v.setVisible(true);
				}
		});
		
		
		resultBtn = new JButton("Transaction");
		resultBtn.setBounds(10, 300, 100, 30);
		resultBtn.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		resultBtn.setForeground(Color.BLUE);
		
		panel.add(resultBtn);
		
		resultBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				Info f=new Info(pk6);
				f.setVisible(true);
				}
		});
		
		
		
		noticeBtn = new JButton("Notice");
		noticeBtn.setBounds(10, 350, 100, 30);
		noticeBtn.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		noticeBtn.setForeground(Color.BLUE);
		panel.add(noticeBtn);
		
		noticeBtn.addActionListener(new ActionListener()
		{
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				Notice n =new Notice(pk6);
				n.setVisible(true);
				}
		});
		
		
		sBtn = new JButton("Class Schedule");
		sBtn.setBounds(10, 400, 100, 30);
		sBtn.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		sBtn.setForeground(Color.BLUE);
		panel.add(sBtn);
		sBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Schedule1 (pk6);
			}
		});
		
		paymentBtn = new JButton("Payment");
		paymentBtn.setBounds(10, 450, 100, 30);
		paymentBtn.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		paymentBtn.setForeground(Color.BLUE);
		
		panel.add(paymentBtn);
		
		paymentBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				 EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
					     Payment win = new Payment(pk6);
					     win.setVisible(true);
			            } 
				     catch (Exception e)
					    {
				          e.printStackTrace();
			            }
		            }
	            });   
				
				}
		});
		
		
		lBtn = new JButton("Logout");
		lBtn.setBounds(650, 30, 100, 30);
		lBtn.setFont(new Font("Viking Squad", Font.PLAIN, 8));
		lBtn.setForeground(Color.BLUE);
		panel.add(lBtn);
		lBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				 EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
							ImageIcon a = new ImageIcon("Untitled-1.png");
							int x = JOptionPane.showOptionDialog(null,"Are you sure you want to Logout?","Confirm Logout",JOptionPane.YES_NO_OPTION,
																							JOptionPane.QUESTION_MESSAGE, a, null,0);
							if (x == 0)
							{
								new LogOut();
							}
			            } 
				     catch (Exception e)
					    {
				          e.printStackTrace();
			            }
		            }
	            });   
				
				}
		});
			
	
		
		
		JLabel sLabel=new JLabel();
		sLabel.setIcon(new ImageIcon(new ImageIcon(data[a][12]).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
		sLabel.setBounds(30,20,150, 150); 
		panel.add(sLabel);

		bg = new JLabel((new ImageIcon("ff.jpg")));
	    bg.setBounds(00,00,1300,800);
		panel.add(bg);
	
	this.add(panel);
	}
		
}