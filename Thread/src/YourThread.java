public class YourThread extends Thread{
    public String name;
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println(i + " From "+name);
            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
    public YourThread(String n){
        name = n;
    }

    public static void main(String[] args) {
        YourThread m1 = new YourThread("T1");
        YourThread m3 = new YourThread("T3");
        YourThread m2 = new YourThread("T2");
        m1.start();
        m2.start();
        m3.start();

        try{
            m1.join();
            m2.join();
            m3.join();
        }
        catch(InterruptedException e){

        }
        System.out.println("Hellooooo");
    }
}
