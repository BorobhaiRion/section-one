import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;




public class BMW extends JFrame{



    private Container c;
    private ImageIcon icon, img, previousIcon;
    private JLabel imgLabel, brand, model, price, engine, fuel, gearBox;
    private JButton buyNowBtn, previousBtn;
    protected String pk100;

    public BMW(String email)
    {
        this.pk100 = email;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("BMW");

        //Page design
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        // Icon
        icon = new ImageIcon(getClass().getResource("car.png"));   
        this.setIconImage(icon.getImage());


        //Backgroud coloring
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#000000"));

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        Font font = new Font("Segoe UI", Font.PLAIN, 25);

        previousIcon = new ImageIcon(getClass().getResource("Previous.png"));
        previousBtn = new JButton(previousIcon);
        previousBtn.setBounds(5, 5, 24, 24);
        previousBtn.setCursor(cursor);
        c.add(previousBtn);

        img = new ImageIcon(getClass().getResource("D BMW.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(30, 115, 400, 250);
        c.add(imgLabel);

        brand = new JLabel("Brand: BMW");
        brand.setBounds(500, 100, 280, 30);
        brand.setFont(font);
        brand.setForeground(Color.WHITE);
        c.add(brand);


        model = new JLabel("Model: X7");
        model.setBounds(500, 150, 280, 30);
        model.setFont(font);
        model.setForeground(Color.WHITE);
        c.add(model);

        engine = new JLabel("Engine Size(cc): 2998 cc");
        engine.setBounds(500, 200, 280, 30);
        engine.setFont(font);
        engine.setForeground(Color.WHITE);
        c.add(engine);

        fuel = new JLabel("Fuel Type: Diesel");
        fuel.setBounds(500, 250, 280, 30);
        fuel.setFont(font);
        fuel.setForeground(Color.WHITE);
        c.add(fuel);

        gearBox = new JLabel("Gear Box: 8 Speed");
        gearBox.setBounds(500, 300, 280, 30);
        gearBox.setFont(font);
        gearBox.setForeground(Color.WHITE);
        c.add(gearBox);

        price = new JLabel("Price: BDT 37,200,000");
        price.setBounds(500, 350, 280, 30);
        price.setFont(font);
        price.setForeground(Color.WHITE);
        c.add(price);

        String p = "37,200,000";

        buyNowBtn = new JButton("Buy Now");
        buyNowBtn.setBounds(620, 430, 150, 40);
        Font f = new Font("Segoe UI", Font.BOLD, 25);
        buyNowBtn.setFont(f);
        buyNowBtn.setCursor(cursor);
        c.add(buyNowBtn);

        
        previousBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
              new Customer(pk100);
            }
        });
    }
}


 
    
