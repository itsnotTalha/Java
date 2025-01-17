import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class LoginPage implements ActionListener {
        JButton login = new JButton("Login");
        JButton reset = new JButton("Reset");
        JTextField t1 = new JTextField();
        JPasswordField p1 = new JPasswordField();
        String userId,password;
        JFrame frame = new JFrame("MY FRAME");
    LoginPage(){
        frame.setBounds(100,50,420,420);
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
        reset.addActionListener(this);
        login.setFocusable(false);
    }
    public void actionPerformed(ActionEvent e) {
        if(login == e.getSource()){
            userId=t1.getText();
            password = Arrays.toString(p1.getPassword());
            frame.add(homepage());
        }
        if(reset==e.getSource()){
            t1.setText("");
            p1.setText("");
        }
    }
    public Container homepage(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2));
        JButton b1 = new JButton("Save");
        //JTextField t1,t2,t3 = new JTextField();
        JLabel l1 = new JLabel("Name: ");
        JLabel l2 = new JLabel("Age: ");
        JLabel l3 = new JLabel("Gender: ");
        JLabel l4 = new JLabel("Gender: ");

        p1.add(l1);
        p1.add(new JTextField());
        p1.add(l2);
        p1.add(new JTextField());
        p1.add(l3);
        p1.add(new JTextField());

        Container c = new Container();
        c.add(p1,BorderLayout.CENTER);
        c.add(b1,BorderLayout.SOUTH);

        return c;
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
    }

}