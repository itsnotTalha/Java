public class Student {
    public int studentId;
    public String studentName;
    public double studentCGPA;

    Student(){}
    Student(int studentId, String studentName, double studentCGPA){
        this.studentCGPA=studentCGPA;
        this.studentName=studentName;
        this.studentId=studentId;
    }

    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA;
    }
}
