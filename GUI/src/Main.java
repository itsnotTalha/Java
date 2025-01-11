import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //MyFrame myFrame = new MyFrame();
        JLabel label = new JLabel();
        label.setText("Hello:D");

        JFrame frame = new JFrame();
        frame.setTitle("Testing...");
        frame.setVisible(true);
        frame.setSize(420,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
       // label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

    }
}