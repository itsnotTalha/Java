import javax.swing.*;
import java.awt.*;

public class MyFrame {
    MyFrame(){
        JFrame frame = new JFrame();
        frame.setTitle("Something");
        frame.setSize(420,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
       // p1.setLayout(new GridLayout());
        p1.add(new JButton("B1"));
        p1.add(new JButton("B2"));
        p1.add(new TextField("HEY"));
        p1.setBackground(Color.MAGENTA);

        JPanel p2 = new JPanel();
        p2.add(new JButton("BB1"));
        p2.add(new JButton("BB1"));
        p2.add(new TextField("Hello"));
        p2.setBackground(Color.BLACK);
        Container c1 = new Container();
        c1.setLayout(new GridLayout(5,2));
        c1.add(p1);
        c1.add(p2);
        frame.setContentPane(c1);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame f1 = new MyFrame();
    }
}
