public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("ca", "1", 3.4);
        student[1] = new Student("ab", "3", 2.9);
        student[2] = new Student("bc", "5", 3.3);

        //printing details using for each loop
        for (Student s : student) {
            s.Display();
        }
        //average using for each loop
        double average = 0.0;
        for (Student x : student) {
            average += x.gpa;
        }
        //dividing sum with the size of student. which here is 3
        average /= student.length;

        System.out.println("Average: " + average);


    }
}