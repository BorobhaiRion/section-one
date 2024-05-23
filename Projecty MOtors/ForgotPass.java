import java.awt.EventQueue;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent.*;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import java.text.*;
import java.util.*;
import javax.swing.JToggleButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;

public class ForgotPass  implements ActionListener
{
	JFrame f= new JFrame();
	JButton b1;
	JButton sb;
	JTextField idf,pn;
	Color c2 = new Color(51,204,255);
	
	
	ForgotPass()
	{

		//back button
		b1 = new JButton("Back");  
        b1.setBounds(20,500, 80,30); 
		b1.setBackground(Color.WHITE);
		f.add(b1);
		this.b1.addActionListener(this);
		
		//change icon
		Image icon = Toolkit.getDefaultToolkit().getImage("car.png");
		f.setIconImage(icon);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//header
		JLabel l1= new JLabel("Enter the registered  ID and Phone number");
		l1.setBounds(195,150,400,50);
		l1.setFont(new Font("Viking Squad", Font.PLAIN, 18));
		f.add(l1);
		
		//ID
		JLabel idl= new JLabel(" ID");
		idl.setBounds(50,250,145,40);
		idl.setFont(new Font("Viking Squad", Font.PLAIN, 18));
		idl.setOpaque(true);
		idl.setBackground(c2);
		f.add(idl);
		
		idf = new JTextField();  
        idf.setBounds(195,250, 500,40);
		idf.setFont(new Font("Viking Squad", Font.PLAIN, 18));
		f.add(idf);
		
		//phone
		JLabel pl = new JLabel(" Phone No.");
		pl.setBounds(50,310,145,40);
		pl.setFont(new Font("Viking Squad", Font.PLAIN, 18));
		pl.setOpaque(true);
		pl.setBackground(c2);
		f.add(pl);
		
		pn = new JTextField();  
        pn.setBounds(195,310, 500,40);
		pn.setFont(new Font("Viking Squad", Font.PLAIN, 18));
		f.add(pn);
		
		//submit button
		sb = new JButton("Submit");  
        sb.setBounds(330,370, 100,40); 
		sb.setBackground(Color.WHITE);
		this.sb.addActionListener(this);
		f.add(sb);
		
		
		//frame
		f.setTitle("Recover Password");  
        f.setLayout(null);
		f.setSize(800, 800);  
        f.setVisible(true); 
		f.setResizable(false);
		f.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1)
		{
			f.setVisible(false);
			new LogIn();
		}
		else if (e.getSource() == sb)
		{
			
			if(idf.getText().equals("")||pn.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please Fill Complete Information");
			}
			
		else {
			JOptionPane.showMessageDialog(null,"If you have entered a valid ID and registered phone number you will get a OTP. \n                                                     Thank you");
			f.setVisible(false);
			new LogIn();
		}
		}
	}
}
