public class Main {
    public static void main(String[] args) {
        Student student = new Student("Islami");
        General general = new General("Islami");
        student.purchase(100);
        general.purchase(500);
        student.display();
        general.display();
    }
}