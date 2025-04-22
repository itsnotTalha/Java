public class Rectangle extends Shape2D {
    Rectangle(int length, int width){
        super(length, width);
    }
    public double diagonal(){
        return (double)Math.sqrt(Math.pow(length, 2)+Math.pow(width,2));
    }
}
