public class Student {
    public String id;
    public String name;
    public double cgpa;
    public int creditCompleted;

    public void display() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's ID: " + id);
        System.out.println("Student's CGPA: " + cgpa);
        System.out.println("Student's Completed Credit: " + creditCompleted);
    }

}
