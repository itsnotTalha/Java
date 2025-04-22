public class Shape2D {
    public int length;
    public int width;
    //constructor
    Shape2D(int length, int width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}
