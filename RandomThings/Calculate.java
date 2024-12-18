public class Calculate {
    static int count = 10;
    static {
        System.out.println("Hello");
    }
    static void counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Calculate c1 = new Calculate();
    }
}
