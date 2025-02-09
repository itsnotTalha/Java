import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyThread m1 = new MyThread(5,6);
        MyThread m5 = new MyThread(7,6);
        MyThread m6 = new MyThread(3,6);
        MyThread m7 = new MyThread(7,6);
        MyThread m4 = new MyThread(88,6);
        MyThread m3 = new MyThread(0,6);
        MyThread m2 = new MyThread(12,6);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
        m7.start();
        try{
            m1.join();
            m2.join();
            m3.join();
            m4.join();
            m5.join();
            m6.join();
            m7.join();
        } catch (InterruptedException e) {
            System.out.println("IDK What is this");
        }
        ArrayList<MyThread> a1 = new ArrayList<>();
        a1.add(m1);
        a1.add(m2);
        a1.add(m3);
        a1.add(m4);
        a1.add(m5);
        a1.add(m6);
        a1.add(m7);

        a1.sort(cm1);
        for(MyThread x : a1){
            System.out.println(x.sum);
        }
    }
    public static Comparator<MyThread> cm1 =new Comparator<MyThread>(){

        public int compare(MyThread m1, MyThread m2) {
            if(m1.sum<m2.sum){
                return -1;
            }else if(m1.sum>m2.sum){
                return 1;
            }else{
                return 0;
            }
        }
    };
}