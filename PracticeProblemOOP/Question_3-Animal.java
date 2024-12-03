public abstract class Animal {
    private int age;
    private double weight;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double ComputePrice(double c);
}

class Goat extends Animal {
    @Override
    public double ComputePrice(double c) {
        double p = Math.pow((Math.pow(getWeight(), 2) / getAge()), c);
        return p;
    }
}

class Sheep extends Animal {
    @Override
    public double ComputePrice(double c) {
        double p = Math.pow((Math.pow(getWeight(), 2) / (c * getAge())), c);
        return p;
    }

    public static void main(String[] args) {
        Animal goat1 = new Goat();
        Animal sheep1 = new Sheep();

        goat1.setAge(2);
        goat1.setWeight(15);
        double price1 = goat1.ComputePrice(0.59);

        sheep1.setAge(3);
        sheep1.setWeight(37);
        double price2 = sheep1.ComputePrice(0.34);

        double average=(price1+price2)/2;
        System.out.println("Average price: "+average);
    }
}
