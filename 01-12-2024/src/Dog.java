public class Dog extends Animal {
    public Dog(String a, String b) {
        super(a, b);
    }

    public void makeSound() {
        System.out.println(name + " is barking");
    }
}
