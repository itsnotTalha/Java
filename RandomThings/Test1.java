public class Test1 {
    String s1 = "Eita test er moddhe";
    public void m1 (){
        System.out.println(s1);
    }
}
class Test2 extends Test1{
    String s2 = "Eita testtube er moddhe";
    public void m2(){
        System.out.println(s2);
    }
}
class Test3 extends Test2{
    String s3 = "Janina eita koi";
    public void m3 (){
        System.out.println(s3);
    }
}
abstract class abs{
    public abstract void ass();
}

abstract class ABS1 extends abs{
    {
        System.out.println("ABS1");
    }
}
class ABS2 extends ABS1{
    public void ass(){
        System.out.println("Got it");
    }
}
class cABS extends abs{
    public void ass() {
        System.out.println("From ass");
    }
}
class ST1{
    public static String st1 = "HAHA";
    public static final String st2 = "HAHhahahahaA";
    public static final void mt1(){
        System.out.println(st1);
        System.out.println(st2);
    }
    static {
        System.out.println("HEllo guys iM static mf");
    }
    {
        System.out.println("Object created for ST1");
    }
    public static int a1=10;
    public static final int a2=20;
    public static int add(){
        return a1+a2;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test2();
        Test1 t3 = new Test3();
        ST1 s1 = new ST1();
        abs ass1 = new cABS();

        ass1.ass();
        t1.m1();
        t2.m1();
        ((Test2)t2).m2();
        t3.m1();
        ((Test2)t3).m2();
        ((Test3)t3).m2();
        ((Test3)t3).m3();
        ST1.a1=200;
        System.out.println(ST1.add());
    }
}
