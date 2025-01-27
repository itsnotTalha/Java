import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1, b2,b3, b4;
        JTextField t1, t2;
        JPanel p1 = new JPanel();
        b1 = new JButton("Red");
        b2 = new JButton("Yellow");
        b3 = new JButton("Green");
        b4 = new JButton("Reset");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        t1 = new JTextField("NULL",19);
        t1.setSize(100,100);
        p2.add(t1);
        p2.setSize(100,100);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("Stop");
                p2.setBackground(Color.RED);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("Get Ready");
                p2.setBackground(Color.YELLOW);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("Go");
                p2.setBackground(Color.GREEN);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("NULL");
                p2.setBackground(null);
            }
        });

        p3.add(b4);
        frame.setLayout(new GridLayout(7,1));
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.setVisible(true);
    }
}
