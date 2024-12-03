public abstract class Vehicle {
    private int Vehicle_ID;

    public abstract int FindTotalPassengers();

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        double total = car.FindTotalPassengers() + bus.FindTotalPassengers() + (12 * train.FindTotalPassengers());
        System.out.println("Total passenger: " + total);
    }
}

class Car extends Vehicle {
    public int FindTotalPassengers() {
        return 4;
    }
}

class Bus extends Vehicle {
    public int FindTotalPassengers() {
        return 50;
    }
}

class Train extends Vehicle {
    public int FindTotalPassengers() {
        return 100;
    }
}
