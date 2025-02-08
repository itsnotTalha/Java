public class MyThread extends Thread {
    private int[] arr;
    private int max;

    public MyThread(int[] arr) {
        this.arr = arr;
        this.max = arr[0]; // Initialize with first element
    }

    @Override
    public void run() {
        for (int i = 1; i < arr.length; i++) { // Start from index 1
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) {
        int[][] arrays = {
                {3, 1, -5, 10},
                {-2, 6, 7, 8, 0},
                {12, -6, 4, 2, 1},
                {10, 5, -9, 18, 7}
        };

        MyThread[] threads = new MyThread[4]; // Use MyThread[], not Thread[]

        // Start threads
        for (int i = 0; i < 4; i++) {
            threads[i] = new MyThread(arrays[i]);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < 4; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Find the maximum among all max values
        int finalMax = threads[0].getMax(); // Start with the first thread's max
        for (int i = 1; i < 4; i++) {
            if (threads[i].getMax() > finalMax) {
                finalMax = threads[i].getMax();
            }
        }

        System.out.println("Final max value is: " + finalMax);
    }
}
