import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //MyFrame myFrame = new MyFrame();
        JLabel label = new JLabel("Hello...");
        label.setBounds(110,5,100,20);
        //label.setText("Hello:D");
        JLabel l1 = new JLabel("+");
        JLabel l2 = new JLabel("=");
        l1.setBounds(125, 30, 30,30);
        l2.setBounds(225, 30, 30,30);

        JTextField textField = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        textField.setBounds(50, 30, 60,30 );
        t2.setBounds(150, 30, 60,30 );
        t3.setBounds(250, 30, 60,30 );

        JButton b1 = new JButton();
        b1.setBounds(50, 70, 80,20);
        b1.setText("Add");
        // Add action listener to the button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    double d1 = Double.parseDouble(textField.getText());
                    double d2 = Double.parseDouble(t2.getText());
                    double d3 = d1 + d2;
                    t3.setText(String.valueOf(d3));
            }
        });



        JFrame frame = new JFrame();
        frame.setBounds(50,50,250,300);
        frame.setTitle("Testing...");
        frame.setSize(420,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(textField);
        frame.add(b1);
        frame.add(t2);
        frame.add(t3);
        frame.add(l1);
        frame.add(l2);
        frame.setLayout(null);

        frame.setVisible(true);


    }
}