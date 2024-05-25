import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login extends JFrame {

    private HashMap<String, String> userData = new HashMap<>();

    public Login() {
        setSize(1366, 768);
        setTitle("Login");
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

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        usernameLabel.setBounds(112, 80, 100, 30);
        usernameLabel.setForeground(Color.BLACK);
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(112, 120, 468, 30);
        usernameField.setBackground(Color.BLACK);
        usernameField.setForeground(Color.WHITE);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passwordLabel.setBounds(112, 180, 100, 30);
        passwordLabel.setForeground(Color.BLACK);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(112, 220, 468, 30);
        passwordField.setBackground(Color.BLACK);
        passwordField.setForeground(Color.WHITE);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(225, 320, 244, 53);
        loginButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        loginButton.setBackground(Color.RED);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameField.getText();
                String enteredPassword = String.valueOf(passwordField.getPassword());

                if (validateCredentials(enteredUsername, enteredPassword)) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    ESDE esdeFrame = new ESDE();
                    esdeFrame.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password.");
                }
            }
        });

        JButton signUpButton = new JButton("Don't have an account?");
        signUpButton.setBounds(225, 390, 244, 53);
        signUpButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        signUpButton.setBackground(Color.WHITE);
        signUpButton.setForeground(Color.BLACK);
        signUpButton.setBorderPainted(false);
        signUpButton.setContentAreaFilled(false);
        panel.add(signUpButton);

        signUpButton.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                Signup signup = new Signup(Login.this);
                signup.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }

    public void storeData(String username, String password) {
        userData.put(username, password);
    }

    private boolean validateCredentials(String username, String password) {
        return userData.containsKey(username) && userData.get(username).equals(password);
    }
}
