public class Student {
    String name;
    String id;
    double gpa;

    //constructor
    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student() {
    }

    public void Display() {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("GPA: " + this.gpa);
    }
}
