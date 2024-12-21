public class Array {
    public static String s1;
    public static int n1 = 10;
    static{
        System.out.println("HEllo"+n1);
        s1= "Hey";
    }
    public void h1(){
        for(int i =0; i<10 ; i++){
            System.out.println(s1);
        }
    }

    public static void main(String[] args) {
        Array [] a1 = new Array[2];
        a1[0]=new Array();
        a1[1]=new Array();
        a1[0].h1();
    }
}
