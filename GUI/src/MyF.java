import javax.swing.*;
import java.awt.*;

public class MyF extends JFrame {
    MyF(){
       JFrame frame = new JFrame("Default");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,450);

        Container c1 = getContentPane();
        c1.setLayout(new GridLayout(3,2));

       JPanel p1 = new JPanel();
       p1.setLayout(null);
       JPanel p2 = new JPanel();
       JPanel p3 = new JPanel();
       JPanel p4 = new JPanel();
       JPanel p5 = new JPanel();
       JPanel p6 = new JPanel();

       p1.setBackground(Color.CYAN);
       p2.setBackground(Color.DARK_GRAY);
       p3.setBackground(Color.DARK_GRAY);
       p4.setBackground(Color.CYAN);
       p5.setBackground(Color.CYAN);
       p6.setBackground(Color.DARK_GRAY);

       JButton b1,b2,b3;
       b1=new JButton("Add");
        b1.setBounds(10, 10, 80, 30);
       b2=new JButton("Sub");
       b3=new JButton("Mul");
       p1.add(b1);
       p2.add(b2);
       p3.add(b3);
       p4.add(new JButton("HI"));
       p5.add(new JButton("Hello"));
       p6.add(new JButton("Hey"));

       c1.add(p1);
       c1.add(p2);
       c1.add(p3);
       c1.add(p4);
       c1.add(p5);
       c1.add(p6);
       frame.add(c1,BorderLayout.CENTER);

       frame.setVisible(true);
    }
}
