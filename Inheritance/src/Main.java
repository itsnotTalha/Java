class Vehicle {
    String color;

    public Vehicle() {
        System.out.println("In Vehicle");
        System.out.println(color);
        System.out.println("Vehicle registered");
    }
}

class Car extends Vehicle {
    String model;

    public Car() {
        color = "Red";
        System.out.println("In Car");
        System.out.println("Bhrroom");
        System.out.println(color);
    }
}

class Wheel extends Car {
    public Wheel() {
        model = "AHHHJJ";
        System.out.println("In Wheel");
        System.out.println(color);
        System.out.println(model);
    }
}

public class Main {
    public static void main(String[] args) {
        Wheel car = new Wheel();
        System.out.println(car.color);
        System.out.println(car.model);
    }
}