import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    JFrame frame = new JFrame();
    Calculator(){
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,450);
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("Num1: ");
        JLabel l2 = new JLabel("Num2: ");
        JLabel l3 = new JLabel("Result: ");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        TextField t3 = new TextField(10);
        p1.add(l1);
        p1.add(t1);
        JPanel p2 = new JPanel();
        p2.add(l2);
        p2.add(t2);

        JPanel p3 = new JPanel();
        JButton b1 = new JButton("ADD");
        JButton b2 = new JButton("SUB");
        JButton b3 = new JButton("MUL");
        JButton b4 = new JButton("DIV");
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);

        JPanel p4 = new JPanel();
        p4.add(l3);
        p4.add(t3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double result = Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
                t3.setText(result+"");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double result = Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText());
                t3.setText(result+"");
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double result = Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
                t3.setText(result+"");
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double result = Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText());
                t3.setText(result+"");
            }
        });
        p1.setBounds(10,10,250,30);
        p2.setBounds(10,40,250,30);
        p3.setBounds(10,70,250,40);
        p4.setBounds(10,110,250,30);
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.setVisible(true);
    }
}
