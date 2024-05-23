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


public class Update extends JFrame implements ActionListener , MouseListener/*, ItemListener*/
{
	JFrame f=new JFrame();

	private JTextField t2,t3,t4,t5,t6,t7;
	private JButton b,b1,upb,clb; 
	private JTable table;
	private JScrollPane jsp;
	JLabel sdl,mdl,tudl,wdl,thdl,sadl;
	DefaultTableModel model;
	Font myFont;
	JLabel tl,bg;
	ImageIcon img;
	private JToggleButton button;
	
	
    Update()
	{    
	
	
		b = new JButton("Log out");  
        b.setBounds(664,20,110,30); 
		b.setBackground(Color.WHITE);
		this.b.addActionListener(this);
		this.add(b);
		
		b1 = new JButton("Back");  
        b1.setBounds(20,650, 80,30); 
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		this.b1.addActionListener(this);
		this.add(b1);
		
		myFont = new Font("Arial", Font.PLAIN, 18);
		
		bg = new JLabel();
		bg.setBackground(new Color(51,153,255));
	    bg.setBounds(00,00,800,800);
		this.getContentPane().add(bg);
		bg.setLayout(null);
		
		
		sdl =  new JLabel();
		sdl.setText("Sunday");
		sdl.setBounds(41, 570, 46, 14);
		bg.add(sdl);
		
		mdl =  new JLabel();
		mdl.setText("Monday");
		mdl.setBounds(41, 590, 50, 14);
		bg.add(mdl);
		
		tudl = new JLabel();
		tudl.setText("Tuesday");
		tudl.setBounds(41, 610, 80, 14);
		bg.add(tudl);
		
		wdl = new JLabel();
		wdl.setText("Wednesday");
		wdl.setBounds(41, 630, 80, 14);
		bg.add(wdl);
		
		thdl = new JLabel();
		thdl.setText("Thursday");
		thdl.setBounds(41, 650, 80, 14);
		bg.add(thdl);
		
		
		
		
		t2 = new JTextField();
		t2.setBounds(140, 570, 200, 20);
		bg.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(140, 590, 200, 20);
		bg.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(140, 610, 200, 20);
		bg.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(140, 630, 200, 20);
		bg.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(140, 650, 200, 20);
		bg.add(t6);
		t6.setColumns(10);
		
		
		jsp = new JScrollPane();
		jsp.setBounds(20,150,750,350);
		jsp.setFont(new Font("Viking Squad", Font.PLAIN, 28));
		bg.add(jsp);
		
		table = new JTable();
		table.addMouseListener(this);
		table.setBackground(Color.cyan);
		model = new DefaultTableModel();

		Object[] column = {"Time","Sunday","Monday","Tuesday","Wednesday","Thursday"};
		model.setColumnIdentifiers(column);
		table.setModel(model);
		jsp.setViewportView(table);
		
		upb = new JButton();
		upb.setText("Update");
		upb.addActionListener(this);
		upb.setBounds(520,560,93,23);
		upb.setForeground(Color.BLUE);
		upb.setBackground(Color.WHITE);
		bg.add(upb);
		
		clb = new JButton();
		clb.setText("Clear");
		clb.addActionListener(this);
		clb.setBounds(520,600,93,23);
		
		clb.setForeground(Color.BLUE);
		clb.setBackground(Color.WHITE);
		bg.add(clb);
	  
		
		tl = new JLabel("Schedule Update");
		tl.setBounds(250,80,350,70);
	    tl.setFont(new Font("Arial", Font.PLAIN, 28));
		tl.setForeground(Color.BLUE);
	    bg.add(tl);
		
		img = new ImageIcon("images/icon.png");
		this.setIconImage(img.getImage());
		
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);  
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	
		public  void read() 
		{
        try {
                File file = new File("data/sc.txt");
                FileReader read = new FileReader(file);
                BufferedReader reader = new BufferedReader(read);
            
                Object[] lines = reader.lines().toArray();

                    for (int i = 0; i < lines.length; i++) 
			        {
                    String[] row = lines[i].toString().split(" ");
                    model.addRow(row);
                    }

                reader.close();
            }

                catch (IOException ae) 
		        {
                   ae.printStackTrace();
                }
        }
		
		public  void write()
		{
		    try 
			{
			    File file = new File("data/sc.txt");
			    if (!file.exists()) 
				{
				file.createNewFile();
			    }
			    FileWriter writer = new FileWriter(file);
			    BufferedWriter bw = new BufferedWriter(writer);
			for (int i = 0; i < model.getRowCount(); i++) 
			    {
				    for (int j = 0; j < model.getColumnCount(); j++) 
				    {
					    bw.write(model.getValueAt(i, j) + " ");
				    }
				        bw.write("\r\n");
			    }
			    bw.close();
			    writer.close();
		    }  
			    catch (Exception ex) 
			    {
			        ex.printStackTrace();
		        }
	    }
		
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==clb)
		{ 
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			
		}
		else if(e.getSource()==upb)
		{ 
           	int i = table.getSelectedRow();
	        if (i>=0)
		   {
		    
			model.setValueAt(t2.getText(), i, 1);
			model.setValueAt(t3.getText(), i, 2);
			model.setValueAt(t4.getText(), i, 3);
			model.setValueAt(t5.getText(), i, 4);
			model.setValueAt(t6.getText(), i, 5);
			
			this.write();
		    JOptionPane.showMessageDialog(null,"Updated Successfully");
		   }
		   

		   
	        else
		   {
			JOptionPane.showMessageDialog(null,"Please Select a Row First");
		   }
		}
		
		else if (e.getSource() == b1)
		{
			this.setVisible(false);
			new Schedule2();
		}
		
		else if (e.getSource() == b)
		{
			this.setVisible(false);
			new LogOut();
		}
	}
	
	public void mouseEntered(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me)
	{
	int i = table.getSelectedRow();
	
	t2.setText(model.getValueAt(i,1).toString());
	t3.setText(model.getValueAt(i,2).toString());
	t4.setText(model.getValueAt(i,3).toString());
	t5.setText(model.getValueAt(i,4).toString());
	t6.setText(model.getValueAt(i,5).toString());
	
	}
	
	


}