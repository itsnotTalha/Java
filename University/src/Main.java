public class Main {
    public static void main(String[] args) {

        int [] a = new int[10];
        a[0]=1;
        a[1]=1;
        a[2]=1;
        int occupiedCount = 0;

        // Loop through the array and count elements that are not 0
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                occupiedCount++;
            }
        }
        System.out.println(occupiedCount);
    }
}