package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Search_room extends JFrame {
    Choice choice;
    JTable table;
    Search_room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(255,183,194));
        panel.setLayout(null);
        add(panel);

        JLabel For= new JLabel("Search For Room");
        For.setBounds(250,11,186,31);
        For.setForeground(Color.black);
        For.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(For);

        JLabel status= new JLabel("Status :");
        status.setBounds(70,70,80,20);
        status.setForeground(Color.black);
        status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(status);

        choice = new Choice();
        choice.setBounds(170,70,120,20);
        choice.add("Available");
        choice.add("Occupied");
        panel.add(choice);

        table = new JTable();
        table.setBounds(0,180,700,210);
        table.setBackground(new Color(255,183,194));
        table.setForeground(Color.black);
        table.setFont(new Font("serif",Font.BOLD,16));
        table.setRowHeight(16);
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from Room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel RoomNo = new JLabel("Room Number");
        RoomNo.setBounds(23,162,150,20);
        RoomNo.setForeground(Color.black);
        RoomNo.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(RoomNo);

        JLabel available = new JLabel("Availabilty");
        available.setBounds(175,162,150,20);
        available.setForeground(Color.black);
        available.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(available);

        JLabel price = new JLabel("Price");
        price.setBounds(350,162,150,20);
        price.setForeground(Color.black);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel bedtype = new JLabel("Bed Type");
        bedtype.setBounds(580,162,150,20);
        bedtype.setForeground(Color.black);
        bedtype.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bedtype);

        JButton Search = new JButton("SEARCH");
        Search.setBounds(150,420,120,25);
        Search.setBackground(Color.black);
        Search.setForeground(Color.WHITE);
        panel.add(Search);

        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from Room where Availability = '"+choice.getSelectedItem()+"'";
                try{
                   conn c = new conn();
                   ResultSet resultSet = c.statement.executeQuery(q);
                   table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton back = new JButton("BACK");
        back.setBounds(380,420,120,25);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(700,500);
        setLayout(null);
        setLocation(450,250);
        setVisible(true);
    }

    public static void main(String[] args) {
       new Search_room();
    }
}
