public class SUPPLY {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    public void FoodIn(int Code, String FoodName, String Sticker){
        this.Code=Code;
        this.FoodName=FoodName;
        this.Sticker=Sticker;
        GetType();
    }
    public void GetType(){
        if(Sticker.equals("Green")){
            this.FoodType="Vegetarian";
        }else if(Sticker.equals("Yellow")){
            this.FoodType="Contains Egg";
        }else if(Sticker.equals("Red")){
            this.FoodType="Non Vegetarian";
        }else{
            this.FoodType="Unknown";
        }
    }
    public void FoodOut(){
        System.out.println("Code: "+Code);
        System.out.println("Food Name: "+FoodName);
        System.out.println("Food type: "+FoodType);
        System.out.println("Sticker: "+Sticker);
    }

    public static void main(String[] args) {
        SUPPLY f1 = new SUPPLY();
        SUPPLY f2 = new SUPPLY();
        SUPPLY f3 = new SUPPLY();

        f1.FoodIn(1, "Apple", "Green");
        f1.FoodOut();
    }
}
