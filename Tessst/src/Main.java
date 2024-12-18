class A{
   int i=10;
    static{

        System.out.println("Heyy there");
    }
}
class B extends A{
    static {
        System.out.println("Hello");
    }
}
class c extends B{
    int i =5;
    static {
        System.out.println("YEssir");
    }
    {
        System.out.println("Bruhhh");
    }
    void display(){
        System.out.println(super.i);
    }
    public static void main(String[] args) {
        c d = new c();
        d.display();
        System.out.println("Hello, World!");
    }
}
public class Main {

}