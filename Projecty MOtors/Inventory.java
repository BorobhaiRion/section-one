import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Inventory extends JFrame implements ActionListener, MouseListener {

    private JFrame frame;
    private JLabel bg, mod, price, title;
    private Font myFont;
    private JTable table;
    private JButton addButton, lo, back, updateButton, removeButton, resetButton;
    private ImageIcon i;
    private JScrollPane scrollPane;
    private DefaultTableModel listModel;
    private JTextField modelTF, priceTF;

    String pk400 = new String();

    public Inventory(String pk) {
        super("Inventory");
        pk400 = pk;
        this.setLayout(null);

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        

        myFont = new Font("Viking Squad", Font.PLAIN, 18);

        bg = new JLabel(new ImageIcon("gg.jpg"));
        bg.setBackground(new Color(51, 153, 255));
        bg.setBounds(0, 0, 1400, 800);
        this.add(bg);
        bg.setLayout(null);

        mod = new JLabel("MODEL :");
        mod.setFont(myFont);
        mod.setBounds(41, 550, 100, 20);
        bg.add(mod);

        price = new JLabel("PRICE :");
        price.setFont(myFont);
        price.setBounds(41, 580, 100, 20);
        bg.add(price);

        modelTF = new JTextField();
        modelTF.setBounds(150, 550, 200, 20);
        bg.add(modelTF);
        modelTF.setColumns(10);

        priceTF = new JTextField();
        priceTF.setBounds(150, 580, 200, 20);
        bg.add(priceTF);
        priceTF.setColumns(10);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 150, 750, 350);
        bg.add(scrollPane);

        table = new JTable();
        table.addMouseListener(this);
        table.setBackground(Color.cyan);
        listModel = new DefaultTableModel();

        Object[] column = { "MODEL", "PRICE" };
        listModel.setColumnIdentifiers(column);
        table.setModel(listModel);
        scrollPane.setViewportView(table);

        addButton = new JButton("ADD");
        addButton.setFont(myFont);
        addButton.setBounds(420, 550, 100, 30);
        addButton.setForeground(Color.BLUE);
        addButton.setBackground(Color.WHITE);
        addButton.addActionListener(this);
        bg.add(addButton);

        updateButton = new JButton("UPDATE");
        updateButton.setFont(myFont);
        updateButton.setBounds(420, 590, 100, 30);
        updateButton.setForeground(Color.BLUE);
        updateButton.setBackground(Color.WHITE);
        updateButton.addActionListener(this);
        bg.add(updateButton);

        removeButton = new JButton("REMOVE");
        removeButton.setFont(myFont);
        removeButton.setBounds(420, 630, 100, 30);
        removeButton.setForeground(Color.BLUE);
        removeButton.setBackground(Color.WHITE);
        removeButton.addActionListener(this);
        bg.add(removeButton);

        resetButton = new JButton("RESET");
        resetButton.setFont(myFont);
        resetButton.setBounds(530, 590, 100, 30);
        resetButton.setForeground(Color.BLUE);
        resetButton.setBackground(Color.WHITE);
        resetButton.addActionListener(this);
        bg.add(resetButton);

        lo = new JButton("Logout");
        lo.setBounds(660, 20, 120, 30);
        lo.addActionListener(this);
        lo.setFont(new Font("Viking Squad", Font.PLAIN, 18));
        lo.setBackground(Color.WHITE);
        lo.setForeground(Color.BLUE);
        bg.add(lo);

        back = new JButton("Back");
        back.setBounds(10, 650, 100, 30);
        back.addActionListener(this);
        back.setFont(myFont);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        bg.add(back);

        title = new JLabel("INVENTORY MANAGEMENT");
        title.setBounds(250, 80, 350, 70);
        title.setFont(new Font("Viking Squad", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        bg.add(title);

        i = new ImageIcon("car.png");
        this.setIconImage(i.getImage());

        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
    }

    public void read() {
        try {
            File file = new File("inv.txt");
            FileReader read = new FileReader(file);
            BufferedReader reader = new BufferedReader(read);

            Object[] lines = reader.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                listModel.addRow(row);
            }

            reader.close();
        } catch (IOException ae) {
            ae.printStackTrace();
        }
    }

    public void write() {
        try {
            File file = new File("inv.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            for (int i = 0; i < listModel.getRowCount(); i++) {
                for (int j = 0; j < listModel.getColumnCount(); j++) {
                    bw.write(listModel.getValueAt(i, j) + ",");
                }
                bw.write("\r\n");
            }
            bw.close();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            new Manager(pk400);
            this.setVisible(false);
        } else if (e.getSource() == lo) {
            this.setVisible(false);
            new LogOut();
        } else if (e.getSource() == addButton) {
            if (modelTF.getText().equals("") || priceTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
            } else {
                Object[] row = new Object[2];
                row[0] = modelTF.getText();
                row[1] = priceTF.getText();

                listModel.addRow(row);

                modelTF.setText("");
                priceTF.setText("");

                this.write();
                JOptionPane.showMessageDialog(null, "Saved Successfully");
            }
        } else if (e.getSource() == updateButton) {
            int i = table.getSelectedRow();
            if (i >= 0) {
                listModel.setValueAt(modelTF.getText(), i, 0);
                listModel.setValueAt(priceTF.getText(), i, 1);

                this.write();
                JOptionPane.showMessageDialog(null, "Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a Row First");
            }
        } else if (e.getSource() == removeButton) {
            int i = table.getSelectedRow();
            if (i >= 0) {
                listModel.removeRow(i);
                this.write();
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a Row First");
            }
        } else if (e.getSource() == resetButton) {
            modelTF.setText("");
            priceTF.setText("");
        }
    }

    public void mouseEntered(MouseEvent me) {}

    public void mousePressed(MouseEvent me) {}

    public void mouseReleased(MouseEvent me) {}

    public void mouseExited(MouseEvent me) {}

    public void mouseClicked(MouseEvent me) {
        int i = table.getSelectedRow();
        modelTF.setText(listModel.getValueAt(i, 0).toString());
        priceTF.setText(listModel.getValueAt(i, 1).toString());
    }

}