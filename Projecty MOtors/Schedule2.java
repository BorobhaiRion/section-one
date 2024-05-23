import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.text.*;  
import java.util.*; 
import java.io.*;   
import java.nio.*;  
  
public class Schedule2  implements ActionListener /*, MouseListener*/ {  

	
	JFrame f= new JFrame();	
	JLabel header;
	int i;

	String s1= new String();
	String s2= new String();
	String s3= new String();
	String s4= new String();
	String s5= new String();
	String s6= new String();
	String s7= new String();
	String s8= new String();
	String s9= new String();
	String s10= new String();
	String s11= new String();
	String s12= new String();
	String s13= new String();
	String s14= new String();
	String s15= new String();
	String s16= new String();
	String s17= new String();
	String s18= new String();
	
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JLabel l6 = new JLabel();
	JLabel l7 = new JLabel();
	JLabel l8 = new JLabel();
	JLabel l9 = new JLabel();
	JLabel l10 = new JLabel();
	JLabel l11 = new JLabel();
	JLabel l12 = new JLabel();
	JLabel l13 = new JLabel();
	JLabel l14 = new JLabel();
	JLabel l15 = new JLabel();
	JLabel l16 = new JLabel();
	JLabel l17 = new JLabel();
	JLabel l18 = new JLabel();
	
	
	private static JDialog d;
    JButton  b,b1,b11;
    
	

