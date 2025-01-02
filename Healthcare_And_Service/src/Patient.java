import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Patient extends Storage implements Hospital{
    Random random = new Random();

    //constructor
    public Patient(String name, String age, String gender){
        pName=name;
        pAge=age;
        pGender=gender;
        setSl();
    }
    // to set serial
    public void setSl()
    {
        pSerial="#P."+sl+new Random().nextInt(100);
    }

    public void getDetails(){
        System.out.println("Patient's Name: "+pName);
        System.out.println("Age: "+pAge);
        System.out.println("Gender: "+pGender);
        System.out.println("Serial number: "+pSerial);
    }
    // To generate medical report
    private void setMed(Doctor doctor){
        getDetails();
        System.out.println("Under Control of - ");
        doctor.getDetails();
        System.out.println("Next appointment: "+(random.nextInt(31)+1)+"-"+(random.nextInt(12)+1)+"-"+(random.nextInt(20)+2024));
        System.out.println("Consultant history: "+random.nextInt(50));
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
