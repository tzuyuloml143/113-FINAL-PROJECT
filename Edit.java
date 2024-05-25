import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edit extends JFrame {

    public Edit() {
        setSize(1366, 768);
        setTitle("Edit Products");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(224, 125, 918, 518);
        panel.setLayout(null);

        JButton button = new JButton("Add Products");
        button.setBounds(112, 100, 693, 103);
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setBackground(Color.RED);
        button.addActionListener(new ActionListener() {
    
            public void actionPerformed(ActionEvent e) {
                new Add();
                dispose();
            }
        });
        panel.add(button);

        JButton button2 = new JButton("Remove Products");
        button2.setBounds(112, 300, 693, 103);
        button2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button2.setBackground(Color.RED);
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
    
            public void actionPerformed(ActionEvent e) {
                new Remove();
                dispose();
            }
        });
        panel.add(button2);

        add(panel);
        setVisible(true);
    }
}
