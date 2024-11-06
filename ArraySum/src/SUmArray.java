public class SUmArray {
    public static void main(String[] args) {
        int x[] = {1, 6, 3}, y[] = {4, 3, 4};
        //int z[] = new int[3];
        myf(x, y);
        for (int i = 0; i < 3; i++) {
            System.out.println(x[i]);
        }
    }

    public static void myf(int x[], int y[]) {
        for (int i = 0; i < 3; i++) {
            x[i] += y[i];
        }
    }
}
