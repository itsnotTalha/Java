public class Bird {
    public String type;
    public double age;
    public double weight;

    public void display(int a) {
        System.out.println("Info of Bird " + a + "\nType: " + type + "\nAge: " + age + "\nWeight: " + weight);
    }

    public void getWeight(double c, double d) {
        weight = Math.pow((age / c), d);
    }
}
