import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;

public class Manager extends JFrame implements MouseListener, ActionListener {
    private JLabel p;
    private JLabel l, pp, name, id;
    private Font f;
    private JButton lo, exitBtn, pr, inventoryBtn, salesBtn, staffBtn;
    private ImageIcon img;

    String pk500 = new String();

    public Manager(String pk) {
        super("General Manager");

        pk500 = pk;

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        
        p = new JLabel(new ImageIcon("gg.jpg"));
        p.setBackground(new Color(51, 153, 255));
        this.add(p);
		p.setBounds(00,00,1400,800);

        
        f = new Font("Viking Squad", Font.PLAIN, 20);

        
        pr = new JButton("Profile");
        pr.setBounds(300, 230, 200, 40);
        pr.addMouseListener(this);
        pr.addActionListener(this);
        pr.setFont(f);
        pr.setBackground(Color.BLACK);
        pr.setForeground(Color.WHITE);
        p.add(pr);

        
        inventoryBtn = new JButton("Inventory");
        inventoryBtn.setBounds(300, 280, 200, 40);
        inventoryBtn.addMouseListener(this);
        inventoryBtn.addActionListener(this);
        inventoryBtn.setFont(f);
        inventoryBtn.setBackground(Color.WHITE);
        inventoryBtn.setForeground(Color.BLACK);
        p.add(inventoryBtn);

       
        salesBtn = new JButton("Sales");
        salesBtn.setBounds(300, 330, 200, 40);
        salesBtn.addMouseListener(this);
        salesBtn.addActionListener(this);
        salesBtn.setFont(f);
        salesBtn.setBackground(Color.WHITE);
        salesBtn.setForeground(Color.BLACK);
        p.add(salesBtn);

        
        staffBtn = new JButton("Staff");
        staffBtn.setBounds(300, 380, 200, 40);
        staffBtn.addMouseListener(this);
        staffBtn.addActionListener(this);
        staffBtn.setFont(f);
        staffBtn.setBackground(Color.WHITE);
        staffBtn.setForeground(Color.BLACK);
        p.add(staffBtn);

       
        lo = new JButton("Logout");
        lo.setBounds(660, 20, 120, 30);
        lo.addMouseListener(this);
        lo.addActionListener(this);
        lo.setFont(f);
        lo.setBackground(Color.WHITE);
        lo.setForeground(Color.BLACK);
        p.add(lo);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(600, 55, 105, 30);
        exitBtn.setFont(f);
        exitBtn.setBackground(Color.WHITE);
        exitBtn.setForeground(Color.BLACK);
        exitBtn.addActionListener(this);
        exitBtn.addMouseListener(this);
        p.add(exitBtn);

        
        pp = new JLabel(new ImageIcon("z.png"));
        pp.setBounds(10, 20, 150, 170);
        p.add(pp);

        
        name = new JLabel("Zarin Anjum");
        name.setBounds(200, 100, 300, 70);
        name.setFont(f);
        name.setForeground(Color.BLACK);
        p.add(name);

       
        id = new JLabel("23-52560-2");
        id.setBounds(200, 140, 250, 55);
        id.setFont(f);
        id.setForeground(Color.BLACK);
        p.add(id);

      
        img = new ImageIcon("car.png");
        this.setIconImage(img.getImage());
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
    }

    public void mouseClicked(MouseEvent me) {}

    public void mousePressed(MouseEvent me) {}

    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {
        JButton source = (JButton) me.getSource();
        source.setBackground(Color.RED);
        source.setForeground(Color.WHITE);
    }

    public void mouseExited(MouseEvent me) {
        JButton source = (JButton) me.getSource();
        source.setBackground(Color.BLACK);
        source.setForeground(Color.RED);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == inventoryBtn) {
            this.setVisible(false);
            EventQueue.invokeLater(() -> {
                try {
                    Inventory win = new Inventory(pk500);
                    win.read();
                    win.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
        } else if (source == salesBtn) {
            this.setVisible(false);
            EventQueue.invokeLater(() -> {
                try {
                    Sales win = new Sales(pk500);
                    win.read();
                    win.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
        } else if (source == staffBtn) {
            this.setVisible(false);
            EventQueue.invokeLater(() -> {
                try {
                    Staff win = new Staff(pk500);
                    win.read();
                    win.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
        } else if (source == pr) {
            this.setVisible(false);
            new Profile2(pk500);
        } else if (source == lo) {
            this.setVisible(false);
            new LogOut();
        } else if (source == exitBtn) {
            System.exit(0);
        }
    }

   
}

