public class Product {
    public String name;
    public double price;
    public int quantity;
    public Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public double getTotalPrice(){
        return price*quantity;
    }

}
