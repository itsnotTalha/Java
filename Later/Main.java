package Later;

import java.util.Random;

interface Hospital {
    String sl = "UIUHC"; // Static and final by default

    void setSerial(); // Abstract method
}

abstract class Stuff implements Hospital {
    private String name;
    private String gender;
    private String serial;

    // Constructor: Parameterized
    public Stuff(String name, String gender) {
        this.name = name;
        this.gender = gender;
        setSerial(); // Set serial when created
    }

    // Constructor: Non-parameterized
    public Stuff() {
        setSerial(); // Set serial when created
    }

    // Implement setSerial from Later.Hospital interface
    public void setSerial() {
        this.serial = sl + new Random().nextInt(100);
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter for serial (no setter, as serial is auto-generated)
    public String getSerial() {
        return serial;
    }

    // Method to print details
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Serial: " + serial);
    }
}

class Patient extends Stuff {
    private String Pname;
    private String Pgender;
    private String bloodGroup;
    private String patientID;
    private int age;

    // Constructor: Parameterized
    public Patient(String name, String gender, String Pname, String bloodGroup) {
        super(name, gender);
        this.Pname = Pname;
        this.bloodGroup = bloodGroup;
        setSerial(); // Set patientID when created
    }

    // Constructor: Non-parameterized
    public Patient() {
        setSerial(); // Set patientID when created
    }

    // Override setSerial
    @Override
    public void setSerial() {
        this.patientID = sl + new Random().nextInt(100);
    }

    // Getter and Setter for Pname
    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    // Getter and Setter for Pgender
    public String getPgender() {
        return Pgender;
    }

    public void setPgender(String Pgender) {
        this.Pgender = Pgender;
    }

    // Getter and Setter for bloodGroup
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter for patientID (no setter, as patientID is auto-generated)
    public String getPatientID() {
        return patientID;
    }

    // Method to print details
    @Override
    public void getDetails() {
        super.getDetails(); // Call parent's getDetails
        System.out.println("Later.Patient Name: " + Pname);
        System.out.println("Later.Patient Gender: " + Pgender);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Later.Patient ID: " + patientID);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Stuff {
    private String Dname;
    private String doctorID;
    private String degree;

    // Constructor: Parameterized
    public Doctor(String name, String gender, String Dname, String degree) {
        super(name, gender);
        this.Dname = Dname;
        this.degree = degree;
        setSerial(); // Set doctorID when created
    }

    // Constructor: Non-parameterized
    public Doctor() {
        setSerial(); // Set doctorID when created
    }

    // Override setSerial
    @Override
    public void setSerial() {
        this.doctorID = sl + new Random().nextInt(100);
    }

    // Getter and Setter for Dname
    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    // Getter and Setter for degree
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    // Getter for doctorID (no setter, as doctorID is auto-generated)
    public String getDoctorID() {
        return doctorID;
    }

    // Method to print details
    @Override
    public void getDetails() {
        super.getDetails(); // Call parent's getDetails
        System.out.println("Later.Doctor Name: " + Dname);
        System.out.println("Degree: " + degree);
        System.out.println("Later.Doctor ID: " + doctorID);
    }

    // Method to print patient details (placeholder example)
    public void getPDetails(Patient patient) {
        System.out.println("\nLater.Patient Details:");
        patient.getDetails();
    }
}
public class Main{
    public static void main(String[] args){
        Stuff s1 = new Patient("Talha", "Male", "jubayer", "AB");
        s1.getDetails();
        Stuff s2 = new Doctor("X", "Male", "Y", "MBBS");
        s2.getDetails();
        ((Doctor)s2).getPDetails((Patient)s1);
    }
}