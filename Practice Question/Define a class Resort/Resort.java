import java.util.Scanner;

public class Resort {
    Scanner scan = new Scanner(System.in);
    public int RNo;
    public String Name;
    public double Charges;
    public int Days;

    public double Compute(){
        if ((Days*Charges)>11000){
            return Days*Charges;
        }else{
            return 1.02*Days*Charges;
        }
    }
    public void Getinfo(){
        System.out.println("Enter name: ");
        Name= scan.nextLine();
        System.out.println("RNo: ");
        RNo= scan.nextInt();
        System.out.println("Charges: ");
        Charges = scan.nextDouble();
        System.out.println("Days: ");
        Days= scan.nextInt();
    }
    public void DispInfo(){
        System.out.println("Name: "+Name);
        System.out.println("RNo: "+RNo);
        System.out.println("Charges: "+Charges);
        System.out.println("Amount: "+Compute());
    }

    public static void main(String[] args) {
        Resort r1 = new Resort();
        r1.Getinfo();
        r1.DispInfo();
    }
}
