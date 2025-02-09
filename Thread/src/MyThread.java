public class MyThread extends Thread{
    public int sum=0, a, b;
    public MyThread(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        sum=a+b;
    }
}
