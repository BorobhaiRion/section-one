import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sales extends JFrame implements ActionListener {

    private JButton c1, c2, c3, c4, c5, c6, back, lo;
    private JLabel labelC1, labelC2, labelC3, labelC4, labelC5, labelC6;
    private JLabel panel;
    static String pk700 = new String();

    public Sales(String pk) {
        super("Sales Status");
        this.setSize(800, 600); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.WHITE);
        
        
       

        panel =  new JLabel(new ImageIcon("oo.jpg"));
	    panel.setBounds(00,00,1400,800);
	    this.add(panel);
		 panel.setLayout(null);

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        // Create labels for the buttons
        labelC1 = new JLabel("BMW--SOLD:43");
        labelC1.setFont(new Font("Viking Squad", Font.PLAIN, 12));
        labelC1.setForeground(Color.BLACK);
        labelC1.setBounds(100, 100, 150, 30);
        panel.add(labelC1);

        labelC2 = new JLabel("HONDA--SOLD:43");
        labelC2.setFont(new Font("Viking Squad", Font.PLAIN, 12));
        labelC2.setForeground(Color.BLACK);
        labelC2.setBounds(300, 100, 150, 30);
        panel.add(labelC2);

        labelC3 = new JLabel("TOYOTA--SOLD:76");
        labelC3.setFont(new Font("Viking Squad", Font.PLAIN, 12));
        labelC3.setForeground(Color.BLACK);
        labelC3.setBounds(500, 100, 150, 30);
        panel.add(labelC3);

        labelC4 = new JLabel("AUDI--SOLD:09");
        labelC4.setFont(new Font("Viking Squad", Font.PLAIN, 12));
        labelC4.setForeground(Color.BLACK);
        labelC4.setBounds(100, 300, 150, 30);
        panel.add(labelC4);

        labelC5 = new JLabel("TESLA--SOLD:44");
        labelC5.setFont(new Font("Viking Squad", Font.PLAIN, 12));
        labelC5.setForeground(Color.BLACK);
        labelC5.setBounds(300, 300, 150, 30);
        panel.add(labelC5);

        labelC6 = new JLabel("NISSAN--SOLD:09");
        labelC6.setFont(new Font("Viking Squad", Font.PLAIN, 12));
        labelC6.setForeground(Color.BLACK);
        labelC6.setBounds(500, 300, 150, 30);
        panel.add(labelC6);

        // Create buttons without text
        c1 = new JButton(new ImageIcon("bmwlogo.jpg"));
        c1.setBounds(100, 130, 150, 150);
        panel.add(c1);

        c2 = new JButton(new ImageIcon("hondalogo.png"));
        c2.setBounds(300, 130, 150, 150);
        panel.add(c2); 

        c3 = new JButton(new ImageIcon("toyotalogo.png"));
        c3.setBounds(500, 130, 150, 150);
        panel.add(c3);

        c4 = new JButton(new ImageIcon("audilogo.png"));
        c4.setBounds(100, 330, 150, 150);
        panel.add(c4);

        c5 = new JButton(new ImageIcon("teslalogo.png"));
        c5.setBounds(300, 330, 150, 150);
        panel.add(c5);

        c6 = new JButton(new ImageIcon("nissanlogo.png"));
        c6.setBounds(500, 330, 150, 150);
        panel.add(c6);

        lo = new JButton("Logout");
        lo.setBounds(660, 20, 120, 30);
        lo.addActionListener(this);
        lo.setFont(new Font("Viking Squad", Font.PLAIN, 12)); 
        lo.setBackground(Color.WHITE);
        lo.setForeground(Color.BLACK);
        panel.add(lo); 

        back = new JButton("Back");
        back.setBounds(10, 520, 93, 23);
        back.addActionListener(this);
        back.setFont(new Font("Viking Squad", Font.PLAIN, 12)); 
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        panel.add(back); 

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            new Manager(pk700);
            this.setVisible(false);
        } else if (e.getSource() == lo) {
            this.setVisible(false);
            new LogOut();
        }
    }

    public static void main(String[] args) {
        new Sales(pk700);
    }

    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
}
