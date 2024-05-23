import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;

public class MTR extends JFrame implements ActionListener
{
	JLabel bg;
	JButton ba;
	JLabel hl;
	JLabel pc;
	Font myFont;
	ImageIcon img;
	
    public MTR()
    {
	    super("Daily Routine");
		this.setLayout(null);
		this.setResizable(false);
		
		myFont = new Font("Viking Squad", Font.PLAIN, 22);
		
		bg = new JLabel((new ImageIcon("images/gg.jpg")));
		bg.setBackground(new Color(51,153,255));
	    bg.setBounds(00,00,800,800);
	    this.add(bg);
	
	    ba = new JButton(); 
		ba.setText("Back");
		ba.setBounds(10, 650, 93,23);
		ba.addActionListener(this);
		ba.setFont(new Font("Viking Squad", Font.PLAIN, 25));
		ba.setForeground(Color.BLACK);
		ba.setBackground(Color.WHITE);
		bg.add(ba);
		
		hl = new JLabel();
		hl.setText("Carbon Motors Company");
		hl.setBounds(150,50,600,100);
	    hl.setFont(new Font("Viking Squad", Font.PLAIN, 40));
		hl.setForeground(Color.BLUE);
	    bg.add(hl);
		
		pc = new JLabel(new ImageIcon("images/Routine.PNG"));
	    pc.setBounds(74,150,651,423);
		bg.add(pc);
		
		img = new ImageIcon("images/car.png");
		this.setIconImage(img.getImage());
		
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ba)
		{
			new Notice1();
			this.setVisible(false);
		}
	}
	
}