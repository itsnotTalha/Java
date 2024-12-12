import java.util.Scanner;

public class Candidate {
    Scanner scan = new Scanner(System.in);
    public int RNo;
    public String Name;
    public double Score;
    public String Remarks;

    public void AssignRem(){
        if (Score>=50){
            Remarks="Selected";
        }else{
            Remarks="Not Selected";
        }
    }
    public void ENTER(){
        System.out.println("Enter RNo: ");
        RNo=scan.nextInt();
        System.out.println("Enter name: ");
        Name=scan.nextLine();
        Name=scan.nextLine();
        System.out.println("Enter score: ");
        Score=scan.nextDouble();
        AssignRem();
    }

    public void Display(){
        System.out.println("Name: "+Name);
        System.out.println("RNo: "+RNo);
        System.out.println("Score: "+Score);
        System.out.println("Remarks: "+Remarks);
    }

    public static void main(String[] args) {
        Candidate s1 = new Candidate();
        s1.ENTER();
        s1.Display();
    }
}
