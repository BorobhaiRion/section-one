import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;  

public class Admin extends JFrame implements MouseListener,ActionListener
{
	
	Font myFont;
	JButton pr;
	JButton te;
	JButton st;
	JButton no;
	JButton lo;
	JButton ph;
	JButton sch;
	JButton exitBtn;
	JLabel pp;
	JLabel bg;
	JLabel nm;
	JLabel nm2;
    ImageIcon img;
		
		
	public Admin()
	{
		super("Admin");
		
		
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
	
		myFont = new Font("Viking Squad", Font.PLAIN, 28);
		
		bg = new JLabel((new ImageIcon("gg.jpg")));
		bg.setBackground(new Color(51,153,255));
	    bg.setBounds(00,00,1400,800);
	    this.add(bg);
		
		pr = new JButton("Profile");  
	    pr.setBounds(300, 230, 200,40);
		pr.addMouseListener(this);
		pr.addActionListener(this);
        pr.setFont(myFont);		
	    bg.add(pr); 
	    pr.setBackground(Color.BLACK);
		pr.setForeground(Color.WHITE);
	  
	    te = new JButton("Employees"); 
	    te.setBounds(300, 280, 200,40); 
		te.addMouseListener(this);
		te.addActionListener(this);
		te.setFont(myFont);
	    bg.add(te);
		te.setBackground(Color.BLACK);
	    te.setForeground(Color.WHITE);
		
	    st = new JButton("Customer"); 
	    st.setBounds(300, 330, 200,40);
		st.addMouseListener(this);
		st.addActionListener(this);
        st.setFont(myFont);
		bg.add(st);
		st.setBackground(Color.BLACK);
	    st.setForeground(Color.WHITE);
		
	    no = new JButton("Notice");
        no.setBounds(300, 380, 200,40);
		no.addMouseListener(this);
		no.addActionListener(this);
        no.setFont(myFont);
		bg.add(no);
		no.setBackground(Color.BLACK);
	    no.setForeground(Color.WHITE);
		
		ph = new JButton("Payment");
        ph.setBounds(300, 430, 200,40);
		ph.addMouseListener(this);
		ph.addActionListener(this);
        ph.setFont(myFont);
		ph.setBackground(Color.BLACK);
	    ph.setForeground(Color.WHITE);
		bg.add(ph);
		
		sch = new JButton("Schedule");
        sch.setBounds(300, 480, 200,40);
		sch.addMouseListener(this);
		sch.addActionListener(this);
        sch.setFont(myFont);
		sch.setBackground(Color.BLACK);
	    sch.setForeground(Color.WHITE);
		bg.add(sch);
		
	    lo = new JButton("Logout");
        lo.setBounds(660, 20, 120, 30);
		lo.addMouseListener(this);
		lo.addActionListener(this);
        lo.setFont(myFont);
		bg.add(lo);
		lo.setBackground(Color.WHITE);
	    lo.setForeground(Color.BLACK);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(660,55,105,30);
		exitBtn.setFont(myFont);
		exitBtn.setBackground(Color.WHITE);
		exitBtn.setForeground(Color.ORANGE);
		exitBtn.addActionListener(this);
		exitBtn.addMouseListener(this);
		bg.add(exitBtn);
		
		pp = new JLabel(new ImageIcon("C.png"));
	    pp.setBounds(10,20,150,200);
	    bg.add(pp);
		
		nm = new JLabel("MD FOIZE KHAN RION");
		nm.setBounds(200,100,300,70);
		nm.setBackground(Color.BLACK);
	    nm.setFont(myFont);
		nm.setForeground(Color.BLACK);
	    bg.add(nm);
		
		nm2 = new JLabel("23-52521-2");
		nm2.setBounds(200,140,250,55);
	    nm2.setFont(myFont);
		nm2.setForeground(Color.BLACK);
		nm2.setBackground(Color.BLACK);
	    bg.add(nm2);
		
		img = new ImageIcon("car.png");
		this.setIconImage(img.getImage());
		
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setResizable(true);
		this.setLocationRelativeTo(null);		
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me) {
		if (me.getSource() == pr) {
			pr.setBackground(Color.RED);
			pr.setForeground(Color.WHITE);
		} else if (me.getSource() == te) {
			te.setBackground(Color.RED);
			te.setForeground(Color.WHITE);
		} else if (me.getSource() == st) {
			st.setBackground(Color.RED);
			st.setForeground(Color.WHITE);
		} else if (me.getSource() == no) {
			no.setBackground(Color.RED);
			no.setForeground(Color.WHITE);
		} else if (me.getSource() == lo) {
			lo.setBackground(Color.BLACK);
			lo.setForeground(Color.WHITE);
		} else if (me.getSource() == exitBtn) {
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.WHITE);
		} else if (me.getSource() == ph) {
			ph.setBackground(Color.RED);
			ph.setForeground(Color.WHITE);
		} else if (me.getSource() == sch) {
			sch.setBackground(Color.RED);
			sch.setForeground(Color.WHITE);
		}
	}
	
	public void mouseExited(MouseEvent me) {
		if (me.getSource() == pr) {
			pr.setBackground(Color.BLACK);
			pr.setForeground(Color.RED);
		} else if (me.getSource() == te) {
			te.setBackground(Color.BLACK);
			te.setForeground(Color.RED);
		} else if (me.getSource() == st) {
			st.setBackground(Color.BLACK);
			st.setForeground(Color.RED);
		} else if (me.getSource() == no) {
			no.setBackground(Color.BLACK);
			no.setForeground(Color.RED);
		} else if (me.getSource() == lo) {
			lo.setBackground(Color.BLACK);
			lo.setForeground(Color.WHITE);
		} else if (me.getSource() == exitBtn) {
			exitBtn.setBackground(Color.BLACK);
			exitBtn.setForeground(Color.WHITE);
		} else if (me.getSource() == ph) {
			ph.setBackground(Color.BLACK);
			ph.setForeground(Color.RED);
		} else if (me.getSource() == sch) {
			sch.setBackground(Color.BLACK);
			sch.setForeground(Color.RED);
		}
	}
	
	    public void actionPerformed(ActionEvent e)
	    {
		    if (e.getSource() == te)
		    {
			     this.setVisible(false);
			     EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
					     Employes win = new Employes();
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
	    
			else if (e.getSource() == st)
		       {
			     this.setVisible(false);
			     EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
					     Vs win = new Vs();
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
			   else if (e.getSource() == ph)
		       {
			     this.setVisible(false);
			     EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
					     SPay win = new SPay();
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
			else if (e.getSource() == no)
			   {
				 
				Notice1 n = new Notice1 ();
				 this.setVisible(false);
		   	   }
            else if (e.getSource() == pr)
			   {
				this.setVisible(false);
				 new Profile();
			   }
			else if (e.getSource() == sch)
			   {
				this.setVisible(false);
				 new Schedule2();
			   }
          else if (e.getSource() == lo)
			   {
				this.setVisible(false);
				
				new LogOut();
			   }   
            else if (e.getSource()==exitBtn)
			   {
				 System.exit(0);
			   }				
		}		

}