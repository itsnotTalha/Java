package studentDetails;

public class Student {
    private String name;
    private int rollNumber;
    private int marks1;
    private int marks2;
    private int marks3;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public double getCgpa() {
        return cgpa;
    }

    public Student(String name, int roll, int m1, int m2, int m3){
        this.name=name;
        rollNumber=roll;
        marks1=m1;
        marks2=m2;
        marks3=m3;
        calculateCGPA();
    }
    public Student(){

    }

    void calculateCGPA(){
        cgpa=(double)(marks1+marks2+marks3)/30;
    }

    public void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+rollNumber);
        System.out.println("Marks1: "+marks1+"; Marks2: "+marks2+"; Marks3: "+marks3);
        System.out.println("CGPA: "+cgpa);
    }
}
