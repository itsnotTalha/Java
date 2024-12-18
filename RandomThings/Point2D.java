class Point2D
{ int x, y;
    public Point2D(int x, int y)
    { this.x = x; this.y = y; System.out.println("Point2D constructor"); }
    public void Display()
    {
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
         }
}
    class Point3D extends Point2D{
    int z;
       public Point3D(int x, int y){
           super(x,y);
       }

        public static void main(String[] args) {
            Point2D p1 = new Point2D(01,11);
            p1.Display();
        }
    }
