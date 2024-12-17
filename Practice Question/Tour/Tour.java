import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Tour {
    Scanner scan = new Scanner(System.in);
    public String TCode;
    public int NoofAdults;
    public int NoofKids;
    public int Kilometers;
    public double TotalFare;

    public Tour(){
        TCode="NULL";
    }

    public void AssignFare(){
        if(Kilometers>=1000)
        {
            TotalFare=NoofAdults*500+NoofKids*250;
        }
        if(Kilometers>=500 && Kilometers<1000)
        {
            TotalFare=NoofAdults*300+NoofKids*150;
        }
        if(Kilometers<500)
        {
            TotalFare=NoofAdults*200+NoofKids*100;
        }
    }

    public void EnterTour(){
        System.out.println("Enter TCode: ");
        TCode= scan.next();
        System.out.println("Enter NoofAdults: ");
        NoofAdults= scan.nextInt();
        System.out.println("NoofKids: ");
        NoofKids= scan.nextInt();
        System.out.println("Kilometers: ");
        Kilometers= scan.nextInt();
        AssignFare();
    }

    public void Showtour(){
        System.out.println("TCode: "+TCode);
        System.out.println("NoofAdults: "+ NoofAdults);
        System.out.println("NoofKids: "+ NoofKids);
        System.out.println("Kilometers: "+Kilometers);
        System.out.println("Total fare: "+TotalFare);
    }
    public static void main(String[] args) {
        Tour t1 = new Tour();
        t1.EnterTour();
        t1.Showtour();
    }

}
