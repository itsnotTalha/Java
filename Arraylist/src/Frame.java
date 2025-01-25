import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    public Frame(){
        setSize(420,420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        add(b1);
        b1.setBounds(10,20,100,100);
        setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setSize(400,600);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                dispose();
            }
        });
    }
    JButton b1 = new JButton("New");
}
