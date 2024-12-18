public class Shape {
    void draw(){
        System.out.println("drawing...");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("drawing Tri...");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing Rec...");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle...");
    }
}
class Test{
    public static void main(String[] args) {
        Shape [] s= new Shape[3];
        s[0]=new Rectangle();
        s[1]= new Circle();
        s[2] = new Triangle();

        for(Shape x: s){
            x.draw();
        }
    }
}
