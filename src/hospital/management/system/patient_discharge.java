package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class patient_discharge extends JFrame {

    patient_discharge(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(200,220,240));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("CHECK-OUT");
        label.setBounds(100,20,150,20);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        label.setForeground(Color.BLUE);
        panel.add(label);

        JLabel label2 = new JLabel("Customer ID");
        label2.setBounds(38,80,150,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.BLUE);
        panel.add(label2);

        Choice choice = new Choice();
        choice.setBounds(200,80,150,25);
        panel.add(choice);

        try{
            conn c = new conn();
            ResultSet resultset = c.statement.executeQuery("select * from patient_info");
            while(resultset.next()){
                choice.add(resultset.getString("number"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number");
        label3.setBounds(38,130,150,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(Color.BLUE);
        panel.add(label3);

        JLabel RNo = new JLabel();
        RNo.setBounds(200,130,150,20);
        RNo.setFont(new Font("Tahoma",Font.BOLD,14));
        RNo.setForeground(Color.BLUE);
        panel.add(RNo);

        JLabel label4 = new JLabel("In Time");
        label4.setBounds(38,180,150,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(Color.BLUE);
        panel.add(label4);

        JLabel intime = new JLabel();
        intime.setBounds(200,180,300,20);
        intime.setFont(new Font("Tahoma",Font.BOLD,14));
        intime.setForeground(Color.BLUE);
        panel.add( intime);

        JLabel label5 = new JLabel("Out Time");
        label5.setBounds(38,230,150,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setForeground(Color.BLUE);
        panel.add(label5);

        Date date = new Date();

        JLabel OutTime = new JLabel(""+date);
        OutTime.setBounds(200,230,300,20);
        OutTime.setFont(new Font("Tahoma",Font.BOLD,14));
        OutTime.setForeground(Color.BLUE);
        panel.add( OutTime);

        JButton discharge = new JButton("Discharge");
        discharge.setBounds(30,300,120,30);
        discharge.setBackground(Color.BLACK);
        discharge.setForeground(Color.WHITE);
        panel.add(discharge);

        discharge.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try{
                    c.statement.executeUpdate("delete from patient_info where Number ='"+choice.getSelectedItem()+"' ");
                    c.statement.executeUpdate("update Room set Availability  = 'Available' where room_no ='"+RNo.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);
                }catch(Exception E){
                    E.printStackTrace();
                }

            }
        });

        JButton Check = new JButton("Check");
        Check.setBounds(170,300,120,30);
        Check.setBackground(Color.BLACK);
        Check.setForeground(Color.WHITE);
        panel.add(Check);
        Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try{
                   ResultSet resultSet = c.statement.executeQuery("select * from patient_info where Number ='"+choice.getSelectedItem()+"' ");
                   while(resultSet.next()){
                       RNo.setText(resultSet.getString("Room_Number"));
                       intime.setText(resultSet.getString("Time"));
                   }
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton Back = new JButton("Back");
        Back.setBounds(300,300,120,30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });





        setUndecorated(true);
        setSize(800,400);
        setLayout(null);
        setLocation(400,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new patient_discharge();

    }
}
