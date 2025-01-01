import java.util.Scanner;

public class Home extends Storage {
    //This will the Homepage containing login and signup
    static Scanner scan = new Scanner(System.in);

    static String Name, Age, Gender;
    private static String tempPass, tempID;
    public static String getTempPass(){
        return tempPass;
    }

    public static String getTempID() {
        return tempID;
    }

    public static void sign_up(){
        System.out.println("---REGISTRATION FORM---");
        System.out.print("Enter your name: ");
        Name= scan.nextLine();
        System.out.print("Enter your age: ");
        Age = scan.nextLine();
        System.out.print("Select your Gender: \n[1] Male\t[2] Female\t[3] Helicopter\n : ");
        int genderChoice = scan.nextInt();  // Read the gender choice
        scan.nextLine();
        switch (genderChoice){
            case 1 :
                Gender = "Male";
                break;
            case 2:
                Gender = "Female";
                break;
            default:
                Gender = null;
        }

    }
    public static void login(){

        System.out.print("Enter your User ID: ");
        tempID = Home.scan.nextLine();
        System.out.print("Enter your Password: ");
        tempPass = Home.scan.nextLine();
    }

}