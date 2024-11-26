class Hello {
    String name;
    int age;
    double weight;

    public Hello() {
        System.out.println("Hello from the other side");
    }
}

class People extends Hello {
    String skin;
    //int age;

    public People(String skin, String name) {
        System.out.println("Hello from inside");
        this.skin = skin;
        super.name = name;
    }
    public void display() {
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(super.weight);
        System.out.println(this.skin);
    }
}

