import java.util.Scanner;

public class Home extends Storage {
    //This will the Homepage containing login and signup
    Scanner scan = new Scanner(System.in);
    public String name;
    public int age;


    public boolean sign_up(){
        System.out.print("Enter your name: ");
        name= scan.nextLine();
        System.out.print("Enter your age: ");
        age= scan.nextInt();
        System.out.print("Enter your ID: ");
        setUser_ID(scan.next());
        System.out.print("Enter your Password: ");
        setPassword(scan.next());
        if(getPassword().length()<5){
        return false;
        }else{
        return true;
        }
    }

    public boolean login(){
        String tempPass, tempID;
        System.out.print("Enter your User ID: ");
        tempID = scan.next();
        System.out.print("Enter your Password: ");
        tempPass = scan.next();
        if(tempID.equals(getUser_ID())){
            if(tempPass.equals(getPassword())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}