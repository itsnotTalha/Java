public class Rectangle {
    private int length;
    private int breadth;
    public double area(){
        return length*breadth;
    }
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);
        double a1=r1.area();
        double a2 = r2.area();

        System.out.println("Area 1 : "+a1+": Area 2 : "+a2);
    }
}
