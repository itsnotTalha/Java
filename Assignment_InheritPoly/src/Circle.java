public class Circle extends Shape2D{
    public int radius;
    Circle(int radius){
        super(radius, radius);
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
