import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JossCalc {
    JFrame frame = new JFrame("JossCalc");
    String  str1, str2;
    double num1=0.0,num2=0.0;
    Object temp;
    JossCalc(){
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,490);
        frame.getContentPane().setBackground(Color.BLACK);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.BLACK);
        p1.setBounds(10,10,265,120);
        TextField t1 = new TextField();
        t1.setSize(263,70);
        t1.setFont(new Font("Arial", Font.BOLD, 20));
        TextField t2 = new TextField("0.0");
        t2.setSize(263,40);
        t2.setBounds(0,75,196,45);
        t2.setFont(new Font("Arial", Font.BOLD, 20));

        JButton clr = new JButton("CLR");
        clr.setBounds(205,75,58,45);


        p1.add(t1);
        p1.add(t2);
        p1.add(clr);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,4,10,10));
        p2.setSize(210,290);
        p2.setBounds(10,140,265,300);
        JButton n1 = new JButton("1");
        n1.setFont(new Font("Arial", Font.BOLD, 20));
        n1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "1");
            }
        });
        JButton n2 = new JButton("2");
        n2.setFont(new Font("Arial", Font.BOLD, 20));
        n2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "2");
            }
        });
        JButton n3 = new JButton("3");
        n3.setFont(new Font("Arial", Font.BOLD, 20));
        n3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "3");
            }
        });

        JButton s1 = new JButton("+");
        s1.setFont(new Font("Arial", Font.BOLD, 20));
        s1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp= e.getSource();
                str1=t2.getText();
                num1 = Double.parseDouble(str1);
                try {
                    num1 += Double.parseDouble(t1.getText());
                }
                catch (NumberFormatException ef){
                    num1+=0.0;
                }
                t1.setText("");
                t2.setText(num1+"");
            }
        });

        JButton n4 = new JButton("4");
        n4.setFont(new Font("Arial", Font.BOLD, 20));
        n4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "4");
            }
        });

        JButton n5 = new JButton("5");
        n5.setFont(new Font("Arial", Font.BOLD, 20));
        n5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "5");
            }
        });

        JButton n6 = new JButton("6");
        n6.setFont(new Font("Arial", Font.BOLD, 20));
        n6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "6");
            }
        });

        JButton s2 = new JButton("-");
        s2.setFont(new Font("Arial", Font.BOLD, 20));
        s2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp= e.getSource();
                try {
                    // If t2 is empty, initialize num1 with the value of t1
                    if (t2.getText().equals("0.0")) {
                        num1 = Double.parseDouble(t1.getText());
                    } else {
                        num1 = Double.parseDouble(t2.getText());
                        num1 -= Double.parseDouble(t1.getText());
                    }
                } catch (NumberFormatException ex) {
                    // If t1 or t2 contains invalid input, reset num1 to 0
                    num1 = 0.0;
                }
                t1.setText("");
                t2.setText(num1+"");
            }
        });

        JButton n7 = new JButton("7");
        n7.setFont(new Font("Arial", Font.BOLD, 20));
        n7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "7");
            }
        });

        JButton n8 = new JButton("8");
        n8.setFont(new Font("Arial", Font.BOLD, 20));
        n8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "8");
            }
        });

        JButton n9 = new JButton("9");
        n9.setFont(new Font("Arial", Font.BOLD, 20));
        n9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "9");
            }
        });

        JButton s3 = new JButton("*");
        s3.setFont(new Font("Arial", Font.BOLD, 20));
        s3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1=1.0;
                temp= e.getSource();
                str1=t2.getText();
                if(Double.parseDouble(str1)!=0){
                    num1 = Double.parseDouble(str1);
                }
                try {
                    num1 *= Double.parseDouble(t1.getText());
                }
                catch (NumberFormatException ef){
                    num1*=1.0;
                }
                t1.setText("");
                t2.setText(num1+"");
            }
        });

        JButton n0 = new JButton("0");
        n0.setFont(new Font("Arial", Font.BOLD, 20));
        n0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "0");
            }
        });
        JButton s4 = new JButton("/");
        s4.setFont(new Font("Arial", Font.BOLD, 20));
        s4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //num1=1.1;
                temp= e.getSource();
                str1=t2.getText();
                if (num1!=0){
                num1 = Double.parseDouble(str1);
                    try {
                        num1 /= Double.parseDouble(t1.getText());
                    }
                    catch (NumberFormatException ef){
                        num1=Double.parseDouble(t1.getText());
                    }
                }else{
                    num1 = Double.parseDouble(t1.getText());
                }

                t1.setText("");
                t2.setText(num1+"");
            }
        });
        JButton r1 = new JButton("=");
        r1.setFont(new Font("Arial", Font.BOLD, 20));
        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(temp==s1){
                    str1=t2.getText();
                    num1 = Double.parseDouble(str1);
                    try {
                        num1 += Double.parseDouble(t1.getText());
                    }
                    catch (NumberFormatException ef){
                        num1+=0.0;
                    }
                }
                if(temp==s2){
                    str1=t2.getText();
                    num1 = Double.parseDouble(str1);
                    try {
                    num1-=Double.parseDouble(t1.getText());
                    }
                    catch (NumberFormatException ef){
                        num1-=0.0;
                    }
                }
                if(temp==s3){
                    str1=t2.getText();
                    num1 = Double.parseDouble(str1);
                    try {
                        num1 *= Double.parseDouble(t1.getText());
                    }
                    catch (NumberFormatException ef){
                        num1*=1.0;
                    }
                }
                if(temp==s4){
                    str1=t2.getText();
                    num1 = Double.parseDouble(str1);
                    try {
                        num1 /= Double.parseDouble(t1.getText());
                    }
                    catch (NumberFormatException ef){
                        num1/=1.0;
                    }
                }
                t1.setText("Final Result");
                t2.setText(num1+"");
                num1=0.0;
                str1=null;
            }
        });
        JButton ac = new JButton(".");
        ac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + ".");
            }
        });
        ac.setFont(new Font("Arial", Font.BOLD,20));

        clr.setFont(new Font("Arial", Font.BOLD,12));
        clr.setBackground(Color.RED);
        clr.setForeground(Color.BLACK);
        clr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                num1=0.0;
                str1=null;
                t2.setText(num1+"");
            }
        });

        n1.setFocusable(false);
        n2.setFocusable(false);
        n3.setFocusable(false);
        n4.setFocusable(false);
        n5.setFocusable(false);
        n6.setFocusable(false);
        n7.setFocusable(false);
        n8.setFocusable(false);
        n9.setFocusable(false);
        n0.setFocusable(false);
        s1.setFocusable(false);
        s2.setFocusable(false);
        s3.setFocusable(false);
        s4.setFocusable(false);
        r1.setFocusable(false);
        ac.setFocusable(false);
        clr.setFocusable(false);

        p2.add(n1);
        p2.add(n2);
        p2.add(n3);
        p2.add(s1);
        p2.add(n4);
        p2.add(n5);
        p2.add(n6);
        p2.add(s2);
        p2.add(n7);
        p2.add(n8);
        p2.add(n9);
        p2.add(s3);
        p2.add(n0);
        p2.add(ac);
        p2.add(r1);
        p2.add(s4);
        p2.setBackground(Color.BLACK);

        frame.add(p1);
        frame.add(p2);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JossCalc f3 = new JossCalc();
    }
}
