import java.util.Scanner;

public class Storage {
        public String pName, pAge, pGender, pSerial;
        public String sName, sGender;
        public String dName, dDegree, dSerial;
        private  String password, user_ID;

        public  void setUser_ID(String uID) {
            user_ID = uID;
        }

        public  void setPassword(String pass) {
            password = pass;
        }

        public  String getUser_ID() {
            return user_ID;
        }

        public  String getPassword() {
            return password;
        }
        public boolean setPassID(){
            System.out.print("Enter your ID: ");
            user_ID=Home.scan.nextLine();
            System.out.print("Enter your Password: ");
            setPassword(Home.scan.nextLine());
            if(password.length()<5){
                System.out.println("Password is too short, it must be at least 5 characters.");
                return false;
            }else{
                return true;
            }
        }

        public boolean checkPass(){
            if(Home.getTempID().equals(user_ID)){
                if(Home.getTempPass().equals(password)){
                    return true;
                }
            }
            return false;
        }

        public void changePass(){
            String temp;
            System.out.println("Enter your new Username and Password-");
            Home.login();
            System.out.println("Enter your password to confirm the change: ");
            temp = Home.scan.nextLine();
            if(temp.equals(password)){
                password= Home.getTempPass();
                user_ID= Home.getTempID();
                System.out.println("Id & Password changed successfully");
            }else{
                System.out.println("Password did not match");
            }
        }


    }
