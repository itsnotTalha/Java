import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Person> a2 = new ArrayList<>();
        PrintWriter pw;
        FileWriter fw;
        try {
            pw = new PrintWriter(new File("Output.txt"));
            //fw = new FileWriter(new File("Output.txt"),true);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        a1.add(10);
        a1.add(12);
        a1.add(15);
        a1.add(13);
        a1.add(20);

        a2.add(new Person("Talha",10));
        a2.add(new Person("Muhit",80));
        a2.add(new Person("Jubayer",60));
        a2.add(new Person("Talha Jubayer",90));

        a1.sort(Comparator.comparing(Integer::intValue));
        System.out.println(a1);

        a2.sort(cm1);
        for(Person x : a2){
            pw.println(x.age);
        }
        a2.sort(cm2);
        for(Person x : a2){
          pw.println(x.name);
        }
pw.close();
        //fw.close();

        System.out.println("Hello world!");
       // Frame f1 = new Frame();
    }
    public static Comparator<Person> cm1 = new Comparator<Person>() {
        public int compare(Person o1, Person o2) {
            int a;
            if(o1.age> o2.age){
                a=1;
            } else if (o1.age< o2.age) {
                a=-1;
            }else {
                a=0;
            }
            return a;
        }
    };
    public static Comparator<Person> cm2 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int a;
              a = o1.name.compareTo(o2.name);
            return -a;
        }
    };
}