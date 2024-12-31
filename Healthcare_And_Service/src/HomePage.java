import java.util.Random;
import java.util.Scanner;

public class HomePage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean wheel = true;

        Home h = new Home();

    Doctor [] list = new Doctor[10];

        while (wheel) {
            int choice, temp;
            System.out.println("[1] Later.Patient");
            System.out.println("[2] Later.Doctor");
            System.out.println("[3] Later.Stuff");
            System.out.println("[0] Quit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("[1] Registration");
                    System.out.println("[2] Sign in");
                    System.out.print("Enter your choice: ");
                    temp = scan.nextInt();
                    switch (temp) {
                        case 1:
                            if (h.sign_up()) {
                                System.out.println("Registration completed successfully");
                            } else {
                                System.out.println("Registration failed!");
                            }
                            break;
                        case 2:
                            if (h.login()) {
                                System.out.println("Welcome back " + h.name);
                            } else {
                                System.out.println("Wrong credential, try again.");
                            }
                            break;
                        default:
                            System.out.println("Something went wrong!");
                    }
                    break;
                case 2:
                    System.out.println("-------------------------------------------------");
                    System.out.println("-----------------List of Doctors-----------------");
                    System.out.println("-------------------------------------------------");
                    for(Doctor x : list){
                    x = new Doctor(new Random().nextInt(99999)+"", new Random().nextInt(5555)+"");
                    x.getDetails();
                    }
                    break;
                case 3:
                    System.out.println("-------------------------------------------------");
                    System.out.println("------------------List of Later.Stuff------------------");
                    System.out.println("-------------------------------------------------");
                    break;
                case 0:
                    System.out.println("Quitting...");
                    wheel = false;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
