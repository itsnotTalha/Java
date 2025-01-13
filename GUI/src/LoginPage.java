import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage implements ActionListener {
    LoginPage(){
        JFrame frame = new JFrame("MY FRAME");
        frame.setBounds(100,50,420,420);
        JButton login = new JButton("Login");
        JButton reset = new JButton("Reset");
        JTextField t1 = new JTextField();
        JPasswordField p1 = new JPasswordField();
        JLabel username = new JLabel("Username");
        JLabel pass = new JLabel("Password");

        username.setBounds(120,50,70,30);
        pass.setBounds(120,85,70,30);
        t1.setBounds(195,50,110,30);
        p1.setBounds(195,85,110,30);
        login.setBounds(120,120,90,30);
        reset.setBounds(215,120,90,30);

        //username.setFont(new Font(null));
        frame.setLayout(null);
        frame.add(username);
        frame.add(pass);
        frame.add(login);
        frame.add(reset);
        frame.add(t1);
        frame.add(p1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.addActionListener(this);
        login.setFocusable(false);
    }
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
    }
}