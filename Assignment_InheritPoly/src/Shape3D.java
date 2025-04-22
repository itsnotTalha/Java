public class Shape3D extends Shape2D{
    public int height;
    Shape3D(int length, int width, int height){
        super(length, width);
        this.height=height;
    }
    public double volume(){
        return area()*height;
    }
    public double surfaceArea(){
        return 2*((length*width)+(width*height*height*length));
    }
}
