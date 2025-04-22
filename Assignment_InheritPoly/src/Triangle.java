public class Triangle extends Shape2D{
    Triangle(int base, int height){
        super(base, height);
    }
    public double area(){
        return 0.5*length*width;
    }
    double hypotenuse = Math.sqrt(length * length + width * width);

    public double perimeter() {
        return length + width + hypotenuse;
    }
}
