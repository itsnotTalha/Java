import java.util.*;

class Vehicle {
    String license;

    Vehicle() {
        license = new Random().nextInt(999999) + "";
        System.out.println("Vehicle is created.");
        System.out.println("License number is " + license);
    }

    public void availVehcs(){
        System.out.println(license);
    }
}

class Bike extends Vehicle {
    Scanner scan = new Scanner(System.in);
    private String password;
    private String bikeName;
    private double distTravels;
    private int serviceCount;

    Bike() {
        System.out.println("Bike is created.");
        System.out.print("Create a password: ");
        setPassword(scan.next());
    }

    public void setInfo() {
        System.out.print("Enter your bike name: ");
        bikeName = scan.next();
        System.out.print("Enter your bike's Travel distance: ");
        distTravels = scan.nextDouble();
        System.out.print("Enter your bike's service count: ");
        serviceCount = scan.nextInt();
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getName(){
        return  bikeName;
    }
    public double getDistTravels(){
        return distTravels;
    }
    public int getServiceCount(){
        return serviceCount;
    }
    public String getPassword(){
        return password;
    }
    public void display(){
        if(checkPass()){
        System.out.println("Vehicle name: "+getName());
        System.out.println("License number: "+license);
        System.out.println("Distance traveled: "+getDistTravels()+"KM.");
        System.out.println("Service count: "+getServiceCount());
        }
    }
    public boolean checkPass() {
        int count = 3;
        while (count > 0) {
            System.out.print("Enter Your password: ");
            String pass = scan.next();

            if (pass.equals(getPassword())) {
                return true;  // Correct password, return true
            } else {
                count--;
                System.out.println("Wrong password. Trials remaining: " + count);
            }
        }
        return false;
    }

}