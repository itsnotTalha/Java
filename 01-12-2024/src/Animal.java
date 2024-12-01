public abstract class Animal {
    String name, species;
    double weight;

    public Animal() {
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();
}
