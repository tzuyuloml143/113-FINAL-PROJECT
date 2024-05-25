import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame {

    public Add() {
        setSize(1366, 768);
        setTitle("Edit Products");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(224, 125, 918, 518);
        panel.setLayout(null);

        JButton button = new JButton("Meal");
        button.setBounds(168, 20, 581, 72);
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setBackground(Color.RED);
        panel.add(button);

    
        JButton button2 = new JButton("Beverage");
        button2.setBounds(168, 145, 581, 72);
        button2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button2.setBackground(Color.RED);
        panel.add(button2);

        JButton button3 = new JButton("Snacks");
        button3.setBounds(168, 270, 581, 72);
        button3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button3.setBackground(Color.RED);
        panel.add(button3);

        JButton button4 = new JButton("School Supplies");
        button4.setBounds(168, 395, 581, 72);
        button4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button4.setBackground(Color.RED);
        panel.add(button4);

        add(panel);

        JLabel background = new JLabel();
        background.setIcon(new ImageIcon("C:/Users/patri/Downloads/200w.gif"));
        background.setBounds(0, 0, 1366, 768);
        add(background);

        setVisible(true);
    }
}
