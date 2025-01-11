import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField  tfname;
    Login() {
        // Set the background color of the container
        getContentPane().setBackground(Color.WHITE);

        // Create and configure the image label
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);

        // Position the image on the left side
        image.setBounds(0, 0, 600, 500); // Ensure the image dimensions match its actual size
        add(image);

        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);


        JLabel name=new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);


    
        // Rules Button
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        // Back Button
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



        // Use a null layout to control placement manually
        setLayout(null);

        // Set JFrame properties
        setSize(1200, 500); // Width: 1200, Height: 500
        setLocation(180, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
          String name =tfname.getText();
          setVisible(false);
          new Rules(name);
        }else if(ae.getSource() == back){
           setVisible(false);
        }
    }
    
    public static void main(String args[]) {
        new Login();
    }
}
