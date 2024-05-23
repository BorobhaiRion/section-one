import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import javax.swing.*;
import java.awt.Color;  
import java.awt.Graphics;  
import java.text.*;  
import java.util.*;  


public class LogOut implements /*ItemListener,*/ActionListener
{
	JFrame f= new JFrame();
	JButton eb;
	Color c2 = new Color(51,204,255);
	JButton b;
	
	
	
	
	LogOut()
	{
		
		//change icon
		Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
		f.setIconImage(icon);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Thank you
		JLabel tl= new  JLabel("Thank You");
		tl.setBounds(270,230,200,60);
		tl.setFont(new Font("Viking Squad", Font.PLAIN, 36));
		f.add(tl);
		
		//log in button
		b = new JButton("Go to Log In page");  
        b.setBounds(200,350, 200,40);
		b.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		b.setBackground(Color.WHITE);
		this.b.addActionListener(this);
		f.add(b);
		
		//exit button
		eb = new JButton("Exit");  
        eb.setBounds(420,350, 100,40);
		eb.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		eb.setBackground(Color.WHITE);
		f.add(eb);
		this.eb.addActionListener(this);
		
		//frame
		f.setTitle("Log Out");  
        f.setLayout(null);
		f.setSize(800, 800);  
        f.setVisible(true); 
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == eb)
		{
			//f.dispose();
			System.exit(0);
		}
		else if (e.getSource() == b)
		{
			f.setVisible(false);
			new LogIn();
		}
	}
	
}

