import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setInfo();
        Car car = new Car();
        car.setInfo();
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Show vehicle info\n2. Show available vehicle\n3. Exit");
        int choice = scan.nextInt();
        if(choice ==1){
            bike.display();
            car.display();
        }else if (choice == 2){
            bike.availVehcs();
            car.availVehcs();
        }else{

        }
    }
}
