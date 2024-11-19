import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter number of student: ");
        n = scan.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Student();
            System.out.print("Enter student's name: ");
            scan.nextLine();
            student[i].name = scan.nextLine();
            System.out.print("Enter student's ID: ");
            student[i].id = scan.next();
            //scan.nextLine();
            System.out.print("Enter student's CGPA: ");
            student[i].cgpa = scan.nextDouble();
            System.out.print("Enter student's Completed Credit: ");
            student[i].creditCompleted = scan.nextInt();
        }
        double max = 0.0;
        //finding maximum cgpa
        for (Student x : student) {
            if (x.cgpa > max) {
                max = x.cgpa;
            }
        }
        //Displaying student info with maximum cgpa
        for (Student x : student) {
            if (x.cgpa == max) {
                x.display();
            }
        }
        //finding average cgpa
        double avg = 0.0;
        for (Student x : student) {
            avg += x.cgpa;
        }
        avg /= student.length;
        System.out.println("Average CGPA of " + (student.length) + " students: " + avg);
    }
}