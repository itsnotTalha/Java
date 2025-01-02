import javax.print.Doc;
import java.util.Random;

public class Doctor extends Storage implements Hospital{
    Doctor (String name, String degree){
        dName = name;
        dDegree = degree;
        setSl();

    }

    public void setSl() {
        dSerial = sl+ new Random().nextInt(999);
    }

    public void getDetails(){
        System.out.println("Doctor's name: "+dName);
        System.out.println("Degree: "+dDegree);
        System.out.println("Serial number: "+dSerial);
        System.out.println();
    }
}
