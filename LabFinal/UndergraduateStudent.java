import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UndergraduateStudent extends Student implements Recordable{
    public UndergraduateStudent(String name , String roll, double s1, double s2, double s3){
        super(name,roll,s1,s2,s3);
    }
    public double calculateAverage(){
        avg=(subject1+subject2+subject3)/3;
        return avg;
    }
    public void generateGrade(){
        if(avg>=90){
            grade = "A";
        } else if (avg<90&&avg>=80) {
            grade = "B";
        }else if (avg<80&&avg>=70) {
            grade = "C";
        }else if (avg<70&&avg>=60) {
            grade = "B";
        }else if (avg<60) {
            grade = "F";
        }
    }

    public void saveRecordToFile() {
        ArrayList<String> c = new ArrayList<>();
        PrintWriter pw=null;
        FileWriter fw = null;
        Scanner scanner = null;
        try{
            pw = new PrintWriter(new FileWriter("StudentRecords.txt",true));
        }catch (FileNotFoundException e){
            System.out.println("Unable to create a new File.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (pw != null) {
           pw.println("Name: "+name);
           pw.println("Roll: "+rollNumber);
           pw.println("Marks: "+subject1+", "+subject2+", "+subject3);
           pw.println("Average: "+avg);
           pw.println("Grade: "+grade);
        pw.close();
        }
    }
}
