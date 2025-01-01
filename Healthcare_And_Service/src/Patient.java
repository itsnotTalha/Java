import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Patient extends Storage{
    public Patient(String name, String age, String gender){
        pName=name;
        pAge=age;
        pGender=gender;
    }
    Random random = new Random();
    public void getDetails(){
        System.out.println("Patient's Name: "+pName);
        System.out.println("Age: "+pAge);
        System.out.println("Gender: "+pGender);
    }
    private void setMed(Doctor doctor){
        getDetails();
        System.out.println("Under Control of - ");
        doctor.getDetails();
        System.out.println("Next appointment: "+(random.nextInt(31)+1)+"-"+(random.nextInt(12)+1)+"-"+(random.nextInt(99)+2024));
        System.out.println("Consultant history: "+random.nextInt(100));
    }
    public void getReport(Doctor doctor){
        String pass;
        System.out.print("Enter patient's Password: ");
        pass = new Scanner(System.in).next();
        if(pass.equals(getPassword())){
            setMed(doctor);
        }else{
            System.out.println("You're not allowed!");
        }
    }
}
