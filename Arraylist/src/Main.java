import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(1,20);
        a1.add(2,40);

        System.out.println(a1);
        a1.remove(2);
        a1.add(30);
        a1.add(50);
        System.out.println(a1);
        System.out.println(a1.get(1));
        ArrayList<String> a2 =  new ArrayList<>();
        a2.add("Hello");
        a2.add("Hey");
        a2.add("Hi");
        System.out.println(a2);
        for(int i=0; i<a2.size();i++){
            System.out.println(a2.get(i));
        }
        ArrayList<JButton> b1 = new ArrayList<JButton>();
        b1.add(new JButton("H"));
        b1.add(new JButton("I"));
        b1.add(new JButton("T"));
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.add(b1.get(0));
    }
}