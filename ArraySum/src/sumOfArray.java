public class sumOfArray {
    public static void main(String[] args) {
        int x[]={1,6,3}, y[]={4,3,4};
        int z[] = new int[3];
        myf(x,y,z);
        for(int i=0; i<3; i++){
            System.out.println(z[i]);
        }
    }
    public static void myf(int x[], int y[], int z[]){
        for( int i = 0; i < 3; i++){
            z[i] = x[i]+y[i];
        }
    }
}
