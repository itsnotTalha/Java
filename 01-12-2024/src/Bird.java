public class Bird extends Animal {
    public Bird() {
        super();
        name = "Bird";
        species = "Red";
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }

    public void fly() {
        System.out.println(name + " is flying");
    }
}
