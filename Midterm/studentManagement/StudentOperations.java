package studentManagement;
import studentDetails.GraduateStudent;
import studentDetails.Student;

public class StudentOperations {
    public static double calculateAverage(Student student){
        double avgMark= (double) (student.getMarks1() + student.getMarks2() + student.getMarks3()) /3;
        return avgMark;
    }
    public static double calculateAverage(Student student1, Student student2){
        double avgMark = (double)(student1.getMarks1()+ student1.getMarks2()+ student1.getMarks3()+ student2.getMarks1()+ student2.getMarks2()+ student2.getMarks3())/6;
        return avgMark;
    }
    public static void generateReport(Student student){
        System.out.println("\n\t\tREPORT of "+student.getName());
        student.getDetails();
        System.out.println("Average mark: "+calculateAverage(student));
    }

    public static void generateReport(Student [] students){
        for(Student x : students){
                generateReport(x);
        }
    }
}
