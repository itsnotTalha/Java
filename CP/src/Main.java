import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> name1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<n; i++){
            int temp=0;
            name.add(sc.nextLine());
            for(int j =0; j<n; j++){
                if(name.get(i).equals(name.get(j))){
                    temp++;
                    //break;
                }
            }
            if(temp==1){
                name1.add("OK");
            }else{
                name1.add(name.get(i)+"1");
            }
        }
        for(String x : name1){
            System.out.println(x);
        }
    }
}