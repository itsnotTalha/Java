import java.util.Scanner;

public class Garment {
    Scanner scan = new Scanner(System.in);
    public String GCode;
    public String GType;
    public int GSize;
    public String GFabric;
    public double GPrice;

    public void Assign(){
        if(GFabric.equals("COTTON")){
            if(GType.equals("Trouser")){
                GPrice=1300;
            } else if (GType.equals("Shirt")) {
                GPrice=1100;
            }
        }else{
            if(GType.equals("Trouser")){
                GPrice=1300-130;
            } else if (GType.equals("Shirt")) {
                GPrice=1100-110;
            }
        }
    }

    public Garment(){
        GCode=GType=GFabric="Not Allowed";
        GSize=0;
        GPrice=0.0;
    }

    public void Input(){
        System.out.println("GCode: ");
        GCode=scan.next();
        System.out.println("GType: ");
        GType= scan.next();
        System.out.println("GFabric: ");
        GFabric= scan.next();
        System.out.println("GSize: ");
        GSize= scan.nextInt();
        Assign();
    }

    public void display(){
        System.out.println("GCode: "+GCode);
        System.out.println("GType: "+GType);
        System.out.println("GFabric: "+GFabric);
        System.out.println("GSize: "+GSize);
        System.out.println("GPrice: "+GPrice);
    }

    public static void main(String[] args) {
        Garment g1 = new Garment();
        g1.Input();
        g1.display();
    }
}