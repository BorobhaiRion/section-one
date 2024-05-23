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

public class ViewProfile1 extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel iLabel, nLabel, cLabel, eLabel,aLabel,dLabel,gLabel,bLabel,rLabel,n2Label,pLabel;
	JTextField iTF,nTF,cTF,eTF,aTF,dTF,gTF,bTF,rTF,n2TF;
	JPanel panel;
	JButton bBtn,lBtn;
	Font myFont;
	private JToggleButton button; 
	
	String pk10 = new String();
	
	String path = "user.txt";
	String content;
	String [] line = new String [1000];
	String [][] data = new String [1000][100];
	String [] temp = new String [1000];

	int  a;
	
	public ViewProfile1 (String pk)
	{
		super("View Profile");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		JLabel background;
		
		pk10 = pk;
		
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
					if (data[i][0].equals(pk10))
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
		
		iLabel = new JLabel("Customer Id: ");
		iLabel.setBounds(270, 80, 160, 80);
		iLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		iLabel.setFont(myFont);
		panel.add(iLabel);
		
		nLabel = new JLabel("Customer Name : ");
		nLabel.setBounds(270, 130, 160, 80);
		nLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		nLabel.setFont(myFont);
		panel.add(nLabel);
		
		cLabel = new JLabel("Phone No : ");
		cLabel.setBounds(270, 180, 160, 80);
		cLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		cLabel.setFont(myFont);
		panel.add(cLabel);
		
		eLabel = new JLabel("Email : ");
		eLabel.setBounds(270, 230, 160, 80);
		eLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		eLabel.setFont(myFont);
		panel.add(eLabel);
		
		
		aLabel = new JLabel("Address : ");
		aLabel.setBounds(270, 280, 160, 80);
		aLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		aLabel.setFont(myFont);
		panel.add(aLabel);
		
		
		dLabel = new JLabel("Date of Birth :");
		dLabel.setBounds(60, 450, 160, 80);
		dLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		dLabel.setFont(myFont);
		panel.add(dLabel);
		
		gLabel = new JLabel("Gender : ");
		gLabel.setBounds(60, 500, 160, 80);
		gLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		gLabel.setFont(myFont);
		panel.add(gLabel);
		
		bLabel = new JLabel("Blood Group : ");
		bLabel.setBounds(60, 550, 160, 80);
		bLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		bLabel.setFont(myFont);
		panel.add(bLabel);
		
		rLabel = new JLabel("Religion : ");
		rLabel.setBounds(430, 450, 160, 80);
		rLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		rLabel.setFont(myFont);
		panel.add(rLabel);
		
		n2Label = new JLabel("Nationality : ");
		n2Label.setBounds(430, 500, 160, 80);
		n2Label.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		n2Label.setFont(myFont);
		panel.add(n2Label);
		
		
		
		
		
		iTF = new JTextField();
		iTF.setText(data[a][1]);
		iTF.setBounds(450, 105, 180, 30);
		iTF.setEditable(false);
		panel.add(iTF);
		
		nTF = new JTextField();
		nTF.setText(data[a][3]);
		nTF.setBounds(450, 155, 180, 30);
		nTF.setEditable(false);
        panel.add(nTF);
		
		cTF = new JTextField();
		cTF.setText(data[a][4]);
		cTF.setBounds(450, 205, 180, 30);
		cTF.setEditable(false);
		panel.add(cTF);
		
		eTF = new JTextField();
		eTF.setText(data[a][5]);
		eTF.setBounds(450, 255, 180, 30);
		eTF.setEditable(false);
		panel.add(eTF);
		
		aTF = new JTextField();
		aTF.setText(data[a][6]);
		aTF.setBounds(450, 305, 180, 30);
		aTF.setEditable(false);
		panel.add(aTF);
		
		dTF = new JTextField();
		dTF.setText(data[a][7]);
		dTF.setBounds(220, 480, 180, 30);
		dTF.setEditable(false);
		panel.add(dTF);
		
		gTF = new JTextField();
		gTF.setText(data[a][8]);
		gTF.setBounds(220, 530, 180, 30);
		gTF.setEditable(false);
		panel.add(gTF);
		
		bTF = new JTextField();
		bTF.setText(data[a][9]);
		bTF.setBounds(220, 580, 180, 30);
		bTF.setEditable(false);
		panel.add(bTF);
		
		rTF = new JTextField();
		rTF.setText(data[a][10]);
		rTF.setBounds(600, 480, 120, 30);
		rTF.setEditable(false);
		panel.add(rTF);
		
		n2TF = new JTextField();
		n2TF.setText(data[a][11]);
		n2TF.setBounds(600, 530, 120, 30);
		n2TF.setEditable(false);
		panel.add(n2TF);
		
		
		
		
		bBtn = new JButton("Back");
		bBtn.setBounds(30, 650, 80, 30);
		bBtn.setForeground(Color.BLACK);
		bBtn.setBackground(Color.WHITE);
		bBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		
		panel.add(bBtn);
		
		bBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				Customer s=new Customer(pk10);
				s.setVisible(true);
				}
		});
		
		lBtn = new JButton("Logout");
		lBtn.setBounds(550, 30, 80, 30);
		lBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		lBtn.setForeground(Color.BLUE);
		this.lBtn.addActionListener(this);
		panel.add(lBtn);
		
		
		
		JLabel pLabel=new JLabel();
		pLabel.setIcon(new ImageIcon(new ImageIcon(data[a][12]).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
		pLabel.setBounds(30,115,170, 230); 
		panel.add(pLabel);
		
		
		
		this.add(panel);
	}
	
	

	public void actionPerformed(ActionEvent e)
	{	
		if (e.getSource()== lBtn)
		{
			ImageIcon a = new ImageIcon("Untitled-1.png");
			int x = JOptionPane.showOptionDialog(null,"Do you want to Logout?","Confirm Logout",JOptionPane.YES_NO_OPTION,
																			JOptionPane.QUESTION_MESSAGE, a, null,0);
			if (x == 0)
			{
				this.setVisible(false);
				new LogOut();
			}
		}
	}
	
  	  
}	