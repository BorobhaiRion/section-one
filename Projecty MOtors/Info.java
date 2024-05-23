import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Info extends JFrame
{
    ImageIcon img;
	JLabel bLabel,mLabel,gLabel,hLabel,aLabel,eLabel,h2Label,a2Label,m2Label,h3Label,a3Label,tLabel,bg;
	JTextField hTF,aTF,h2TF,a2TF,h3TF,a3TF,g1TF,g2TF,g3TF,g4TF,g5TF,g6TF,g7TF; 
	
	JButton lBtn,bBtn;
	Font myFont;
	JPanel panel;
	 
	String pk9 = new String();
    
    private JToggleButton button; 	
	
	public Info(String pk)
	{
		super("Sales");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		JLabel background;
		
		
		pk9 = pk;
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		
		myFont = new Font("Arial", Font.PLAIN, 28);
		bg = new JLabel(new ImageIcon("gg.jpg"));
	    bg.setBounds(00,00,1400,800);
	    this.add(bg);
		img = new ImageIcon("car.png");
		this.setIconImage(img.getImage());
		
		bLabel = new JLabel("BMW");
		bLabel.setBounds(20, 80, 100, 30);
		myFont = new Font("Arial",Font.BOLD,18);
		bLabel.setFont(myFont);
		bg.add(bLabel);
		
		mLabel = new JLabel("Model");
		mLabel.setBounds(300, 80, 100, 30);
		myFont = new Font("Arial",Font.BOLD,18);
		mLabel.setFont(myFont);
		bg.add(mLabel);
		gLabel = new JLabel("Condition");
		gLabel.setBounds(500, 80, 100, 30);
		myFont = new Font("Arial",Font.BOLD,18);
		gLabel.setFont(myFont);
		bg.add(gLabel);
		
		hLabel = new JLabel("NEW");
		hLabel.setBounds(100, 150, 100, 30);
		myFont = new Font("Arial",Font.PLAIN,16);
		hLabel.setFont(myFont);
		bg.add(hLabel);
		aLabel = new JLabel("RE-CONDITION");
		aLabel.setBounds(100, 200, 100, 30);
		myFont = new Font("Arial",Font.PLAIN,16);
		aLabel.setFont(myFont);
		bg.add(aLabel);
		eLabel = new JLabel("TOYOTA");
		eLabel.setBounds(20, 230, 100, 30);
		myFont = new Font("Arial",Font.BOLD,18);
		eLabel.setFont(myFont);
		bg.add(eLabel);
		h2Label = new JLabel("NEW");
		h2Label.setBounds(100, 260, 100, 30);
		myFont = new Font("Arial",Font.PLAIN,16);
		h2Label.setFont(myFont);
		bg.add(h2Label);
		a2Label = new JLabel("RE-CONDITION");
		a2Label.setBounds(100, 310, 100, 30);
		myFont = new Font("Arial",Font.PLAIN,16);
		a2Label.setFont(myFont);
		bg.add(a2Label);
		m2Label = new JLabel("HONDA");
		m2Label.setBounds(20, 340, 100, 30);
		myFont = new Font("Arial",Font.BOLD,18);
		m2Label.setFont(myFont);
		bg.add(m2Label);
		
		h3Label = new JLabel("NEW");
		h3Label.setBounds(100,370 , 100, 30);
		myFont = new Font("Arial",Font.PLAIN,16);
		h3Label.setFont(myFont);
		bg.add(h3Label);
		
		a3Label = new JLabel("RE-CONDITION");
		a3Label.setBounds(100, 420, 70, 30);
		myFont = new Font("Arial",Font.PLAIN,16);
		a3Label.setFont(myFont);
		bg.add(a3Label);
		tLabel = new JLabel("Total sale");
		tLabel.setBounds(450, 530, 100, 30);
		myFont = new Font("Arial",Font.BOLD,16);
		tLabel.setFont(myFont);
		bg.add(tLabel);
		
		hTF = new JTextField();
		hTF.setBounds(280, 150, 70, 30);
	
		bg.add(hTF);
		
		aTF = new JTextField();
		aTF.setBounds(280, 200, 70, 30);
        bg.add(aTF);
		
		h2TF = new JTextField();
		h2TF.setBounds(280, 260, 70, 30);
		bg.add(h2TF);
		
		a2TF = new JTextField();
		a2TF.setBounds(280, 310, 70, 30);
		bg.add(a2TF);
		
		h3TF = new JTextField();
		h3TF.setBounds(280, 370, 70, 30);
		bg.add(h3TF);
		
		a3TF = new JTextField();
		a3TF.setBounds(280, 420, 70, 30);
		bg.add(a3TF);
		
		g1TF = new JTextField();
		g1TF.setBounds(490, 150, 70, 30);
	
		bg.add(g1TF);
		
		g2TF = new JTextField();
		g2TF.setBounds(490, 200, 70, 30);
        bg.add(g2TF);
		
		g3TF = new JTextField();
		g3TF.setBounds(490, 260, 70, 30);
		bg.add(g3TF);
		
		g4TF = new JTextField();
		g4TF.setBounds(490, 310, 70, 30);
		bg.add(g4TF);
		
		g5TF = new JTextField();
		g5TF.setBounds(490, 370, 70, 30);
		bg.add(g5TF);
		
		g6TF = new JTextField();
		g6TF.setBounds(490, 420, 70, 30);
		bg.add(g6TF);
		g7TF = new JTextField();
		g7TF.setBounds(450, 570, 70, 30);
		bg.add(g7TF);
		
		bBtn = new JButton("Back");
		bBtn.setBounds(30, 650, 80, 30);
		bBtn.setForeground(Color.BLACK);
		bBtn.setBackground(Color.WHITE);
		bBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		bBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				 EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
							Customer s = new Customer(pk9);
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
		
		bg.add(bBtn);
		
		bBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				Customer s=new Customer(pk9);
				s.setVisible(true);
				}
		});
		
		lBtn = new JButton("Logout");
		lBtn.setBounds(550, 30, 80, 30);
		lBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		lBtn.setForeground(Color.BLUE);
		bg.add(lBtn);
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
		
		
		
		
		this.add(panel);
		
	} 		
		  
	
		
	
}

		
		  