	Schedule2() {  
        f.setTitle("Schedule");  
        f.setLayout(null); 
		
		
		header =new JLabel("Class Schedule");  	
		header.setBounds(225,30,270,60);
		header.setFont(new Font("Arial", Font.PLAIN, 36));		
		f.add(header);
		
		
		try{
			File file = new File("sc.txt");
			Scanner s=new Scanner(file); 
			while(s.hasNext()){
			s1=s.next();
			s2=s.next();
			s3=s.next();
			s4=s.next();
			s5=s.next();
			s6=s.next();
			s7=s.next();
			s8=s.next();
			s9=s.next();
			s10=s.next();
			s11=s.next();
			s12=s.next();
			s13=s.next();
			s14=s.next();
			s15=s.next();
			s16=s.next();
			s17=s.next();
			s18=s.next();
			}
		s.close();
		}
		
		catch(Exception e)
		{System.out.println(e);}
		
		
		b = new JButton("Log out");  
        b.setBounds(664,20,110,30); 
		b.setBackground(Color.WHITE);
		this.b.addActionListener(this);
		f.add(b);
		
		
		b1  = new  JButton("Update");
		b1.setBounds(325,715,100,30);
		b1.setBackground(Color.WHITE);
		this.b1.addActionListener(this);
		f.add(b1);
		
		
		b11 = new JButton("Back");  
        b11.setBounds(20,650, 80,30); 
		b11.setBackground(Color.WHITE);
		b11.setForeground(Color.BLACK);
		this.b11.addActionListener(this);
		f.add(b11);
		
	
		Color c1 = new Color(51,153,255); 
		JLabel b2 = new JLabel("         Time");  
        b2.setBounds(25,140, 117,30);
		b2.setOpaque(true);
		b2.setBackground(c1);
		f.add(b2);
		
		JLabel b3 = new JLabel("         Sunday");  
        b3.setBounds(147,140, 117,30); 
		b3.setOpaque(true);
		b3.setBackground(c1);
		f.add(b3);
		
		JLabel b4 = new JLabel("        Monday");  
        b4.setBounds(269,140, 117,30); 
		b4.setOpaque(true);
		b4.setBackground(c1);
		f.add(b4);
		
		JLabel b5 = new JLabel("     Tuesday");  
        b5.setBounds(391,140, 117,30); 
		b5.setOpaque(true);
		b5.setBackground(c1);
		f.add(b5);
		
		JLabel b6 = new JLabel("      Wednesday");  
        b6.setBounds(513,140, 117,30); 
		b6.setOpaque(true);
		b6.setBackground(c1);
		f.add(b6);
		
		JLabel b7 = new JLabel("          Thursday");  
        b7.setBounds(635,140, 117,30); 
		b7.setOpaque(true);
		b7.setBackground(c1);
		f.add(b7);
		
		
		l1.setText(s1);
		l1.setBounds(35,175,117,50);
		f.add(l1);
		
		l2.setText(s2);
		l2.setBounds(157,175,117,50);
		f.add(l2);
		
		l3.setText(s3);
		l3.setBounds(279,175,117,50);
		f.add(l3);
		
		l4.setText(s4);
		l4.setBounds(401,175,117,50);
		f.add(l4);
		
		l5.setText(s5);
		l5.setBounds(523,175,117,50);
		f.add(l5);
		
		l6.setText(s6);
		l6.setBounds(645,175,117,50);
		f.add(l6);
		
		l7.setText(s7);
		l7.setBounds(35,230,117,50);
		f.add(l7);
		
		l8.setText(s8);
		l8.setBounds(157,230,117,50);
		f.add(l8);
		
		l9.setText(s9);
		l9.setBounds(279,230,117,50);
		f.add(l9);
		
		l10.setText(s10);
		l10.setBounds(401,230,117,50);
		f.add(l10);
		
		l11.setText(s11);
		l11.setBounds(523,230,117,50);
		f.add(l11);
		
		l12.setText(s12);
		l12.setBounds(645,230,117,50);
		f.add(l12);
		
		l13.setText(s13);
		l13.setBounds(35,285,117,50);
		f.add(l13);
		
		l14.setText(s14);
		l14.setBounds(157,285,117,50);
		f.add(l14);
		
		l15.setText(s15);
		l15.setBounds(279,285,117,50);
		f.add(l15);
		
		l16.setText(s16);
		l16.setBounds(401,285,117,50);
		f.add(l16);
		
		l17.setText(s17);
		l17.setBounds(523,285,117,50);
		f.add(l17);
		
		l18.setText(s18);
		l18.setBounds(645,285,117,50);
		f.add(l18);
		
		
		
		
		
		
		Color c2 = new Color(51,204,255); 
		
		JLabel b12 = new JLabel(); 
        b12.setBounds(25,170, 117,530);
		b12.setOpaque(true);
		b12.setBackground(c2);
		f.add(b12);
		
		JLabel b13 = new JLabel();
		b13.setBounds(147,170, 117,530); 
		b13.setOpaque(true);
		b13.setBackground(c2);
		f.add(b13);
		f.add(b13);
        
		
		JLabel b14 = new JLabel();  
        b14.setBounds(269,170, 117,530); 
		b14.setOpaque(true);
		b14.setBackground(c2);
		f.add(b14);
		
		JLabel b15 = new JLabel();  
        b15.setBounds(391,170, 117,530); 
		b15.setOpaque(true);
		b15.setBackground(c2);
		f.add(b15);
		
		JLabel b16 = new JLabel();  
        b16.setBounds(513,170, 117,530); 
		b16.setOpaque(true);
		b16.setBackground(c2);
		f.add(b16);
		
		JLabel b17 = new JLabel();  
        b17.setBounds(635,170, 117,530); 
		b17.setOpaque(true);
		b17.setBackground(c2);
		f.add(b17);
		
		
		
	
        f.setSize(800, 800);
		f.setLocationRelativeTo(null);		
        f.setVisible(true);
		f.setBackground(Color.WHITE);
		
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("car.png");
		f.setIconImage(icon);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
    }  
    public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1)
		{
			f.setVisible(false);
			EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
					     Update win = new Update();
					     win.read();
					     win.setVisible(true);
			            } 
				     catch (Exception e)
					    {
				          e.printStackTrace();
			            }
		            }
	            });
		}
		
		else if (e.getSource() == b11)
		{
			f.setVisible(false);
			Admin a = new Admin ();
		}
		
		else if (e.getSource() == b)
		{
			f.setVisible(false);
			new LogOut();
		}
		
	}	
}  