import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame {

    private Login login;

    public Signup(Login login) {
        this.login = login;

        setSize(1366, 768);
        setTitle("Signup");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel background = new JLabel();
        background.setIcon(new ImageIcon("C:/Users/patri/Downloads/200w.gif"));
        background.setBounds(0, 0, 1366, 768);

        add(background);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setBounds(337, 125, 693, 518);
        panel.setLayout(null);
        add(panel);

        JLabel usernameLabel = new JLabel("Enter Username:");
        usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        usernameLabel.setBounds(112, 80, 150, 30);
        usernameLabel.setForeground(Color.BLACK);
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(112, 120, 468, 30);
        usernameField.setBackground(Color.BLACK);
        usernameField.setForeground(Color.WHITE);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Enter Password:");
        passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passwordLabel.setBounds(112, 180, 150, 30);
        passwordLabel.setForeground(Color.BLACK);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(112, 220, 468, 30);
        passwordField.setBackground(Color.BLACK);
        passwordField.setForeground(Color.WHITE);
        panel.add(passwordField);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(225, 320, 244, 53);
        registerButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        registerButton.setBackground(Color.RED);
        registerButton.setForeground(Color.WHITE);
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                login.storeData(username, password);
                JOptionPane.showMessageDialog(null, "Registration Successful!");
                dispose();
            }
        });
    }
}
