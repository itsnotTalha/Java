public abstract class Student implements Recordable {
    public  String name, rollNumber, grade;
    public double subject1;
    public double subject2;
    public double subject3;
    public double avg=0.0;

    public Student(String name, String rollNumber, double subject1, double subject2, double subject3){
        this.name=name;
        this.rollNumber= rollNumber;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public abstract double calculateAverage();
    public abstract void generateGrade();
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+rollNumber);
        System.out.println("Marks: "+subject1+", "+subject2+", "+subject3);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
    }
}
