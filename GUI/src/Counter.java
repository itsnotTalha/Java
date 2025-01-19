import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    JFrame f = new JFrame("Counter");
    JButton b1, b2;
    TextField t1;
    Counter(){
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,450);
        JLabel l1 = new JLabel("Counter: ");
        t1 = new TextField(10);
        t1.setText("0");
         b1 = new JButton("Count");
         b1.setFocusable(false);
         b2 = new JButton("Reset");
         b2.setFocusable(false);
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(Integer.parseInt(t1.getText())+1+"");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("0");
            }
        });
    }

    /*public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            t1.setText(Integer.parseInt(t1.getText())+1+"");
        }
        if(e.getSource()==b2){
            t1.setText("0");
        }
    }*/
}
