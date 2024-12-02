import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        choice = scan.nextInt();
        Product [] p = new Product[choice];

        for(int i=0; i<choice;i++){
            String name;
            double price;
            int q;
            System.out.print("Enter Name: ");
            name= scan.next();
            System.out.print("Enter price: ");
            price= scan.nextDouble();
            System.out.print("Enter quantity: ");
            q = scan.nextInt();

            p [i] = new Product(name, price, q);
        }

        double total=0.0;
        for (Product x:p){
            total+=x.getTotalPrice();
        }

        System.out.println("Total bill: "+total);
    }
}