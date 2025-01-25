public class Person {
    public int age;
    public String name;
    public Person(String a, int age){
        name = a;
        this.age = age;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
