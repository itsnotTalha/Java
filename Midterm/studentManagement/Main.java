package studentManagement;

import studentDetails.GraduateStudent;
import studentDetails.Student;

public class Main {
    public static void main(String[] args) {
        Student [] students = new Student[5];
        students[0]= new Student("S1", 1001, 10, 20, 30);
        students[1]= new Student("S2", 1002, 60, 50, 40);
        students[2]=new Student("S3", 1003, 40, 80, 100);
        students[3]=new GraduateStudent("Environment");
        students[4]=new GraduateStudent("History");

       double d1= StudentOperations.calculateAverage(students[0]);
       double d2 = StudentOperations.calculateAverage(students[1],students[2]);
        System.out.println("Avg mark for ind: "+d1);
        System.out.println("Avg mark for a pair: "+d2);
        StudentOperations.generateReport(students[3]);
        StudentOperations.generateReport(students);
    }
}
