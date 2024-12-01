public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", "Black");
        dog.makeSound();
        dog.eat();
        System.out.println(dog.species);

        System.out.println();

        Animal tiger = new Tiger();
        tiger.eat();
        tiger.makeSound();
        ((Tiger) tiger).swim();

        System.out.println();

        Animal bird = new Bird();
        bird.eat();
        bird.makeSound();
        ((Bird) bird).fly();
    }
}