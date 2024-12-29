package studentDetails;

import java.util.Scanner;

public class GraduateStudent extends Student {
    Scanner scan = new Scanner(System.in);
    public String researchTopic;
    public GraduateStudent(String researchTopic){
        this.researchTopic=researchTopic;
        System.out.println("Enter name: ");
        setName(scan.nextLine());
        System.out.println("Enter Roll: ");
        setRollNumber(scan.nextInt());
        System.out.println("Enter Marks1: ");
        setMarks1(scan.nextInt());
        System.out.println("Enter Marks2: ");
        setMarks2(scan.nextInt());
        System.out.println("Enter Marks3: ");
        setMarks3(scan.nextInt());
        calculateCGPA();
    }

   public void getDetails(){
        super.getDetails();
        System.out.println("Research topic: "+researchTopic);
    }
}
