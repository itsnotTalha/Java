import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main extends JFrame {
    public static void main(String[] args) {
      //  int i=1;
        JFrame frame = new JFrame("GUI");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ArrayList<JButton>buttons= new ArrayList<>();
        JButton button = new JButton("Add");
        frame.setLayout(new GridLayout(2,1));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        frame.add(p1);
        AtomicInteger i = new AtomicInteger(1);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.add(new JLabel("b"+i.getAndIncrement()));
                p2.add(new JButton("Button"));
                p2.revalidate(); // Refresh UI
                p2.repaint();
            }
        });
        p1.add(button);
        frame.add(p2);
        frame.setVisible(true);

    }
}