public class Bird {
    String type;
    double age;
    double weight;

    public Bird(String type, double age) {
        this.type = type;
        this.age = age;
    }

    public double getWeight(double c, double d) {
        weight = Math.pow(age / c, d);
        return weight;
    }

    public void Display() {
        System.out.println("Bird Type: " + type);
        System.out.println("Bird Age: " + age);
        System.out.println("Bird Weight: " + weight);
    }
}
