import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import java.awt.Color;  
import java.awt.Graphics;  
import java.text.*;  
import java.util.*; 
import java.io.*;
import java.nio.file.*;
import java.lang.*;  
 
  
public class LogIn extends JFrame implements ActionListener {  
 
	JLabel header;
	private static JDialog d;  
	JButton b;
	JButton b1;

	JPasswordField value;
	JTextField text1;
	
	String path = "user.txt";
	String content;
	String [] line = new String [1000];
	String [][] data = new String [1000][100];
	String [] temp = new String [1000];
	
	//primary key "pk"
	String pk = new String();
    
	//main constructor
	LogIn() {  
        setTitle("Log In");  
        setLayout(null); 	
		setExtendedState(JFrame.NORMAL);
		
		//password field & login button
		value = new JPasswordField();   
		value.setBounds(550,231, 130,30);
		value.setEchoChar('*');
		
		JLabel l5=new JLabel(new ImageIcon("lock.png"));   
		l5.setBounds(520,231,30, 30); 
		add(l5);
		
		//Pending
		text1 = new JTextField();  
        text1.setBounds(550,186, 130,30);
		
		JLabel l4=new JLabel(new ImageIcon("user.png"));    
		l4.setBounds(520,186,30, 30); 
		add(l4);
		
		b = new JButton("Log In");  
			b.setBounds(530,276, 170,30);
			b.setFont(new Font("Viking Squad", Font.BOLD, 22));
			b.setForeground(Color.BLACK);
			b.setBackground(Color.WHITE);
			this.b.addActionListener(this);
		
		add(b);
		add(text1);
		add(value);

		//forgot button
		JLabel l3=new JLabel("Forgot Password?");    
			l3.setBounds(520,340, 110,20);
		
        b1 = new JButton("Click Here");  
			b1.setBounds(630,340, 100,20);
			b1.setFont(new Font("Viking Squad", Font.PLAIN, 16));
			b1.setForeground(Color.BLACK);
			b1.setBackground(Color.WHITE);
			this.b1.addActionListener(this);
		add(l3);
		add(b1);
		
		//Adding logo
		JLabel label1 = new JLabel(new ImageIcon("nn.png"));
			label1.setBounds(550,60,120,106);
			add(label1);
		
		JLabel labelx = new JLabel();
			labelx.setBounds(470,35,282,351);
			labelx.setOpaque(true);
			labelx.setBackground(new Color(50, 99, 99));
			
			
		add(labelx);
		
		JLabel label = new JLabel(new ImageIcon("Big.jpg"));
			label.setBounds(0,0,1600,800);
			setExtendedState(MAXIMIZED_BOTH);
			add(label);
		
		
		//frame
        setSize(1200, 500); 
		setLocationRelativeTo(null);		
        setVisible(true);  
		setExtendedState(MAXIMIZED_BOTH);
		
		
		//change icon
		Image icon = Toolkit.getDefaultToolkit().getImage("car.png");
		setIconImage(icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }   
	
	public void actionPerformed(ActionEvent e)
{
    if (e.getSource() == b)
    {
        try 
        {
            content = new String(Files.readString(Paths.get(path)));
            line = content.split(","); 
            int n = line.length;
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false; // New flag for Manager

            for(int i = 0; i < n; i++)
            {    
                temp = line[i].split("  "); 
                int t = temp.length;
                
                for(int j = 0; j < t; j++)
                {
                    data[i][j] = temp[j];
                }
                
            }
            
            for(int i = 0; i < data.length; i++)
            {
                if(data[i][0] != null)
                {
                    if (data[i][2].equals(value.getText()))
                    {
                        if (data[i][1].equals(text1.getText()))
                        {
                            String s = text1.getText();
                            if(s.equals("00-1234-3") && value.getText().equals("gmanager"))
                            {
                                flag3 = true; // Manager login condition
                                pk = data[i][0];
                            }
                            else if(s.charAt(s.length() - 1) == '0')
                            {
                                flag = true;
                                pk = data[i][0];
                            }
                            else if(s.charAt(s.length() - 1) == '1')
                            {
                                flag1 = true;
                                pk = data[i][0];
                            }
                            else if(s.charAt(s.length() - 1) == '2')
                            {
                                flag2 = true;
                                pk = data[i][0];
                            }
                        } 
                        break;
                    }    
                }
                else
                {
                    break;
                }
            }
            
            if(flag == true)
            {
                JOptionPane.showMessageDialog(null,"Successfully Logged In.");
                setVisible(false);
                Admin a = new Admin();
            }
            else if(flag1 == true)
            {
                JOptionPane.showMessageDialog(null,"Successfully Logged In.");
                setVisible(false);
                new Employe(pk);
            }
            else if(flag2 == true)
            {
                JOptionPane.showMessageDialog(null,"Successfully Logged In.");
                setVisible(false);
                new Customer(pk);
            }
            else if(flag3 == true)
            {
                JOptionPane.showMessageDialog(null,"Successfully Logged In.");
                setVisible(false);
                new Manager(pk); 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid user/password");
            }
            
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }    
    }
    else if (e.getSource() == b1)
    {
        setVisible(false);
        new ForgotPass ();
    }
}
}