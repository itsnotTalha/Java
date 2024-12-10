public class CARRENTAL {
    //CARRENTAL
    int CarId;
    String CarType;
    double Rent;

    public void GetCar(int id, String type){
        CarId=id;
        CarType=type;
    }

    double GetRent(){
        if(CarType.equals("Small Car")){
            Rent = 1000;
            return Rent;
        }else if(CarType.equals("Van")){
            Rent = 800;
            return Rent;
        }else if(CarType.equals("SUV")){
            Rent = 2500;
            return Rent;
        }else {
            return 0;
        }
    }

    void ShowCar(){
        System.out.println("Car ID: "+CarId);
        System.out.println("Car Type: "+CarType);
        System.out.println("Car Rent: "+Rent);
    }

    public static void main(String[] args) {
        CARRENTAL car1 = new CARRENTAL();
        car1.GetCar(11, "SUV");
        double rent = car1.GetRent();
        car1.ShowCar();
    }
}
