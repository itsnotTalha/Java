import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    MyFrame(){
        JFrame frame = new JFrame("Default");
        JDialog dialog = new JDialog();

        JPanel p1 = new JPanel();
        JButton b3 = new JButton("Click here");
        b3.setBounds(90,110,100,25);

        JPanel p2 = new JPanel();
        p2.setBounds(10,150, 290,200);

        JPanel p3 = new JPanel();
        p3.setSize(100,200);


        JLabel l1 = new JLabel("Enter your text here: ");
        l1.setBounds(10,10,120,25);
        l1.setForeground(Color.WHITE);
        JLabel l2 = new JLabel("Output: ");
        l2.setBounds(10,70,120,25);
        l2.setForeground(Color.WHITE);

        JTextField t1 = new JTextField();
        t1.setBounds(140,10,150,25);
        JTextField t2 = new JTextField();
        t2.setBounds(140, 70,150,25);

        JButton b1 = new JButton("Run");
        b1.setBounds(140,40,150,25);
        b1.setBackground(Color.GREEN);

        frame.setBounds(1200,200,500,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setBackground(Color.DARK_GRAY);
        p1.setLayout(null);
        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(t2);
        p1.add(b1);
        p1.add(b3);
        p1.add(p2);
        frame.add(p3);
        frame.add(p1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                t2.setText(s1);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               t2.setText("Meow");
            }
        });
    }
}
