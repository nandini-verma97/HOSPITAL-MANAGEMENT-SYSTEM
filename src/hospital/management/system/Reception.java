package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.SystemColor.text;

public class Reception extends JFrame {

    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,250,1525,670);
        panel.setBackground(new Color(208,234,255));
        add(panel);

        //panel image
        ImageIcon i0 = new ImageIcon(ClassLoader.getSystemResource("icon/hospital_icn.png"));
        Image image0 = i0.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i01 = new ImageIcon(image0);
        JLabel label0 = new JLabel(i01);
        label0.setBounds(650,15,200,200);
        panel.add(label0);

        // Heading Label
        JLabel nameLabel = new JLabel("Narmada Health Care", SwingConstants.CENTER);
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 26)); // Modern, clean font
        nameLabel.setBounds(0, 230, 1525, 35);
        nameLabel.setForeground(new Color(0, 51, 102)); // Navy blue
        panel.add(nameLabel);

       // Location Label
        JLabel locationLabel = new JLabel("Location: BTI ROAD, JAWAHAR MARG, KHARGONE(451001)", SwingConstants.CENTER);
        locationLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        locationLabel.setBounds(0, 290, 1525, 30);
        locationLabel.setForeground(new Color(60, 60, 60));
        panel.add(locationLabel);

       // Contact Label
        JLabel contactLabel = new JLabel("Contact: narmadaHealth@gmail.com", SwingConstants.CENTER);
        contactLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        contactLabel.setBounds(0, 340, 1525, 30);
        contactLabel.setForeground(new Color(60, 60, 60));
        panel.add(contactLabel);

        // Beautiful Message Label
        JLabel messageLabel = new JLabel(" \"Your Health is Important to Us\"", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Georgia", Font.ITALIC, 22));
        messageLabel.setForeground(new Color(0, 153, 153)); // Soft teal
        messageLabel.setBounds(0, 390, 1525, 30);
        panel.add(messageLabel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,160,1525,150);
        panel1.setBackground(new Color(109,164,170));
        add(panel1);

       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
       Image image = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(image);
       JLabel label = new JLabel(i2);
       label.setBounds(1300,0,250,250);
       panel1.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/amb.png"));
        Image image1 = i11.getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1000,50,300,100);
        panel1.add(label1);

        JButton btn1 = new JButton("Add New Patient");
        btn1.setBounds(30,15,200,30);
        btn1.setBackground(new Color(246,215,118));
        btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new NEW_PATIENT();
            }
        });

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30,88,200,30);
        btn2.setBackground(new Color(246,215,118));
        btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new Room();
            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(30,161,200,30);
        btn3.setBackground(new Color(246,215,118));
        btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new Department();
            }
        });

        JButton btn4 = new JButton("All Employee Info");
        btn4.setBounds(270,15,200,30);
        btn4.setBackground(new Color(246,215,118));
        btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Employee_info();
            }
        });

        JButton btn5 = new JButton("Patient info");
        btn5.setBounds(270,88,200,30);
        btn5.setBackground(new Color(246,215,118));
        btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
               new  All_Patient_Info();
            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270,161,200,30);
        btn6.setBackground(new Color(246,215,118));
        btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new patient_discharge();
            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(510,15,250,30);
        btn7.setBackground(new Color(246,215,118));
        btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new update_patient_details();
            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(510,88,200,30);
        btn8.setBackground(new Color(246,215,118));
        btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Ambulance();
            }
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(510,161,200,30);
        btn9.setBackground(new Color(246,215,118));
        btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Search_room();
            }
        });

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(750,90,200,30);
        btn10.setBackground(new Color(246,215,118));
        btn10.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
               new login();

            }
        });



//        setUndecorated(true);
        setSize(1950,1090);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[]args){
        new Reception();
    }
}
