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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Staff extends JFrame implements ActionListener, MouseListener {

    private JFrame frame;
    private JLabel id, name, ps, bg, title;
    private Font myFont;
    private JTable table;
    private JButton addButton, lo, back, updateButton, removeButton, resetButton;
    private ImageIcon i;
    private JScrollPane scrollPane;
    private DefaultTableModel listModel;
    private JTextField idTF, nameTF, psTF;
    String pk300 = new String();

    public Staff(String pk) {
        super("Staff");
        pk300 = pk;

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(0,0);
        
        this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		this.setResizable(true);

        
        myFont = new Font("Viking Squad", Font.PLAIN, 22);
        bg = new JLabel(new ImageIcon("gg.jpg"));
        bg.setBackground(new Color(51, 153, 255));
        bg.setBounds(0, 0, 800, 800);
        this.getContentPane().add(bg);
        bg.setLayout(null);

        id = new JLabel();
        id.setText("ID:");
        id.setFont(new Font("Viking Squad", Font.PLAIN, 15));
        id.setBounds(41, 550, 46, 14);
        bg.add(id);

        name = new JLabel();
        name.setText("Name:");
        name.setFont(new Font("Viking Squad", Font.PLAIN, 15));
        name.setBounds(41, 570, 80, 14);
        bg.add(name);

        ps = new JLabel();
        ps.setText("Payment Status:");
        ps.setFont(new Font("Viking Squad", Font.PLAIN, 15));
        ps.setBounds(41, 610, 130, 14);
        bg.add(ps);

        idTF = new JTextField();
        idTF.setBounds(140, 550, 200, 20);
        bg.add(idTF);
        idTF.setColumns(10);

        nameTF = new JTextField();
        nameTF.setBounds(140, 570, 200, 20);
        bg.add(nameTF);
        nameTF.setColumns(10);

        psTF = new JTextField();
        psTF.setBounds(140, 610, 200, 20);
        bg.add(psTF);
        psTF.setColumns(10);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 150, 750, 350);
        bg.add(scrollPane);

        table = new JTable();
        table.addMouseListener(this);
        table.setBackground(Color.cyan);
        listModel = new DefaultTableModel();
        Object[] column = { "ID", "Name", "Payment Status" };
        listModel.setColumnIdentifiers(column);
        table.setModel(listModel);
        scrollPane.setViewportView(table);

        addButton = new JButton();
        addButton.setText("ADD");
        addButton.setFont(myFont);
        addButton.addActionListener(this);
        addButton.setBounds(420, 560, 93, 23);
        addButton.setForeground(Color.BLUE);
        addButton.setBackground(Color.WHITE);
        bg.add(addButton);

        updateButton = new JButton();
        updateButton.setText("UPDATE");
        updateButton.setFont(myFont);
        updateButton.addActionListener(this);
        updateButton.setBounds(420, 600, 93, 23);
        updateButton.setForeground(Color.BLUE);
        updateButton.setBackground(Color.WHITE);
        bg.add(updateButton);

        removeButton = new JButton();
        removeButton.setText("REMOVE");
        removeButton.setFont(myFont);
        removeButton.addActionListener(this);
        removeButton.setBounds(520, 560, 93, 23);
        removeButton.setForeground(Color.BLUE);
        removeButton.setBackground(Color.WHITE);
        bg.add(removeButton);

        resetButton = new JButton();
        resetButton.setText("RESET");
        resetButton.setFont(myFont);
        resetButton.addActionListener(this);
        resetButton.setBounds(520, 600, 93, 23);
        resetButton.setForeground(Color.BLUE);
        resetButton.setBackground(Color.WHITE);
        bg.add(resetButton);

        lo = new JButton();
        lo.setText("logout");
        lo.setBounds(660, 20, 120, 30);
        lo.addActionListener(this);
        lo.setFont(new Font("Viking Squad", Font.PLAIN, 28));
        bg.add(lo);
        lo.setBackground(Color.WHITE);
        lo.setForeground(Color.BLUE);

        back = new JButton();
        back.setText("back");
        back.setBounds(10, 650, 93, 23);
        back.addActionListener(this);
        back.setFont(myFont);
        bg.add(back);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);

        title = new JLabel("STAFF MANAGEMENT");
        title.setBounds(250, 80, 350, 70);
        title.setFont(new Font("Viking Squad", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        bg.add(title);

        i = new ImageIcon("car.png");
        this.setIconImage(i.getImage());

        read();
        this.setVisible(true);
    }

    public void read() {
        File file = new File("man.txt");
        try (FileReader read = new FileReader(file);
             BufferedReader reader = new BufferedReader(read)) {

            Object[] lines = reader.lines().toArray();
            for (Object line : lines) {
                String[] row = line.toString().split(",");
                listModel.addRow(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() {
        File file = new File("man.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter writer = new FileWriter(file);
                 BufferedWriter bw = new BufferedWriter(writer)) {
                for (int i = 0; i < listModel.getRowCount(); i++) {
                    StringBuilder row = new StringBuilder();
                    for (int j = 0; j < listModel.getColumnCount(); j++) {
                        row.append(listModel.getValueAt(i, j));
                        if (j < listModel.getColumnCount() - 1) {
                            row.append(",");
                        }
                    }
                    bw.write(row.toString());
                    bw.write(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setVisible(boolean b) {
        super.setVisible(b);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            new Manager(pk300);
            this.setVisible(false);
        } else if (e.getSource() == lo) {
            this.setVisible(false);
            new LogOut();
        } else if (e.getSource() == addButton) {
            if (idTF.getText().equals("") || nameTF.getText().equals("") || psTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
            } else {
                Object[] row = new Object[3];
                row[0] = idTF.getText();
                row[1] = nameTF.getText();
                row[2] = psTF.getText();

                listModel.addRow(row);

                idTF.setText("");
                nameTF.setText("");
                psTF.setText("");

                this.write();
                JOptionPane.showMessageDialog(null, "Saved Successfully");
            }
        } else if (e.getSource() == updateButton) {
            int i = table.getSelectedRow();
            if (i >= 0) {
                listModel.setValueAt(idTF.getText(), i, 0);
                listModel.setValueAt(nameTF.getText(), i, 1);
                listModel.setValueAt(psTF.getText(), i, 2);

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
                JOptionPane.showMessageDialog(null, "Removed Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a Row First");
            }
        } else if (e.getSource() == resetButton) {
            idTF.setText("");
            nameTF.setText("");
            psTF.setText("");
        }
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mouseClicked(MouseEvent me) {
        int i = table.getSelectedRow();
        idTF.setText(listModel.getValueAt(i, 0).toString());
        nameTF.setText(listModel.getValueAt(i, 1).toString());
        psTF.setText(listModel.getValueAt(i, 2).toString());
    }
}