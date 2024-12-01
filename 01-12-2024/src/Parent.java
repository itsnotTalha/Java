public class Parent {
    String name;
    void message(){
        System.out.println("Welcome to Parent class.");
    }
}
class Child extends Parent{
    String name;
    public Child(String a, String b){
        super.name=a;
        this.name=b;
    }
    void show(){
        System.out.println("Superclass's name: "+super.name+"; subclass's name: "+this.name);
    }
    void message(){
        System.out.println("Welcome to child class.");
    }
    void display(){
        message();
        super.message();
    }
    public static void main(String[] args) {
        Child s = new Child("Parent", "Child");
        s.show();
        s.display();
    }
}
