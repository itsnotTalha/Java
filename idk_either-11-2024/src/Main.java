public class Main {
    public static void main(String[] args) {
        Bird b1 = new Bird("Hamim", 1.5);
        Bird b2 = new Bird("Pigeon", 2.5);
        Bird b3 = new Bird("Peacock", 3.2);

        //getting weight
        b1.getWeight(0.7, 1.5);
        b2.getWeight(0.2, 1.2);
        b3.getWeight(0.9, 1.1);

        //displaying all attributes
        b1.Display();
        b2.Display();
        b3.Display();

    }
}