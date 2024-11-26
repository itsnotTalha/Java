import java.util.Scanner;

class Car extends Vehicle {
    Scanner scan = new Scanner(System.in);
    private String password;
    private String carName;
    private double distTravels;
    private int serviceCount;

    Car() {
        System.out.println("Car is created.");
        System.out.print("Create a password: ");
        setPassword(scan.next());
    }
    public void setInfo() {
        System.out.print("Enter your car name: ");
        carName = scan.next();
        System.out.print("Enter your car's Travel distance: ");
        distTravels = scan.nextDouble();
        System.out.print("Enter your car's service count: ");
        serviceCount = scan.nextInt();
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getName(){
        return  carName;
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
