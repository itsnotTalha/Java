public abstract class Employee {
    private int experience;
    private double score;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public abstract double FindFindSalary(double c);
}

class Officer extends Employee {
    public double FindFindSalary(double c) {
        double s = getExperience() * Math.pow(getScore(), c);
        return s;
    }
}

class Manager extends Employee {
    public double FindFindSalary(double c) {
        double s = Math.pow((getExperience() * getScore() / c), c);
        return s;
    }

    public static void main(String[] args) {
        Employee Officer_1 = new Officer();
        Employee Manager_1 = new Manager();
        Officer_1.setExperience(5);
        Officer_1.setScore(85);
        double salary1 = Officer_1.FindFindSalary(0.9);
        System.out.println("Officer 1's Salary: " + salary1);

        Manager_1.setExperience(9);
        Manager_1.setScore(68);
        double salary2 = Manager_1.FindFindSalary(0.21);
        System.out.println("Manager 1's salary: " + salary2);

        double AverageSalary = (salary1 + salary2) / 2;
        System.out.println("Average salary: " + AverageSalary);
    }
}