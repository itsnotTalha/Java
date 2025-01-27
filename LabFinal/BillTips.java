import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class BillTips {
    public static void main(String[] args) {
        double billAm=0, tipPercent=0, tipAm=0;
        JFrame frame = new JFrame("BillTips");
        frame.setSize(280,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton b1, b2,b3, b4;
        JTextField t1, t2,t3,t4;
        JLabel l1 , l2 , l3,l4;
        l1 = new JLabel("Bill Amount : ");
        l2 = new JLabel("Tip Percent : ");
        l3 = new JLabel("Calculated Tip : ");
        l4 = new JLabel("Total Amount : ");
       // l3 = new JLabel("     \t  ");
        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t4= new JTextField(10);
        b1= new JButton("Common Tip");
        b2= new JButton("Custom Tip");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double  amount=0,tip =0;
                t2.setText("10%");
                try{
                    amount = Double.parseDouble(t1.getText());
                  // amount/=(10/100);
                    t3.setText(amount*(0.1)+"");
                    t4.setText(amount*(0.1)+amount+"");
                }
                catch (InputMismatchException ex){
                    t3.setText("Invalid Input");
                    t4.setText("Invalid Input");
                }

            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //double  tip =0;
                try{
                   double amount = Double.parseDouble(t1.getText());
                   double tip = Double.parseDouble(t2.getText());
                   tip/=(double) 100;
                  // amount/=(10/100);
                    t2.setText((int)(tip*100)+"%");
                    t3.setText(amount*(tip)+"");
                    t4.setText(amount*(tip)+amount+"");
                }
                catch (InputMismatchException ex){
                    t3.setText("Invalid Input");
                    t4.setText("Invalid Input");
                }

            }
        });

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
        frame.add(l3);
        frame.add(t3);
        frame.add(l4);
        frame.add(t4);
        t3.setEditable(false);
        t4.setEditable(false);

        frame.setVisible(true);
    }
}
